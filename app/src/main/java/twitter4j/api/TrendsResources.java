package twitter4j.api;

import twitter4j.GeoLocation;
import twitter4j.ResponseList;
import twitter4j.Trends;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface TrendsResources {
    ResponseList getAvailableTrends();

    ResponseList getClosestTrends(GeoLocation geoLocation);

    Trends getPlaceTrends(int i);
}
