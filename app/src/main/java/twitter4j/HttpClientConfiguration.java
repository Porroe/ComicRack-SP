package twitter4j;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface HttpClientConfiguration {
    int getHttpConnectionTimeout();

    String getHttpProxyHost();

    String getHttpProxyPassword();

    int getHttpProxyPort();

    String getHttpProxyUser();

    int getHttpReadTimeout();

    int getHttpRetryCount();

    int getHttpRetryIntervalSeconds();

    boolean isGZIPEnabled();

    boolean isPrettyDebugEnabled();
}
