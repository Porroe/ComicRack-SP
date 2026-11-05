package twitter4j.conf;

import java.util.Properties;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public final class ConfigurationBuilder {
    private ConfigurationBase configurationBean = new PropertyConfiguration();

    public final ConfigurationBuilder setPrettyDebugEnabled(boolean z) {
        checkNotBuilt();
        this.configurationBean.setPrettyDebugEnabled(z);
        return this;
    }

    public final ConfigurationBuilder setGZIPEnabled(boolean z) {
        checkNotBuilt();
        this.configurationBean.setGZIPEnabled(z);
        return this;
    }

    public final ConfigurationBuilder setDebugEnabled(boolean z) {
        checkNotBuilt();
        this.configurationBean.setDebug(z);
        return this;
    }

    public final ConfigurationBuilder setApplicationOnlyAuthEnabled(boolean z) {
        checkNotBuilt();
        this.configurationBean.setApplicationOnlyAuthEnabled(z);
        return this;
    }

    public final ConfigurationBuilder setUser(String str) {
        checkNotBuilt();
        this.configurationBean.setUser(str);
        return this;
    }

    public final ConfigurationBuilder setPassword(String str) {
        checkNotBuilt();
        this.configurationBean.setPassword(str);
        return this;
    }

    public final ConfigurationBuilder setHttpProxyHost(String str) {
        checkNotBuilt();
        this.configurationBean.setHttpProxyHost(str);
        return this;
    }

    public final ConfigurationBuilder setHttpProxyUser(String str) {
        checkNotBuilt();
        this.configurationBean.setHttpProxyUser(str);
        return this;
    }

    public final ConfigurationBuilder setHttpProxyPassword(String str) {
        checkNotBuilt();
        this.configurationBean.setHttpProxyPassword(str);
        return this;
    }

    public final ConfigurationBuilder setHttpProxyPort(int i) {
        checkNotBuilt();
        this.configurationBean.setHttpProxyPort(i);
        return this;
    }

    public final ConfigurationBuilder setHttpConnectionTimeout(int i) {
        checkNotBuilt();
        this.configurationBean.setHttpConnectionTimeout(i);
        return this;
    }

    public final ConfigurationBuilder setHttpReadTimeout(int i) {
        checkNotBuilt();
        this.configurationBean.setHttpReadTimeout(i);
        return this;
    }

    public final ConfigurationBuilder setHttpStreamingReadTimeout(int i) {
        checkNotBuilt();
        this.configurationBean.setHttpStreamingReadTimeout(i);
        return this;
    }

    public final ConfigurationBuilder setHttpRetryCount(int i) {
        checkNotBuilt();
        this.configurationBean.setHttpRetryCount(i);
        return this;
    }

    public final ConfigurationBuilder setHttpRetryIntervalSeconds(int i) {
        checkNotBuilt();
        this.configurationBean.setHttpRetryIntervalSeconds(i);
        return this;
    }

    public final ConfigurationBuilder setOAuthConsumerKey(String str) {
        checkNotBuilt();
        this.configurationBean.setOAuthConsumerKey(str);
        return this;
    }

    public final ConfigurationBuilder setOAuthConsumerSecret(String str) {
        checkNotBuilt();
        this.configurationBean.setOAuthConsumerSecret(str);
        return this;
    }

    public final ConfigurationBuilder setOAuthAccessToken(String str) {
        checkNotBuilt();
        this.configurationBean.setOAuthAccessToken(str);
        return this;
    }

    public final ConfigurationBuilder setOAuthAccessTokenSecret(String str) {
        checkNotBuilt();
        this.configurationBean.setOAuthAccessTokenSecret(str);
        return this;
    }

    public final ConfigurationBuilder setOAuth2TokenType(String str) {
        checkNotBuilt();
        this.configurationBean.setOAuth2TokenType(str);
        return this;
    }

    public final ConfigurationBuilder setOAuth2AccessToken(String str) {
        checkNotBuilt();
        this.configurationBean.setOAuth2AccessToken(str);
        return this;
    }

    public final ConfigurationBuilder setOAuth2Scope(String str) {
        checkNotBuilt();
        this.configurationBean.setOAuth2Scope(str);
        return this;
    }

    public final ConfigurationBuilder setOAuthRequestTokenURL(String str) {
        checkNotBuilt();
        this.configurationBean.setOAuthRequestTokenURL(str);
        return this;
    }

    public final ConfigurationBuilder setOAuthAuthorizationURL(String str) {
        checkNotBuilt();
        this.configurationBean.setOAuthAuthorizationURL(str);
        return this;
    }

    public final ConfigurationBuilder setOAuthAccessTokenURL(String str) {
        checkNotBuilt();
        this.configurationBean.setOAuthAccessTokenURL(str);
        return this;
    }

    public final ConfigurationBuilder setOAuthAuthenticationURL(String str) {
        checkNotBuilt();
        this.configurationBean.setOAuthAuthenticationURL(str);
        return this;
    }

    public final ConfigurationBuilder setOAuth2TokenURL(String str) {
        checkNotBuilt();
        this.configurationBean.setOAuth2TokenURL(str);
        return this;
    }

    public final ConfigurationBuilder setOAuth2InvalidateTokenURL(String str) {
        checkNotBuilt();
        this.configurationBean.setOAuth2InvalidateTokenURL(str);
        return this;
    }

    public final ConfigurationBuilder setRestBaseURL(String str) {
        checkNotBuilt();
        this.configurationBean.setRestBaseURL(str);
        return this;
    }

    public final ConfigurationBuilder setStreamBaseURL(String str) {
        checkNotBuilt();
        this.configurationBean.setStreamBaseURL(str);
        return this;
    }

    public final ConfigurationBuilder setUserStreamBaseURL(String str) {
        checkNotBuilt();
        this.configurationBean.setUserStreamBaseURL(str);
        return this;
    }

    public final ConfigurationBuilder setSiteStreamBaseURL(String str) {
        checkNotBuilt();
        this.configurationBean.setSiteStreamBaseURL(str);
        return this;
    }

    public final ConfigurationBuilder setAsyncNumThreads(int i) {
        checkNotBuilt();
        this.configurationBean.setAsyncNumThreads(i);
        return this;
    }

    public final ConfigurationBuilder setDaemonEnabled(boolean z) {
        checkNotBuilt();
        this.configurationBean.setDaemonEnabled(z);
        return this;
    }

    public final ConfigurationBuilder setContributingTo(long j) {
        checkNotBuilt();
        this.configurationBean.setContributingTo(j);
        return this;
    }

    public final ConfigurationBuilder setDispatcherImpl(String str) {
        checkNotBuilt();
        this.configurationBean.setDispatcherImpl(str);
        return this;
    }

    public final ConfigurationBuilder setTrimUserEnabled(boolean z) {
        checkNotBuilt();
        this.configurationBean.setTrimUserEnabled(z);
        return this;
    }

    public final ConfigurationBuilder setIncludeMyRetweetEnabled(boolean z) {
        checkNotBuilt();
        this.configurationBean.setIncludeMyRetweetEnabled(z);
        return this;
    }

    public final ConfigurationBuilder setIncludeEntitiesEnabled(boolean z) {
        checkNotBuilt();
        this.configurationBean.setIncludeEntitiesEnabled(z);
        return this;
    }

    public final ConfigurationBuilder setJSONStoreEnabled(boolean z) {
        checkNotBuilt();
        this.configurationBean.setJSONStoreEnabled(z);
        return this;
    }

    public final ConfigurationBuilder setMBeanEnabled(boolean z) {
        checkNotBuilt();
        this.configurationBean.setMBeanEnabled(z);
        return this;
    }

    public final ConfigurationBuilder setUserStreamRepliesAllEnabled(boolean z) {
        checkNotBuilt();
        this.configurationBean.setUserStreamRepliesAllEnabled(z);
        return this;
    }

    public final ConfigurationBuilder setUserStreamWithFollowingsEnabled(boolean z) {
        checkNotBuilt();
        this.configurationBean.setUserStreamWithFollowingsEnabled(z);
        return this;
    }

    public final ConfigurationBuilder setMediaProvider(String str) {
        checkNotBuilt();
        this.configurationBean.setMediaProvider(str);
        return this;
    }

    public final ConfigurationBuilder setMediaProviderAPIKey(String str) {
        checkNotBuilt();
        this.configurationBean.setMediaProviderAPIKey(str);
        return this;
    }

    public final ConfigurationBuilder setMediaProviderParameters(Properties properties) {
        checkNotBuilt();
        this.configurationBean.setMediaProviderParameters(properties);
        return this;
    }

    public final Configuration build() {
        checkNotBuilt();
        this.configurationBean.cacheInstance();
        try {
            return this.configurationBean;
        } finally {
            this.configurationBean = null;
        }
    }

    private void checkNotBuilt() {
        if (this.configurationBean == null) {
            throw new IllegalStateException("Cannot use this builder any longer, build() has already been called");
        }
    }
}
