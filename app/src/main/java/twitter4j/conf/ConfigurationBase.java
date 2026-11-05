package twitter4j.conf;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import twitter4j.HttpClientConfiguration;
import twitter4j.Logger;

/* compiled from: DontLook */
/* loaded from: classes.dex */
class ConfigurationBase implements Serializable, Configuration {
    private static final List instances = new ArrayList();
    private static final long serialVersionUID = 6175546394599249696L;
    private String oAuth2AccessToken;
    private String oAuth2Scope;
    private String oAuth2TokenType;
    private boolean debug = false;
    private String user = null;
    private String password = null;
    private int httpStreamingReadTimeout = 40000;
    private int httpRetryCount = 0;
    private int httpRetryIntervalSeconds = 5;
    private String oAuthConsumerKey = null;
    private String oAuthConsumerSecret = null;
    private String oAuthAccessToken = null;
    private String oAuthAccessTokenSecret = null;
    private String oAuthRequestTokenURL = "https://api.twitter.com/oauth/request_token";
    private String oAuthAuthorizationURL = "https://api.twitter.com/oauth/authorize";
    private String oAuthAccessTokenURL = "https://api.twitter.com/oauth/access_token";
    private String oAuthAuthenticationURL = "https://api.twitter.com/oauth/authenticate";
    private String oAuth2TokenURL = "https://api.twitter.com/oauth2/token";
    private String oAuth2InvalidateTokenURL = "https://api.twitter.com/oauth2/invalidate_token";
    private String restBaseURL = "https://api.twitter.com/1.1/";
    private String streamBaseURL = "https://stream.twitter.com/1.1/";
    private String userStreamBaseURL = "https://userstream.twitter.com/1.1/";
    private String siteStreamBaseURL = "https://sitestream.twitter.com/1.1/";
    private String uploadBaseURL = "https://upload.twitter.com/1.1/";
    private String dispatcherImpl = "twitter4j.DispatcherImpl";
    private int asyncNumThreads = 1;
    private String loggerFactory = null;
    private long contributingTo = -1;
    private boolean includeMyRetweetEnabled = true;
    private boolean includeEntitiesEnabled = true;
    private boolean trimUserEnabled = false;
    private boolean jsonStoreEnabled = false;
    private boolean mbeanEnabled = false;
    private boolean userStreamRepliesAllEnabled = false;
    private boolean userStreamWithFollowingsEnabled = true;
    private boolean stallWarningsEnabled = true;
    private boolean applicationOnlyAuthEnabled = false;
    private String mediaProvider = "TWITTER";
    private String mediaProviderAPIKey = null;
    private Properties mediaProviderParameters = null;
    private boolean daemonEnabled = true;
    private HttpClientConfiguration httpConf = new MyHttpClientConfiguration(null, null, null, -1, 20000, 120000, false, true);

    static /* synthetic */ int access$000(ConfigurationBase configurationBase) {
        return configurationBase.httpRetryCount;
    }

    static /* synthetic */ int access$100(ConfigurationBase configurationBase) {
        return configurationBase.httpRetryIntervalSeconds;
    }

    protected ConfigurationBase() {
    }

    /* compiled from: DontLook */
    class MyHttpClientConfiguration implements Serializable, HttpClientConfiguration {
        private static final long serialVersionUID = 8226866124868861058L;
        private boolean gzipEnabled;
        private int httpConnectionTimeout;
        private String httpProxyHost;
        private String httpProxyPassword;
        private int httpProxyPort;
        private String httpProxyUser;
        private int httpReadTimeout;
        private boolean prettyDebug;

        MyHttpClientConfiguration(String str, String str2, String str3, int i, int i2, int i3, boolean z, boolean z2) {
            this.httpProxyHost = null;
            this.httpProxyUser = null;
            this.httpProxyPassword = null;
            this.httpProxyPort = -1;
            this.httpConnectionTimeout = 20000;
            this.httpReadTimeout = 120000;
            this.prettyDebug = false;
            this.gzipEnabled = true;
            this.httpProxyHost = str;
            this.httpProxyUser = str2;
            this.httpProxyPassword = str3;
            this.httpProxyPort = i;
            this.httpConnectionTimeout = i2;
            this.httpReadTimeout = i3;
            this.prettyDebug = z;
            this.gzipEnabled = z2;
        }

        @Override // twitter4j.HttpClientConfiguration
        public String getHttpProxyHost() {
            return this.httpProxyHost;
        }

        @Override // twitter4j.HttpClientConfiguration
        public int getHttpProxyPort() {
            return this.httpProxyPort;
        }

