package twitter4j.api;

import twitter4j.GeoLocation;
import twitter4j.GeoQuery;
import twitter4j.Place;
import twitter4j.ResponseList;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface PlacesGeoResources {
    Place getGeoDetails(String str);

    ResponseList getSimilarPlaces(GeoLocation geoLocation, String str, String str2, String str3);

    ResponseList reverseGeoCode(GeoQuery geoQuery);

    ResponseList searchPlaces(GeoQuery geoQuery);
}
