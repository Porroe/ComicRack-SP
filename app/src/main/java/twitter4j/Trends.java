package twitter4j;

import java.io.Serializable;
import java.util.Date;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface Trends extends Serializable, Comparable, TwitterResponse {
    Date getAsOf();

    Location getLocation();

    Date getTrendAt();

    Trend[] getTrends();
}
