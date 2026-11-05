package twitter4j.auth;

import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import twitter4j.HttpResponse;
import twitter4j.JSONException;
import twitter4j.JSONObject;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class OAuth2Token implements Serializable {
    private static final long serialVersionUID = -8985359441959903216L;
    private String accessToken;
    private String tokenType;

    OAuth2Token(HttpResponse httpResponse) throws IOException {
        JSONObject jSONObjectAsJSONObject = httpResponse.asJSONObject();
        this.tokenType = getRawString("token_type", jSONObjectAsJSONObject);
        try {
            this.accessToken = URLDecoder.decode(getRawString("access_token", jSONObjectAsJSONObject), "UTF-8");
        } catch (UnsupportedEncodingException e) {
        }
    }

    public OAuth2Token(String str, String str2) {
        this.tokenType = str;
        this.accessToken = str2;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    String generateAuthorizationHeader() throws UnsupportedEncodingException {
        String strEncode = "";
        try {
            strEncode = URLEncoder.encode(this.accessToken, "UTF-8");
        } catch (UnsupportedEncodingException e) {
        }
        return "Bearer " + strEncode;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof OAuth2Token)) {
            return false;
        }
        OAuth2Token oAuth2Token = (OAuth2Token) obj;
        if (this.tokenType != null) {
            if (!this.tokenType.equals(oAuth2Token.tokenType)) {
                return false;
            }
        } else if (oAuth2Token.tokenType != null) {
            return false;
        }
        if (this.accessToken != null) {
            if (!this.accessToken.equals(oAuth2Token.accessToken)) {
                return false;
            }
        } else if (oAuth2Token.accessToken != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.tokenType != null ? this.tokenType.hashCode() : 0) * 31) + (this.accessToken != null ? this.accessToken.hashCode() : 0);
    }

    public String toString() {
        return "OAuth2Token{tokenType='" + this.tokenType + "', accessToken='" + this.accessToken + "'}";
    }

    private static String getRawString(String str, JSONObject jSONObject) {
        try {
            if (jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str);
        } catch (JSONException e) {
            return null;
        }
    }
}
