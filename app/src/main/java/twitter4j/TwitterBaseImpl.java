package twitter4j;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import twitter4j.auth.AccessToken;
import twitter4j.auth.Authorization;
import twitter4j.auth.AuthorizationFactory;
import twitter4j.auth.BasicAuthorization;
import twitter4j.auth.NullAuthorization;
import twitter4j.auth.OAuth2Authorization;
import twitter4j.auth.OAuth2Support;
import twitter4j.auth.OAuth2Token;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.auth.OAuthSupport;
import twitter4j.auth.RequestToken;
import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
abstract class TwitterBaseImpl implements Serializable, HttpResponseListener, TwitterBase, OAuth2Support, OAuthSupport {
    private static final String WWW_DETAILS = "See http://twitter4j.org/en/configuration.html for details";
    private static final long serialVersionUID = -7824361938865528554L;
    Authorization auth;
    Configuration conf;
    ObjectFactory factory;
    transient HttpClient http;
    private transient String screenName = null;

    /* renamed from: id */
    private transient long f3742id = 0;
    private List rateLimitStatusListeners = new ArrayList(0);

    TwitterBaseImpl(Configuration configuration, Authorization authorization) {
        this.conf = configuration;
        this.auth = authorization;
        init();
    }

    private void init() {
        if (this.auth == null) {
            String oAuthConsumerKey = this.conf.getOAuthConsumerKey();
            String oAuthConsumerSecret = this.conf.getOAuthConsumerSecret();
            if (oAuthConsumerKey != null && oAuthConsumerSecret != null) {
                if (this.conf.isApplicationOnlyAuthEnabled()) {
                    OAuth2Authorization oAuth2Authorization = new OAuth2Authorization(this.conf);
                    String oAuth2TokenType = this.conf.getOAuth2TokenType();
                    String oAuth2AccessToken = this.conf.getOAuth2AccessToken();
                    if (oAuth2TokenType != null && oAuth2AccessToken != null) {
                        oAuth2Authorization.setOAuth2Token(new OAuth2Token(oAuth2TokenType, oAuth2AccessToken));
                    }
                    this.auth = oAuth2Authorization;
                } else {
                    OAuthAuthorization oAuthAuthorization = new OAuthAuthorization(this.conf);
                    String oAuthAccessToken = this.conf.getOAuthAccessToken();
                    String oAuthAccessTokenSecret = this.conf.getOAuthAccessTokenSecret();
                    if (oAuthAccessToken != null && oAuthAccessTokenSecret != null) {
                        oAuthAuthorization.setOAuthAccessToken(new AccessToken(oAuthAccessToken, oAuthAccessTokenSecret));
                    }
                    this.auth = oAuthAuthorization;
                }
            } else {
                this.auth = NullAuthorization.getInstance();
            }
        }
        this.http = HttpClientFactory.getInstance(this.conf.getHttpClientConfiguration());
        setFactory();
    }

    void setFactory() {
        this.factory = new JSONImplFactory(this.conf);
    }

    @Override // twitter4j.TwitterBase
    public String getScreenName() {
        if (!this.auth.isEnabled()) {
            throw new IllegalStateException("Neither user ID/password combination nor OAuth consumer key/secret combination supplied");
        }
        if (this.screenName == null) {
            if (this.auth instanceof BasicAuthorization) {
                this.screenName = ((BasicAuthorization) this.auth).getUserId();
                if (this.screenName.contains("@")) {
                    this.screenName = null;
                }
            }
            if (this.screenName == null) {
                fillInIDAndScreenName();
            }
        }
        return this.screenName;
    }

    @Override // twitter4j.TwitterBase
    public long getId() {
        if (!this.auth.isEnabled()) {
            throw new IllegalStateException("Neither user ID/password combination nor OAuth consumer key/secret combination supplied");
        }
        if (0 == this.f3742id) {
            fillInIDAndScreenName();
        }
        return this.f3742id;
    }

    User fillInIDAndScreenName() {
        ensureAuthorizationEnabled();
        UserJSONImpl userJSONImpl = new UserJSONImpl(this.http.get(this.conf.getRestBaseURL() + "account/verify_credentials.json", null, this.auth, this), this.conf);
        this.screenName = userJSONImpl.getScreenName();
        this.f3742id = userJSONImpl.getId();
        return userJSONImpl;
    }

    @Override // twitter4j.TwitterBase
    public void addRateLimitStatusListener(RateLimitStatusListener rateLimitStatusListener) {
        this.rateLimitStatusListeners.add(rateLimitStatusListener);
    }

