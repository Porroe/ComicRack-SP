package twitter4j.auth;

import java.io.Serializable;
import twitter4j.BASE64Encoder;
import twitter4j.HttpRequest;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class BasicAuthorization implements Serializable, Authorization {
    private static final long serialVersionUID = 7420629998989177351L;
    private final String basic = encodeBasicAuthenticationString();
    private final String password;
    private final String userId;

    public BasicAuthorization(String str, String str2) {
        this.userId = str;
        this.password = str2;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getPassword() {
        return this.password;
    }

    private String encodeBasicAuthenticationString() {
        if (this.userId == null || this.password == null) {
            return null;
        }
        return "Basic " + BASE64Encoder.encode((this.userId + ":" + this.password).getBytes());
    }

    @Override // twitter4j.auth.Authorization
    public String getAuthorizationHeader(HttpRequest httpRequest) {
        return this.basic;
    }

    @Override // twitter4j.auth.Authorization
    public boolean isEnabled() {
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BasicAuthorization) {
            return this.basic.equals(((BasicAuthorization) obj).basic);
        }
        return false;
    }

    public int hashCode() {
        return this.basic.hashCode();
    }

    public String toString() {
        return "BasicAuthorization{userId='" + this.userId + "', password='**********''}";
    }
}
