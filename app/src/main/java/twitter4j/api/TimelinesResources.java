package twitter4j.api;

import twitter4j.Paging;
import twitter4j.ResponseList;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface TimelinesResources {
    ResponseList getHomeTimeline();

    ResponseList getHomeTimeline(Paging paging);

    ResponseList getMentionsTimeline();

    ResponseList getMentionsTimeline(Paging paging);

    ResponseList getRetweetsOfMe();

    ResponseList getRetweetsOfMe(Paging paging);

    ResponseList getUserTimeline();

    ResponseList getUserTimeline(long j);

    ResponseList getUserTimeline(long j, Paging paging);

    ResponseList getUserTimeline(String str);

    ResponseList getUserTimeline(String str, Paging paging);

    ResponseList getUserTimeline(Paging paging);
}