    @Override // twitter4j.HttpResponseListener
    public void httpResponseReceived(HttpResponseEvent httpResponseEvent) {
        RateLimitStatus rateLimitStatusCreateRateLimitStatusFromResponseHeader;
        int statusCode;
        if (this.rateLimitStatusListeners.size() != 0) {
            HttpResponse response = httpResponseEvent.getResponse();
            TwitterException twitterException = httpResponseEvent.getTwitterException();
            if (twitterException != null) {
                rateLimitStatusCreateRateLimitStatusFromResponseHeader = twitterException.getRateLimitStatus();
                statusCode = twitterException.getStatusCode();
            } else {
                rateLimitStatusCreateRateLimitStatusFromResponseHeader = JSONImplFactory.createRateLimitStatusFromResponseHeader(response);
                statusCode = response.getStatusCode();
            }
            if (rateLimitStatusCreateRateLimitStatusFromResponseHeader != null) {
                RateLimitStatusEvent rateLimitStatusEvent = new RateLimitStatusEvent(this, rateLimitStatusCreateRateLimitStatusFromResponseHeader, httpResponseEvent.isAuthenticated());
                if (statusCode == 420 || statusCode == 503 || statusCode == 429) {
                    for (RateLimitStatusListener rateLimitStatusListener : this.rateLimitStatusListeners) {
                        rateLimitStatusListener.onRateLimitStatus(rateLimitStatusEvent);
                        rateLimitStatusListener.onRateLimitReached(rateLimitStatusEvent);
                    }
                    return;
                }
                Iterator it = this.rateLimitStatusListeners.iterator();
                while (it.hasNext()) {
                    ((RateLimitStatusListener) it.next()).onRateLimitStatus(rateLimitStatusEvent);
                }
            }
        }
    }

    @Override // twitter4j.TwitterBase
    public final Authorization getAuthorization() {
        return this.auth;
    }

    @Override // twitter4j.TwitterBase
    public Configuration getConfiguration() {
        return this.conf;
    }

    final void ensureAuthorizationEnabled() {
        if (!this.auth.isEnabled()) {
            throw new IllegalStateException("Authentication credentials are missing. See http://twitter4j.org/en/configuration.html for details");
        }
    }

    final void ensureOAuthEnabled() {
        if (!(this.auth instanceof OAuthAuthorization)) {
            throw new IllegalStateException("OAuth required. Authentication credentials are missing. See http://twitter4j.org/en/configuration.html for details");
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.putFields();
        objectOutputStream.writeFields();
        objectOutputStream.writeObject(this.conf);
        objectOutputStream.writeObject(this.auth);
        ArrayList arrayList = new ArrayList(0);
        for (RateLimitStatusListener rateLimitStatusListener : this.rateLimitStatusListeners) {
            if (rateLimitStatusListener instanceof Serializable) {
                arrayList.add(rateLimitStatusListener);
            }
        }
        objectOutputStream.writeObject(arrayList);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.readFields();
        this.conf = (Configuration) objectInputStream.readObject();
        this.auth = (Authorization) objectInputStream.readObject();
        this.rateLimitStatusListeners = (List) objectInputStream.readObject();
        this.http = HttpClientFactory.getInstance(this.conf.getHttpClientConfiguration());
        setFactory();
    }

    @Override // twitter4j.auth.OAuth2Support, twitter4j.auth.OAuthSupport
    public synchronized void setOAuthConsumer(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("consumer key is null");
        }
        if (str2 == null) {
            throw new NullPointerException("consumer secret is null");
        }
        if (this.auth instanceof NullAuthorization) {
            if (this.conf.isApplicationOnlyAuthEnabled()) {
                OAuth2Authorization oAuth2Authorization = new OAuth2Authorization(this.conf);
                oAuth2Authorization.setOAuthConsumer(str, str2);
                this.auth = oAuth2Authorization;
            } else {
                OAuthAuthorization oAuthAuthorization = new OAuthAuthorization(this.conf);
                oAuthAuthorization.setOAuthConsumer(str, str2);
                this.auth = oAuthAuthorization;
            }
        } else if (this.auth instanceof BasicAuthorization) {
            XAuthAuthorization xAuthAuthorization = new XAuthAuthorization((BasicAuthorization) this.auth);
            xAuthAuthorization.setOAuthConsumer(str, str2);
            this.auth = xAuthAuthorization;
        } else if ((this.auth instanceof OAuthAuthorization) || (this.auth instanceof OAuth2Authorization)) {
            throw new IllegalStateException("consumer key/secret pair already set.");
        }
    }

    @Override // twitter4j.auth.OAuthSupport
    public RequestToken getOAuthRequestToken() {
        return getOAuthRequestToken(null);
    }

    @Override // twitter4j.auth.OAuthSupport
    public RequestToken getOAuthRequestToken(String str) {
        return getOAuth().getOAuthRequestToken(str);
    }

    @Override // twitter4j.auth.OAuthSupport
    public RequestToken getOAuthRequestToken(String str, String str2) {
        return getOAuth().getOAuthRequestToken(str, str2);
    }

