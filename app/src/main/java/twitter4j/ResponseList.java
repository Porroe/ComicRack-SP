package twitter4j;

import java.util.List;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface ResponseList extends List, TwitterResponse {
    @Override // twitter4j.TwitterResponse
    RateLimitStatus getRateLimitStatus();
}