        @Override // twitter4j.HttpClientConfiguration
        public String getHttpProxyUser() {
            return this.httpProxyUser;
        }

        @Override // twitter4j.HttpClientConfiguration
        public String getHttpProxyPassword() {
            return this.httpProxyPassword;
        }

        @Override // twitter4j.HttpClientConfiguration
        public int getHttpConnectionTimeout() {
            return this.httpConnectionTimeout;
        }

        @Override // twitter4j.HttpClientConfiguration
        public int getHttpReadTimeout() {
            return this.httpReadTimeout;
        }

        @Override // twitter4j.HttpClientConfiguration
        public int getHttpRetryCount() {
            return ConfigurationBase.access$000(ConfigurationBase.this);
        }

        @Override // twitter4j.HttpClientConfiguration
        public int getHttpRetryIntervalSeconds() {
            return ConfigurationBase.access$100(ConfigurationBase.this);
        }

        @Override // twitter4j.HttpClientConfiguration
        public boolean isPrettyDebugEnabled() {
            return this.prettyDebug;
        }

        @Override // twitter4j.HttpClientConfiguration
        public boolean isGZIPEnabled() {
            return this.gzipEnabled;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MyHttpClientConfiguration myHttpClientConfiguration = (MyHttpClientConfiguration) obj;
            if (this.gzipEnabled == myHttpClientConfiguration.gzipEnabled && this.httpConnectionTimeout == myHttpClientConfiguration.httpConnectionTimeout && this.httpProxyPort == myHttpClientConfiguration.httpProxyPort && this.httpReadTimeout == myHttpClientConfiguration.httpReadTimeout && this.prettyDebug == myHttpClientConfiguration.prettyDebug) {
                if (this.httpProxyHost == null ? myHttpClientConfiguration.httpProxyHost != null : !this.httpProxyHost.equals(myHttpClientConfiguration.httpProxyHost)) {
                    return false;
                }
                if (this.httpProxyPassword == null ? myHttpClientConfiguration.httpProxyPassword != null : !this.httpProxyPassword.equals(myHttpClientConfiguration.httpProxyPassword)) {
                    return false;
                }
                if (this.httpProxyUser != null) {
                    if (this.httpProxyUser.equals(myHttpClientConfiguration.httpProxyUser)) {
                        return true;
                    }
                } else if (myHttpClientConfiguration.httpProxyUser == null) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((this.prettyDebug ? 1 : 0) + (((((((((this.httpProxyPassword != null ? this.httpProxyPassword.hashCode() : 0) + (((this.httpProxyUser != null ? this.httpProxyUser.hashCode() : 0) + ((this.httpProxyHost != null ? this.httpProxyHost.hashCode() : 0) * 31)) * 31)) * 31) + this.httpProxyPort) * 31) + this.httpConnectionTimeout) * 31) + this.httpReadTimeout) * 31)) * 31) + (this.gzipEnabled ? 1 : 0);
        }

        public String toString() {
            return "MyHttpClientConfiguration{httpProxyHost='" + this.httpProxyHost + "', httpProxyUser='" + this.httpProxyUser + "', httpProxyPassword='" + this.httpProxyPassword + "', httpProxyPort=" + this.httpProxyPort + ", httpConnectionTimeout=" + this.httpConnectionTimeout + ", httpReadTimeout=" + this.httpReadTimeout + ", prettyDebug=" + this.prettyDebug + ", gzipEnabled=" + this.gzipEnabled + '}';
        }
    }

    public void dumpConfiguration() throws IllegalAccessException, IllegalArgumentException {
        Logger logger = Logger.getLogger(ConfigurationBase.class);
        if (this.debug) {
            for (Field field : ConfigurationBase.class.getDeclaredFields()) {
                try {
                    Object obj = field.get(this);
                    String strValueOf = String.valueOf(obj);
                    if (obj != null && field.getName().matches("oAuthConsumerSecret|oAuthAccessTokenSecret|password")) {
                        strValueOf = String.valueOf(obj).replaceAll(".", "*");
                    }
                    logger.debug(field.getName() + ": " + strValueOf);
                } catch (IllegalAccessException e) {
                }
            }
        }
    }

    @Override // twitter4j.conf.Configuration
    public final boolean isDebugEnabled() {
        return this.debug;
    }

    protected final void setDebug(boolean z) {
        this.debug = z;
    }

    @Override // twitter4j.conf.Configuration, twitter4j.auth.AuthorizationConfiguration
    public final String getUser() {
        return this.user;
    }