    @Override // twitter4j.auth.OAuthSupport
    public synchronized AccessToken getOAuthAccessToken() {
        AccessToken oAuthAccessToken;
        Authorization authorization = getAuthorization();
        if (authorization instanceof BasicAuthorization) {
            BasicAuthorization basicAuthorization = (BasicAuthorization) authorization;
            Authorization authorizationFactory = AuthorizationFactory.getInstance(this.conf);
            if (authorizationFactory instanceof OAuthAuthorization) {
                this.auth = authorizationFactory;
                oAuthAccessToken = ((OAuthAuthorization) authorizationFactory).getOAuthAccessToken(basicAuthorization.getUserId(), basicAuthorization.getPassword());
            } else {
                throw new IllegalStateException("consumer key / secret combination not supplied.");
            }
        } else if (authorization instanceof XAuthAuthorization) {
            XAuthAuthorization xAuthAuthorization = (XAuthAuthorization) authorization;
            this.auth = xAuthAuthorization;
            OAuthAuthorization oAuthAuthorization = new OAuthAuthorization(this.conf);
            oAuthAuthorization.setOAuthConsumer(xAuthAuthorization.getConsumerKey(), xAuthAuthorization.getConsumerSecret());
            oAuthAccessToken = oAuthAuthorization.getOAuthAccessToken(xAuthAuthorization.getUserId(), xAuthAuthorization.getPassword());
        } else {
            oAuthAccessToken = getOAuth().getOAuthAccessToken();
        }
        this.screenName = oAuthAccessToken.getScreenName();
        this.f3742id = oAuthAccessToken.getUserId();
        return oAuthAccessToken;
    }

    @Override // twitter4j.auth.OAuthSupport
    public synchronized AccessToken getOAuthAccessToken(String str) {
        AccessToken oAuthAccessToken;
        oAuthAccessToken = getOAuth().getOAuthAccessToken(str);
        this.screenName = oAuthAccessToken.getScreenName();
        return oAuthAccessToken;
    }

    @Override // twitter4j.auth.OAuthSupport
    public synchronized AccessToken getOAuthAccessToken(RequestToken requestToken) {
        AccessToken oAuthAccessToken;
        oAuthAccessToken = getOAuth().getOAuthAccessToken(requestToken);
        this.screenName = oAuthAccessToken.getScreenName();
        return oAuthAccessToken;
    }

    @Override // twitter4j.auth.OAuthSupport
    public synchronized AccessToken getOAuthAccessToken(RequestToken requestToken, String str) {
        return getOAuth().getOAuthAccessToken(requestToken, str);
    }

    @Override // twitter4j.auth.OAuthSupport
    public synchronized void setOAuthAccessToken(AccessToken accessToken) {
        getOAuth().setOAuthAccessToken(accessToken);
    }

    @Override // twitter4j.auth.OAuthSupport
    public synchronized AccessToken getOAuthAccessToken(String str, String str2) {
        return getOAuth().getOAuthAccessToken(str, str2);
    }

    private OAuthSupport getOAuth() {
        if (!(this.auth instanceof OAuthSupport)) {
            throw new IllegalStateException("OAuth consumer key/secret combination not supplied");
        }
        return (OAuthSupport) this.auth;
    }

    @Override // twitter4j.auth.OAuth2Support
    public synchronized OAuth2Token getOAuth2Token() {
        return getOAuth2().getOAuth2Token();
    }

    @Override // twitter4j.auth.OAuth2Support
    public void setOAuth2Token(OAuth2Token oAuth2Token) {
        getOAuth2().setOAuth2Token(oAuth2Token);
    }

    @Override // twitter4j.auth.OAuth2Support
    public synchronized void invalidateOAuth2Token() {
        getOAuth2().invalidateOAuth2Token();
    }

    private OAuth2Support getOAuth2() {
        if (!(this.auth instanceof OAuth2Support)) {
            throw new IllegalStateException("OAuth consumer key/secret combination not supplied");
        }
        return (OAuth2Support) this.auth;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterBaseImpl)) {
            return false;
        }
        TwitterBaseImpl twitterBaseImpl = (TwitterBaseImpl) obj;
        if (this.auth == null ? twitterBaseImpl.auth != null : !this.auth.equals(twitterBaseImpl.auth)) {
            return false;
        }
        if (!this.conf.equals(twitterBaseImpl.conf)) {
            return false;
        }
        if (this.http == null ? twitterBaseImpl.http != null : !this.http.equals(twitterBaseImpl.http)) {
            return false;
        }
        return this.rateLimitStatusListeners.equals(twitterBaseImpl.rateLimitStatusListeners);
    }

    public int hashCode() {
        return (((((this.http != null ? this.http.hashCode() : 0) + (this.conf.hashCode() * 31)) * 31) + this.rateLimitStatusListeners.hashCode()) * 31) + (this.auth != null ? this.auth.hashCode() : 0);
    }

    public String toString() {
        return "TwitterBase{conf=" + this.conf + ", http=" + this.http + ", rateLimitStatusListeners=" + this.rateLimitStatusListeners + ", auth=" + this.auth + '}';
    }
}
