package twitter4j;

import java.io.Serializable;
import java.util.List;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface QueryResult extends Serializable, TwitterResponse {
    double getCompletedIn();

    int getCount();

    long getMaxId();

    String getQuery();

    String getRefreshURL();

    long getSinceId();

    List getTweets();

    boolean hasNext();

    Query nextQuery();
}