    protected final void setUser(String str) {
        this.user = str;
    }

    @Override // twitter4j.conf.Configuration, twitter4j.auth.AuthorizationConfiguration
    public final String getPassword() {
        return this.password;
    }

    @Override // twitter4j.conf.Configuration
    public HttpClientConfiguration getHttpClientConfiguration() {
        return this.httpConf;
    }

    protected final void setPassword(String str) {
        this.password = str;
    }

    protected final void setPrettyDebugEnabled(boolean z) {
        this.httpConf = new MyHttpClientConfiguration(this.httpConf.getHttpProxyHost(), this.httpConf.getHttpProxyUser(), this.httpConf.getHttpProxyPassword(), this.httpConf.getHttpProxyPort(), this.httpConf.getHttpConnectionTimeout(), this.httpConf.getHttpReadTimeout(), z, this.httpConf.isGZIPEnabled());
    }

    protected final void setGZIPEnabled(boolean z) {
        this.httpConf = new MyHttpClientConfiguration(this.httpConf.getHttpProxyHost(), this.httpConf.getHttpProxyUser(), this.httpConf.getHttpProxyPassword(), this.httpConf.getHttpProxyPort(), this.httpConf.getHttpConnectionTimeout(), this.httpConf.getHttpReadTimeout(), this.httpConf.isPrettyDebugEnabled(), z);
    }

    protected final void setHttpProxyHost(String str) {
        this.httpConf = new MyHttpClientConfiguration(str, this.httpConf.getHttpProxyUser(), this.httpConf.getHttpProxyPassword(), this.httpConf.getHttpProxyPort(), this.httpConf.getHttpConnectionTimeout(), this.httpConf.getHttpReadTimeout(), this.httpConf.isPrettyDebugEnabled(), this.httpConf.isGZIPEnabled());
    }

    protected final void setHttpProxyUser(String str) {
        this.httpConf = new MyHttpClientConfiguration(this.httpConf.getHttpProxyHost(), str, this.httpConf.getHttpProxyPassword(), this.httpConf.getHttpProxyPort(), this.httpConf.getHttpConnectionTimeout(), this.httpConf.getHttpReadTimeout(), this.httpConf.isPrettyDebugEnabled(), this.httpConf.isGZIPEnabled());
    }

    protected final void setHttpProxyPassword(String str) {
        this.httpConf = new MyHttpClientConfiguration(this.httpConf.getHttpProxyHost(), this.httpConf.getHttpProxyUser(), str, this.httpConf.getHttpProxyPort(), this.httpConf.getHttpConnectionTimeout(), this.httpConf.getHttpReadTimeout(), this.httpConf.isPrettyDebugEnabled(), this.httpConf.isGZIPEnabled());
    }

    protected final void setHttpProxyPort(int i) {
        this.httpConf = new MyHttpClientConfiguration(this.httpConf.getHttpProxyHost(), this.httpConf.getHttpProxyUser(), this.httpConf.getHttpProxyPassword(), i, this.httpConf.getHttpConnectionTimeout(), this.httpConf.getHttpReadTimeout(), this.httpConf.isPrettyDebugEnabled(), this.httpConf.isGZIPEnabled());
    }

    protected final void setHttpConnectionTimeout(int i) {
        this.httpConf = new MyHttpClientConfiguration(this.httpConf.getHttpProxyHost(), this.httpConf.getHttpProxyUser(), this.httpConf.getHttpProxyPassword(), this.httpConf.getHttpProxyPort(), i, this.httpConf.getHttpReadTimeout(), this.httpConf.isPrettyDebugEnabled(), this.httpConf.isGZIPEnabled());
    }

    protected final void setHttpReadTimeout(int i) {
        this.httpConf = new MyHttpClientConfiguration(this.httpConf.getHttpProxyHost(), this.httpConf.getHttpProxyUser(), this.httpConf.getHttpProxyPassword(), this.httpConf.getHttpProxyPort(), this.httpConf.getHttpConnectionTimeout(), i, this.httpConf.isPrettyDebugEnabled(), this.httpConf.isGZIPEnabled());
    }

    @Override // twitter4j.conf.Configuration
    public int getHttpStreamingReadTimeout() {
        return this.httpStreamingReadTimeout;
    }

    protected final void setHttpStreamingReadTimeout(int i) {
        this.httpStreamingReadTimeout = i;
    }

    protected final void setHttpRetryCount(int i) {
        this.httpRetryCount = i;
    }

    protected final void setHttpRetryIntervalSeconds(int i) {
        this.httpRetryIntervalSeconds = i;
    }

