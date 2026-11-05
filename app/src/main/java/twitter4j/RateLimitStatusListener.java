package twitter4j;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface RateLimitStatusListener {
    void onRateLimitReached(RateLimitStatusEvent rateLimitStatusEvent);

    void onRateLimitStatus(RateLimitStatusEvent rateLimitStatusEvent);
}
