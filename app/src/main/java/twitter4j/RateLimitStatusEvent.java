package twitter4j;

import java.util.EventObject;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public final class RateLimitStatusEvent extends EventObject {
    private static final long serialVersionUID = 3749366911109722414L;
    private final boolean isAccountRateLimitStatus;
    private final RateLimitStatus rateLimitStatus;

    RateLimitStatusEvent(Object obj, RateLimitStatus rateLimitStatus, boolean z) {
        super(obj);
        this.rateLimitStatus = rateLimitStatus;
        this.isAccountRateLimitStatus = z;
    }

    public final RateLimitStatus getRateLimitStatus() {
        return this.rateLimitStatus;
    }

    public final boolean isAccountRateLimitStatus() {
        return this.isAccountRateLimitStatus;
    }

    public final boolean isIPRateLimitStatus() {
        return !this.isAccountRateLimitStatus;
    }
}
