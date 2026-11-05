package twitter4j.auth;

import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public final class AuthorizationFactory {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [twitter4j.auth.OAuthAuthorization] */
    /* JADX WARN: Type inference failed for: r0v6, types: [twitter4j.auth.OAuth2Authorization] */
    public static Authorization getInstance(Configuration configuration) {
        Authorization authorization = null;
        String oAuthConsumerKey = configuration.getOAuthConsumerKey();
        String oAuthConsumerSecret = configuration.getOAuthConsumerSecret();
        if (oAuthConsumerKey != null && oAuthConsumerSecret != null) {
            if (configuration.isApplicationOnlyAuthEnabled()) {
                OAuth2Authorization oAuth2Authorization = new OAuth2Authorization(configuration);
                String oAuth2TokenType = configuration.getOAuth2TokenType();
                String oAuth2AccessToken = configuration.getOAuth2AccessToken();
                authorization = oAuth2Authorization;
                if (oAuth2TokenType != null && oAuth2AccessToken != null) {
                    oAuth2Authorization.setOAuth2Token(new OAuth2Token(oAuth2TokenType, oAuth2AccessToken));
                }
            } else {
                OAuthAuthorization oAuthAuthorization = new OAuthAuthorization(configuration);
                String oAuthAccessToken = configuration.getOAuthAccessToken();
                String oAuthAccessTokenSecret = configuration.getOAuthAccessTokenSecret();
                authorization = oAuthAuthorization;
                if (oAuthAccessToken != null && oAuthAccessTokenSecret != null) {
                    oAuthAuthorization.setOAuthAccessToken(new AccessToken(oAuthAccessToken, oAuthAccessTokenSecret));
                }
            }
        } else {
            String user = configuration.getUser();
            String password = configuration.getPassword();
            if (user != null && password != null) {
                authorization = new BasicAuthorization(user, password);
            }
        }
        if (authorization == null) {
            return NullAuthorization.getInstance();
        }
        return authorization;
    }
}