    @Override // twitter4j.conf.Configuration, twitter4j.auth.AuthorizationConfiguration
    public final String getOAuthConsumerKey() {
        return this.oAuthConsumerKey;
    }

    protected final void setOAuthConsumerKey(String str) {
        this.oAuthConsumerKey = str;
    }

    @Override // twitter4j.conf.Configuration, twitter4j.auth.AuthorizationConfiguration
    public final String getOAuthConsumerSecret() {
        return this.oAuthConsumerSecret;
    }

    protected final void setOAuthConsumerSecret(String str) {
        this.oAuthConsumerSecret = str;
    }

    @Override // twitter4j.conf.Configuration, twitter4j.auth.AuthorizationConfiguration
    public String getOAuthAccessToken() {
        return this.oAuthAccessToken;
    }

    protected final void setOAuthAccessToken(String str) {
        this.oAuthAccessToken = str;
    }

    @Override // twitter4j.conf.Configuration, twitter4j.auth.AuthorizationConfiguration
    public String getOAuthAccessTokenSecret() {
        return this.oAuthAccessTokenSecret;
    }

    protected final void setOAuthAccessTokenSecret(String str) {
        this.oAuthAccessTokenSecret = str;
    }

    @Override // twitter4j.conf.Configuration, twitter4j.auth.AuthorizationConfiguration
    public String getOAuth2TokenType() {
        return this.oAuth2TokenType;
    }

    protected final void setOAuth2TokenType(String str) {
        this.oAuth2TokenType = str;
    }

    @Override // twitter4j.conf.Configuration, twitter4j.auth.AuthorizationConfiguration
    public String getOAuth2AccessToken() {
        return this.oAuth2AccessToken;
    }

    @Override // twitter4j.conf.Configuration
    public String getOAuth2Scope() {
        return this.oAuth2Scope;
    }

    protected final void setOAuth2AccessToken(String str) {
        this.oAuth2AccessToken = str;
    }

    protected final void setOAuth2Scope(String str) {
        this.oAuth2Scope = str;
    }

    @Override // twitter4j.conf.Configuration
    public final int getAsyncNumThreads() {
        return this.asyncNumThreads;
    }

    protected final void setAsyncNumThreads(int i) {
        this.asyncNumThreads = i;
    }

    @Override // twitter4j.conf.Configuration
    public final long getContributingTo() {
        return this.contributingTo;
    }

    protected final void setContributingTo(long j) {
        this.contributingTo = j;
    }

    @Override // twitter4j.conf.Configuration
    public String getRestBaseURL() {
        return this.restBaseURL;
    }

    protected final void setRestBaseURL(String str) {
        this.restBaseURL = str;
    }

    @Override // twitter4j.conf.Configuration
    public String getUploadBaseURL() {
        return this.uploadBaseURL;
    }

    protected final void setUploadBaseURL(String str) {
        this.uploadBaseURL = str;
    }

    @Override // twitter4j.conf.Configuration
    public String getStreamBaseURL() {
        return this.streamBaseURL;
    }

    protected final void setStreamBaseURL(String str) {
        this.streamBaseURL = str;
    }

    @Override // twitter4j.conf.Configuration
    public String getUserStreamBaseURL() {
        return this.userStreamBaseURL;
    }

    protected final void setUserStreamBaseURL(String str) {
        this.userStreamBaseURL = str;
    }

    @Override // twitter4j.conf.Configuration
    public String getSiteStreamBaseURL() {
        return this.siteStreamBaseURL;
    }

    protected final void setSiteStreamBaseURL(String str) {
        this.siteStreamBaseURL = str;
    }

    @Override // twitter4j.conf.Configuration
    public String getOAuthRequestTokenURL() {
        return this.oAuthRequestTokenURL;
    }

    protected final void setOAuthRequestTokenURL(String str) {
        this.oAuthRequestTokenURL = str;
    }

    @Override // twitter4j.conf.Configuration
    public String getOAuthAuthorizationURL() {
        return this.oAuthAuthorizationURL;
    }

    protected final void setOAuthAuthorizationURL(String str) {
        this.oAuthAuthorizationURL = str;
    }

    @Override // twitter4j.conf.Configuration
    public String getOAuthAccessTokenURL() {
        return this.oAuthAccessTokenURL;
    }

    protected final void setOAuthAccessTokenURL(String str) {
        this.oAuthAccessTokenURL = str;
    }

    @Override // twitter4j.conf.Configuration
    public String getOAuthAuthenticationURL() {
        return this.oAuthAuthenticationURL;
    }

