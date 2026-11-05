package twitter4j.auth;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import twitter4j.BASE64Encoder;
import twitter4j.HttpClient;
import twitter4j.HttpClientFactory;
import twitter4j.HttpParameter;
import twitter4j.HttpRequest;
import twitter4j.Logger;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class OAuthAuthorization implements Serializable, Authorization, OAuthSupport {
    private static final String HMAC_SHA1 = "HmacSHA1";
    private static transient HttpClient http = null;
    private static final long serialVersionUID = -886869424811858868L;
    private final Configuration conf;
    private String consumerSecret;
    private static final HttpParameter OAUTH_SIGNATURE_METHOD = new HttpParameter("oauth_signature_method", "HMAC-SHA1");
    private static final Logger logger = Logger.getLogger(OAuthAuthorization.class);
    private static final Random RAND = new Random();
    private String consumerKey = "";
    private String realm = null;
    private OAuthToken oauthToken = null;

    public OAuthAuthorization(Configuration configuration) {
        this.conf = configuration;
        http = HttpClientFactory.getInstance(configuration.getHttpClientConfiguration());
        setOAuthConsumer(configuration.getOAuthConsumerKey(), configuration.getOAuthConsumerSecret());
        if (configuration.getOAuthAccessToken() != null && configuration.getOAuthAccessTokenSecret() != null) {
            setOAuthAccessToken(new AccessToken(configuration.getOAuthAccessToken(), configuration.getOAuthAccessTokenSecret()));
        }
    }

    @Override // twitter4j.auth.Authorization
    public String getAuthorizationHeader(HttpRequest httpRequest) {
        return generateAuthorizationHeader(httpRequest.getMethod().name(), httpRequest.getURL(), httpRequest.getParameters(), this.oauthToken);
    }

    private void ensureTokenIsAvailable() {
        if (this.oauthToken == null) {
            throw new IllegalStateException("No Token available.");
        }
    }

    @Override // twitter4j.auth.Authorization
    public boolean isEnabled() {
        return this.oauthToken != null && (this.oauthToken instanceof AccessToken);
    }

    @Override // twitter4j.auth.OAuthSupport
    public RequestToken getOAuthRequestToken() {
        return getOAuthRequestToken(null, null);
    }

    @Override // twitter4j.auth.OAuthSupport
    public RequestToken getOAuthRequestToken(String str) {
        return getOAuthRequestToken(str, null);
    }

    @Override // twitter4j.auth.OAuthSupport
    public RequestToken getOAuthRequestToken(String str, String str2) {
        if (this.oauthToken instanceof AccessToken) {
            throw new IllegalStateException("Access token already available.");
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(new HttpParameter("oauth_callback", str));
        }
        if (str2 != null) {
            arrayList.add(new HttpParameter("x_auth_access_type", str2));
        }
        this.oauthToken = new RequestToken(http.post(this.conf.getOAuthRequestTokenURL(), (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()]), this, null), this);
        return (RequestToken) this.oauthToken;
    }

    @Override // twitter4j.auth.OAuthSupport
    public AccessToken getOAuthAccessToken() {
        ensureTokenIsAvailable();
        if (this.oauthToken instanceof AccessToken) {
            return (AccessToken) this.oauthToken;
        }
        this.oauthToken = new AccessToken(http.post(this.conf.getOAuthAccessTokenURL(), null, this, null));
        return (AccessToken) this.oauthToken;
    }

    @Override // twitter4j.auth.OAuthSupport
    public AccessToken getOAuthAccessToken(String str) {
        ensureTokenIsAvailable();
        this.oauthToken = new AccessToken(http.post(this.conf.getOAuthAccessTokenURL(), new HttpParameter[]{new HttpParameter("oauth_verifier", str)}, this, null));
        return (AccessToken) this.oauthToken;
    }

    @Override // twitter4j.auth.OAuthSupport
    public AccessToken getOAuthAccessToken(RequestToken requestToken) {
        this.oauthToken = requestToken;
        return getOAuthAccessToken();
    }

    @Override // twitter4j.auth.OAuthSupport
    public AccessToken getOAuthAccessToken(RequestToken requestToken, String str) {
        this.oauthToken = requestToken;
        return getOAuthAccessToken(str);
    }

    @Override // twitter4j.auth.OAuthSupport
    public AccessToken getOAuthAccessToken(String str, String str2) throws TwitterException {
        try {
            String oAuthAccessTokenURL = this.conf.getOAuthAccessTokenURL();
            if (oAuthAccessTokenURL.indexOf("http://") == 0) {
                oAuthAccessTokenURL = "https://" + oAuthAccessTokenURL.substring(7);
            }
            this.oauthToken = new AccessToken(http.post(oAuthAccessTokenURL, new HttpParameter[]{new HttpParameter("x_auth_username", str), new HttpParameter("x_auth_password", str2), new HttpParameter("x_auth_mode", "client_auth")}, this, null));
            return (AccessToken) this.oauthToken;
        } catch (TwitterException e) {
            throw new TwitterException("The screen name / password combination seems to be invalid.", e, e.getStatusCode());
        }
    }

    @Override // twitter4j.auth.OAuthSupport
    public void setOAuthAccessToken(AccessToken accessToken) {
        this.oauthToken = accessToken;
    }

    public void setOAuthRealm(String str) {
        this.realm = str;
    }

    String generateAuthorizationHeader(String str, String str2, HttpParameter[] httpParameterArr, String str3, String str4, OAuthToken oAuthToken) throws NoSuchAlgorithmException, InvalidKeyException {
        if (httpParameterArr == null) {
            httpParameterArr = new HttpParameter[0];
        }
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new HttpParameter("oauth_consumer_key", this.consumerKey));
        arrayList.add(OAUTH_SIGNATURE_METHOD);
        arrayList.add(new HttpParameter("oauth_timestamp", str4));
        arrayList.add(new HttpParameter("oauth_nonce", str3));
        arrayList.add(new HttpParameter("oauth_version", "1.0"));
        if (oAuthToken != null) {
            arrayList.add(new HttpParameter("oauth_token", oAuthToken.getToken()));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() + httpParameterArr.length);
        arrayList2.addAll(arrayList);
        if (!HttpParameter.containsFile(httpParameterArr)) {
            arrayList2.addAll(toParamList(httpParameterArr));
        }
        parseGetParameters(str2, arrayList2);
        StringBuilder sbAppend = new StringBuilder(str).append("&").append(HttpParameter.encode(constructRequestURL(str2))).append("&");
        sbAppend.append(HttpParameter.encode(normalizeRequestParameters(arrayList2)));
        String string = sbAppend.toString();
        logger.debug("OAuth base string: ", string);
        String strGenerateSignature = generateSignature(string, oAuthToken);
        logger.debug("OAuth signature: ", strGenerateSignature);
        arrayList.add(new HttpParameter("oauth_signature", strGenerateSignature));
        if (this.realm != null) {
            arrayList.add(new HttpParameter("realm", this.realm));
        }
        return "OAuth " + encodeParameters(arrayList, ",", true);
    }

    private void parseGetParameters(String str, List list) {
        int iIndexOf = str.indexOf("?");
        if (-1 != iIndexOf) {
            str.split("&");
            try {
                for (String str2 : str.substring(iIndexOf + 1).split("&")) {
                    String[] strArrSplit = str2.split("=");
                    if (strArrSplit.length == 2) {
                        list.add(new HttpParameter(URLDecoder.decode(strArrSplit[0], "UTF-8"), URLDecoder.decode(strArrSplit[1], "UTF-8")));
                    } else {
                        list.add(new HttpParameter(URLDecoder.decode(strArrSplit[0], "UTF-8"), ""));
                    }
                }
            } catch (UnsupportedEncodingException e) {
            }
        }
    }

    String generateAuthorizationHeader(String str, String str2, HttpParameter[] httpParameterArr, OAuthToken oAuthToken) {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        return generateAuthorizationHeader(str, str2, httpParameterArr, String.valueOf(RAND.nextInt() + jCurrentTimeMillis), String.valueOf(jCurrentTimeMillis), oAuthToken);
    }

    public List generateOAuthSignatureHttpParams(String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new HttpParameter("oauth_consumer_key", this.consumerKey));
        arrayList.add(OAUTH_SIGNATURE_METHOD);
        arrayList.add(new HttpParameter("oauth_timestamp", jCurrentTimeMillis));
        arrayList.add(new HttpParameter("oauth_nonce", RAND.nextInt() + jCurrentTimeMillis));
        arrayList.add(new HttpParameter("oauth_version", "1.0"));
        if (this.oauthToken != null) {
            arrayList.add(new HttpParameter("oauth_token", this.oauthToken.getToken()));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        arrayList2.addAll(arrayList);
        parseGetParameters(str2, arrayList2);
        StringBuilder sbAppend = new StringBuilder(str).append("&").append(HttpParameter.encode(constructRequestURL(str2))).append("&");
        sbAppend.append(HttpParameter.encode(normalizeRequestParameters(arrayList2)));
        arrayList.add(new HttpParameter("oauth_signature", generateSignature(sbAppend.toString(), this.oauthToken)));
        return arrayList;
    }

    String generateSignature(String str, OAuthToken oAuthToken) throws NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec secretKeySpec;
        try {
            Mac mac = Mac.getInstance(HMAC_SHA1);
            if (oAuthToken == null) {
                secretKeySpec = new SecretKeySpec((HttpParameter.encode(this.consumerSecret) + "&").getBytes(), HMAC_SHA1);
            } else {
                secretKeySpec = oAuthToken.getSecretKeySpec();
                if (secretKeySpec == null) {
                    secretKeySpec = new SecretKeySpec((HttpParameter.encode(this.consumerSecret) + "&" + HttpParameter.encode(oAuthToken.getTokenSecret())).getBytes(), HMAC_SHA1);
                    oAuthToken.setSecretKeySpec(secretKeySpec);
                }
            }
            mac.init(secretKeySpec);
            return BASE64Encoder.encode(mac.doFinal(str.getBytes()));
        } catch (InvalidKeyException e) {
            logger.error("Failed initialize \"Message Authentication Code\" (MAC)", e);
            throw new AssertionError(e);
        } catch (NoSuchAlgorithmException e2) {
            logger.error("Failed to get HmacSHA1 \"Message Authentication Code\" (MAC)", e2);
            throw new AssertionError(e2);
        }
    }

    String generateSignature(String str) {
        return generateSignature(str, null);
    }

    static String normalizeRequestParameters(HttpParameter[] httpParameterArr) {
        return normalizeRequestParameters(toParamList(httpParameterArr));
    }

    private static String normalizeRequestParameters(List list) {
        Collections.sort(list);
        return encodeParameters(list);
    }

    private static List toParamList(HttpParameter[] httpParameterArr) {
        ArrayList arrayList = new ArrayList(httpParameterArr.length);
        arrayList.addAll(Arrays.asList(httpParameterArr));
        return arrayList;
    }

    public static String encodeParameters(List list) {
        return encodeParameters(list, "&", false);
    }

    public static String encodeParameters(List list, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HttpParameter httpParameter = (HttpParameter) it.next();
            if (!httpParameter.isFile()) {
                if (sb.length() != 0) {
                    if (z) {
                        sb.append("\"");
                    }
                    sb.append(str);
                }
                sb.append(HttpParameter.encode(httpParameter.getName())).append("=");
                if (z) {
                    sb.append("\"");
                }
                sb.append(HttpParameter.encode(httpParameter.getValue()));
            }
        }
        if (sb.length() != 0 && z) {
            sb.append("\"");
        }
        return sb.toString();
    }

    static String constructRequestURL(String str) {
        int iIndexOf = str.indexOf("?");
        if (-1 != iIndexOf) {
            str = str.substring(0, iIndexOf);
        }
        int iIndexOf2 = str.indexOf("/", 8);
        String lowerCase = str.substring(0, iIndexOf2).toLowerCase();
        int iIndexOf3 = lowerCase.indexOf(":", 8);
        if (-1 != iIndexOf3) {
            if (lowerCase.startsWith("http://") && lowerCase.endsWith(":80")) {
                lowerCase = lowerCase.substring(0, iIndexOf3);
            } else if (lowerCase.startsWith("https://") && lowerCase.endsWith(":443")) {
                lowerCase = lowerCase.substring(0, iIndexOf3);
            }
        }
        return lowerCase + str.substring(iIndexOf2);
    }

    @Override // twitter4j.auth.OAuthSupport
    public void setOAuthConsumer(String str, String str2) {
        if (str == null) {
            str = "";
        }
        this.consumerKey = str;
        if (str2 == null) {
            str2 = "";
        }
        this.consumerSecret = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuthSupport)) {
            return false;
        }
        OAuthAuthorization oAuthAuthorization = (OAuthAuthorization) obj;
        if (this.consumerKey == null ? oAuthAuthorization.consumerKey != null : !this.consumerKey.equals(oAuthAuthorization.consumerKey)) {
            return false;
        }
        if (this.consumerSecret == null ? oAuthAuthorization.consumerSecret != null : !this.consumerSecret.equals(oAuthAuthorization.consumerSecret)) {
            return false;
        }
        if (this.oauthToken != null) {
            if (this.oauthToken.equals(oAuthAuthorization.oauthToken)) {
                return true;
            }
        } else if (oAuthAuthorization.oauthToken == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.consumerSecret != null ? this.consumerSecret.hashCode() : 0) + ((this.consumerKey != null ? this.consumerKey.hashCode() : 0) * 31)) * 31) + (this.oauthToken != null ? this.oauthToken.hashCode() : 0);
    }

    public String toString() {
        return "OAuthAuthorization{consumerKey='" + this.consumerKey + "', consumerSecret='******************************************', oauthToken=" + this.oauthToken + '}';
    }
}
