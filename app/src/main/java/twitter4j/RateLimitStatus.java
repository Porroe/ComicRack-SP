package twitter4j;

import java.io.Serializable;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface RateLimitStatus extends Serializable {
    int getLimit();

    int getRemaining();

    int getResetTimeInSeconds();

    int getSecondsUntilReset();
}