    protected final void setOAuthAuthenticationURL(String str) {
        this.oAuthAuthenticationURL = str;
    }

    @Override // twitter4j.conf.Configuration
    public String getOAuth2TokenURL() {
        return this.oAuth2TokenURL;
    }

    protected final void setOAuth2TokenURL(String str) {
        this.oAuth2TokenURL = str;
    }

    @Override // twitter4j.conf.Configuration
    public String getOAuth2InvalidateTokenURL() {
        return this.oAuth2InvalidateTokenURL;
    }

    protected final void setOAuth2InvalidateTokenURL(String str) {
        this.oAuth2InvalidateTokenURL = str;
    }

    @Override // twitter4j.conf.Configuration
    public String getDispatcherImpl() {
        return this.dispatcherImpl;
    }

    protected final void setDispatcherImpl(String str) {
        this.dispatcherImpl = str;
    }

    @Override // twitter4j.conf.Configuration
    public String getLoggerFactory() {
        return this.loggerFactory;
    }

    @Override // twitter4j.conf.Configuration
    public boolean isIncludeEntitiesEnabled() {
        return this.includeEntitiesEnabled;
    }

    protected void setIncludeEntitiesEnabled(boolean z) {
        this.includeEntitiesEnabled = z;
    }

    protected final void setLoggerFactory(String str) {
        this.loggerFactory = str;
    }

    @Override // twitter4j.conf.Configuration
    public boolean isIncludeMyRetweetEnabled() {
        return this.includeMyRetweetEnabled;
    }

    public void setIncludeMyRetweetEnabled(boolean z) {
        this.includeMyRetweetEnabled = z;
    }

    @Override // twitter4j.conf.Configuration
    public boolean isTrimUserEnabled() {
        return this.trimUserEnabled;
    }

    @Override // twitter4j.conf.Configuration
    public boolean isDaemonEnabled() {
        return this.daemonEnabled;
    }

    protected void setDaemonEnabled(boolean z) {
        this.daemonEnabled = z;
    }

    public void setTrimUserEnabled(boolean z) {
        this.trimUserEnabled = z;
    }

    @Override // twitter4j.conf.Configuration
    public boolean isJSONStoreEnabled() {
        return this.jsonStoreEnabled;
    }

    protected final void setJSONStoreEnabled(boolean z) {
        this.jsonStoreEnabled = z;
    }

    @Override // twitter4j.conf.Configuration
    public boolean isMBeanEnabled() {
        return this.mbeanEnabled;
    }

    protected final void setMBeanEnabled(boolean z) {
        this.mbeanEnabled = z;
    }

    @Override // twitter4j.conf.Configuration
    public boolean isUserStreamRepliesAllEnabled() {
        return this.userStreamRepliesAllEnabled;
    }

    @Override // twitter4j.conf.Configuration
    public boolean isUserStreamWithFollowingsEnabled() {
        return this.userStreamWithFollowingsEnabled;
    }

    protected final void setUserStreamRepliesAllEnabled(boolean z) {
        this.userStreamRepliesAllEnabled = z;
    }

    protected final void setUserStreamWithFollowingsEnabled(boolean z) {
        this.userStreamWithFollowingsEnabled = z;
    }

    @Override // twitter4j.conf.Configuration
    public boolean isStallWarningsEnabled() {
        return this.stallWarningsEnabled;
    }

    protected final void setStallWarningsEnabled(boolean z) {
        this.stallWarningsEnabled = z;
    }

    @Override // twitter4j.conf.Configuration
    public boolean isApplicationOnlyAuthEnabled() {
        return this.applicationOnlyAuthEnabled;
    }

    protected final void setApplicationOnlyAuthEnabled(boolean z) {
        this.applicationOnlyAuthEnabled = z;
    }

    @Override // twitter4j.conf.Configuration
    public String getMediaProvider() {
        return this.mediaProvider;
    }

    protected final void setMediaProvider(String str) {
        this.mediaProvider = str;
    }

    @Override // twitter4j.conf.Configuration
    public String getMediaProviderAPIKey() {
        return this.mediaProviderAPIKey;
    }

    protected final void setMediaProviderAPIKey(String str) {
        this.mediaProviderAPIKey = str;
    }

    @Override // twitter4j.conf.Configuration
    public Properties getMediaProviderParameters() {
        return this.mediaProviderParameters;
    }

    protected final void setMediaProviderParameters(Properties properties) {
        this.mediaProviderParameters = properties;
    }

    static String fixURL(boolean z, String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf("://");
        if (-1 == iIndexOf) {
            throw new IllegalArgumentException("url should contain '://'");
        }
        String strSubstring = str.substring(iIndexOf + 3);
        if (z) {
            return "https://" + strSubstring;
        }
        return "http://" + strSubstring;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationBase configurationBase = (ConfigurationBase) obj;
        if (this.applicationOnlyAuthEnabled == configurationBase.applicationOnlyAuthEnabled && this.asyncNumThreads == configurationBase.asyncNumThreads && this.contributingTo == configurationBase.contributingTo && this.daemonEnabled == configurationBase.daemonEnabled && this.debug == configurationBase.debug && this.httpRetryCount == configurationBase.httpRetryCount && this.httpRetryIntervalSeconds == configurationBase.httpRetryIntervalSeconds && this.httpStreamingReadTimeout == configurationBase.httpStreamingReadTimeout && this.includeEntitiesEnabled == configurationBase.includeEntitiesEnabled && this.includeMyRetweetEnabled == configurationBase.includeMyRetweetEnabled && this.jsonStoreEnabled == configurationBase.jsonStoreEnabled && this.mbeanEnabled == configurationBase.mbeanEnabled && this.stallWarningsEnabled == configurationBase.stallWarningsEnabled && this.trimUserEnabled == configurationBase.trimUserEnabled && this.userStreamRepliesAllEnabled == configurationBase.userStreamRepliesAllEnabled && this.userStreamWithFollowingsEnabled == configurationBase.userStreamWithFollowingsEnabled) {
            if (this.dispatcherImpl == null ? configurationBase.dispatcherImpl != null : !this.dispatcherImpl.equals(configurationBase.dispatcherImpl)) {
                return false;
            }
            if (this.httpConf == null ? configurationBase.httpConf != null : !this.httpConf.equals(configurationBase.httpConf)) {
                return false;
            }
            if (this.loggerFactory == null ? configurationBase.loggerFactory != null : !this.loggerFactory.equals(configurationBase.loggerFactory)) {
                return false;
            }
            if (this.mediaProvider == null ? configurationBase.mediaProvider != null : !this.mediaProvider.equals(configurationBase.mediaProvider)) {
                return false;
            }
            if (this.mediaProviderAPIKey == null ? configurationBase.mediaProviderAPIKey != null : !this.mediaProviderAPIKey.equals(configurationBase.mediaProviderAPIKey)) {
                return false;
            }
            if (this.mediaProviderParameters == null ? configurationBase.mediaProviderParameters != null : !this.mediaProviderParameters.equals(configurationBase.mediaProviderParameters)) {
                return false;
            }
            if (this.oAuth2AccessToken == null ? configurationBase.oAuth2AccessToken != null : !this.oAuth2AccessToken.equals(configurationBase.oAuth2AccessToken)) {
                return false;
            }
            if (this.oAuth2InvalidateTokenURL == null ? configurationBase.oAuth2InvalidateTokenURL != null : !this.oAuth2InvalidateTokenURL.equals(configurationBase.oAuth2InvalidateTokenURL)) {
                return false;
            }
            if (this.oAuth2TokenType == null ? configurationBase.oAuth2TokenType != null : !this.oAuth2TokenType.equals(configurationBase.oAuth2TokenType)) {
                return false;
            }
            if (this.oAuth2TokenURL == null ? configurationBase.oAuth2TokenURL != null : !this.oAuth2TokenURL.equals(configurationBase.oAuth2TokenURL)) {
                return false;
            }
            if (this.oAuth2Scope == null ? configurationBase.oAuth2Scope != null : !this.oAuth2Scope.equals(configurationBase.oAuth2Scope)) {
                return false;
            }
            if (this.oAuthAccessToken == null ? configurationBase.oAuthAccessToken != null : !this.oAuthAccessToken.equals(configurationBase.oAuthAccessToken)) {
                return false;
            }
            if (this.oAuthAccessTokenSecret == null ? configurationBase.oAuthAccessTokenSecret != null : !this.oAuthAccessTokenSecret.equals(configurationBase.oAuthAccessTokenSecret)) {
                return false;
            }
            if (this.oAuthAccessTokenURL == null ? configurationBase.oAuthAccessTokenURL != null : !this.oAuthAccessTokenURL.equals(configurationBase.oAuthAccessTokenURL)) {
                return false;
            }
            if (this.oAuthAuthenticationURL == null ? configurationBase.oAuthAuthenticationURL != null : !this.oAuthAuthenticationURL.equals(configurationBase.oAuthAuthenticationURL)) {
                return false;
            }
            if (this.oAuthAuthorizationURL == null ? configurationBase.oAuthAuthorizationURL != null : !this.oAuthAuthorizationURL.equals(configurationBase.oAuthAuthorizationURL)) {
                return false;
            }
            if (this.oAuthConsumerKey == null ? configurationBase.oAuthConsumerKey != null : !this.oAuthConsumerKey.equals(configurationBase.oAuthConsumerKey)) {
                return false;
            }
            if (this.oAuthConsumerSecret == null ? configurationBase.oAuthConsumerSecret != null : !this.oAuthConsumerSecret.equals(configurationBase.oAuthConsumerSecret)) {
                return false;
            }
            if (this.oAuthRequestTokenURL == null ? configurationBase.oAuthRequestTokenURL != null : !this.oAuthRequestTokenURL.equals(configurationBase.oAuthRequestTokenURL)) {
                return false;
            }
            if (this.password == null ? configurationBase.password != null : !this.password.equals(configurationBase.password)) {
                return false;
            }
            if (this.restBaseURL == null ? configurationBase.restBaseURL != null : !this.restBaseURL.equals(configurationBase.restBaseURL)) {
                return false;
            }
            if (this.uploadBaseURL == null ? configurationBase.uploadBaseURL != null : !this.uploadBaseURL.equals(configurationBase.uploadBaseURL)) {
                return false;
            }
            if (this.siteStreamBaseURL == null ? configurationBase.siteStreamBaseURL != null : !this.siteStreamBaseURL.equals(configurationBase.siteStreamBaseURL)) {
                return false;
            }
            if (this.streamBaseURL == null ? configurationBase.streamBaseURL != null : !this.streamBaseURL.equals(configurationBase.streamBaseURL)) {
                return false;
            }
            if (this.user == null ? configurationBase.user != null : !this.user.equals(configurationBase.user)) {
                return false;
            }
            if (this.userStreamBaseURL != null) {
                if (this.userStreamBaseURL.equals(configurationBase.userStreamBaseURL)) {
                    return true;
                }
            } else if (configurationBase.userStreamBaseURL == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((this.mediaProviderParameters != null ? this.mediaProviderParameters.hashCode() : 0) + (((this.mediaProviderAPIKey != null ? this.mediaProviderAPIKey.hashCode() : 0) + (((this.mediaProvider != null ? this.mediaProvider.hashCode() : 0) + (((this.applicationOnlyAuthEnabled ? 1 : 0) + (((this.stallWarningsEnabled ? 1 : 0) + (((this.userStreamWithFollowingsEnabled ? 1 : 0) + (((this.userStreamRepliesAllEnabled ? 1 : 0) + (((this.mbeanEnabled ? 1 : 0) + (((this.jsonStoreEnabled ? 1 : 0) + (((this.trimUserEnabled ? 1 : 0) + (((this.includeEntitiesEnabled ? 1 : 0) + (((this.includeMyRetweetEnabled ? 1 : 0) + (((((this.loggerFactory != null ? this.loggerFactory.hashCode() : 0) + (((((this.dispatcherImpl != null ? this.dispatcherImpl.hashCode() : 0) + (((this.siteStreamBaseURL != null ? this.siteStreamBaseURL.hashCode() : 0) + (((this.userStreamBaseURL != null ? this.userStreamBaseURL.hashCode() : 0) + (((this.streamBaseURL != null ? this.streamBaseURL.hashCode() : 0) + (((this.uploadBaseURL != null ? this.uploadBaseURL.hashCode() : 0) + (((this.restBaseURL != null ? this.restBaseURL.hashCode() : 0) + (((this.oAuth2InvalidateTokenURL != null ? this.oAuth2InvalidateTokenURL.hashCode() : 0) + (((this.oAuth2TokenURL != null ? this.oAuth2TokenURL.hashCode() : 0) + (((this.oAuthAuthenticationURL != null ? this.oAuthAuthenticationURL.hashCode() : 0) + (((this.oAuthAccessTokenURL != null ? this.oAuthAccessTokenURL.hashCode() : 0) + (((this.oAuthAuthorizationURL != null ? this.oAuthAuthorizationURL.hashCode() : 0) + (((this.oAuthRequestTokenURL != null ? this.oAuthRequestTokenURL.hashCode() : 0) + (((this.oAuth2Scope != null ? this.oAuth2Scope.hashCode() : 0) + (((this.oAuth2AccessToken != null ? this.oAuth2AccessToken.hashCode() : 0) + (((this.oAuth2TokenType != null ? this.oAuth2TokenType.hashCode() : 0) + (((this.oAuthAccessTokenSecret != null ? this.oAuthAccessTokenSecret.hashCode() : 0) + (((this.oAuthAccessToken != null ? this.oAuthAccessToken.hashCode() : 0) + (((this.oAuthConsumerSecret != null ? this.oAuthConsumerSecret.hashCode() : 0) + (((this.oAuthConsumerKey != null ? this.oAuthConsumerKey.hashCode() : 0) + (((((((((this.httpConf != null ? this.httpConf.hashCode() : 0) + (((this.password != null ? this.password.hashCode() : 0) + (((this.user != null ? this.user.hashCode() : 0) + ((this.debug ? 1 : 0) * 31)) * 31)) * 31)) * 31) + this.httpStreamingReadTimeout) * 31) + this.httpRetryCount) * 31) + this.httpRetryIntervalSeconds) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.asyncNumThreads) * 31)) * 31) + ((int) (this.contributingTo ^ (this.contributingTo >>> 32)))) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.daemonEnabled ? 1 : 0);
    }

    public String toString() {
        return "ConfigurationBase{debug=" + this.debug + ", user='" + this.user + "', password='" + this.password + "', httpConf=" + this.httpConf + ", httpStreamingReadTimeout=" + this.httpStreamingReadTimeout + ", httpRetryCount=" + this.httpRetryCount + ", httpRetryIntervalSeconds=" + this.httpRetryIntervalSeconds + ", oAuthConsumerKey='" + this.oAuthConsumerKey + "', oAuthConsumerSecret='" + this.oAuthConsumerSecret + "', oAuthAccessToken='" + this.oAuthAccessToken + "', oAuthAccessTokenSecret='" + this.oAuthAccessTokenSecret + "', oAuth2TokenType='" + this.oAuth2TokenType + "', oAuth2AccessToken='" + this.oAuth2AccessToken + "', oAuth2Scope='" + this.oAuth2Scope + "', oAuthRequestTokenURL='" + this.oAuthRequestTokenURL + "', oAuthAuthorizationURL='" + this.oAuthAuthorizationURL + "', oAuthAccessTokenURL='" + this.oAuthAccessTokenURL + "', oAuthAuthenticationURL='" + this.oAuthAuthenticationURL + "', oAuth2TokenURL='" + this.oAuth2TokenURL + "', oAuth2InvalidateTokenURL='" + this.oAuth2InvalidateTokenURL + "', restBaseURL='" + this.restBaseURL + "', uploadBaseURL='" + this.uploadBaseURL + "', streamBaseURL='" + this.streamBaseURL + "', userStreamBaseURL='" + this.userStreamBaseURL + "', siteStreamBaseURL='" + this.siteStreamBaseURL + "', dispatcherImpl='" + this.dispatcherImpl + "', asyncNumThreads=" + this.asyncNumThreads + ", loggerFactory='" + this.loggerFactory + "', contributingTo=" + this.contributingTo + ", includeMyRetweetEnabled=" + this.includeMyRetweetEnabled + ", includeEntitiesEnabled=" + this.includeEntitiesEnabled + ", trimUserEnabled=" + this.trimUserEnabled + ", jsonStoreEnabled=" + this.jsonStoreEnabled + ", mbeanEnabled=" + this.mbeanEnabled + ", userStreamRepliesAllEnabled=" + this.userStreamRepliesAllEnabled + ", userStreamWithFollowingsEnabled=" + this.userStreamWithFollowingsEnabled + ", stallWarningsEnabled=" + this.stallWarningsEnabled + ", applicationOnlyAuthEnabled=" + this.applicationOnlyAuthEnabled + ", mediaProvider='" + this.mediaProvider + "', mediaProviderAPIKey='" + this.mediaProviderAPIKey + "', mediaProviderParameters=" + this.mediaProviderParameters + ", daemonEnabled=" + this.daemonEnabled + '}';
    }

    private static void cacheInstance(ConfigurationBase configurationBase) {
        if (!instances.contains(configurationBase)) {
            instances.add(configurationBase);
        }
    }

    protected void cacheInstance() {
        cacheInstance(this);
    }

    private static ConfigurationBase getInstance(ConfigurationBase configurationBase) {
        int iIndexOf = instances.indexOf(configurationBase);
        if (iIndexOf != -1) {
            return (ConfigurationBase) instances.get(iIndexOf);
        }
        instances.add(configurationBase);
        return configurationBase;
    }

    protected Object readResolve() {
        return getInstance(this);
    }
}
