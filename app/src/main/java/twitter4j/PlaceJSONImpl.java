package twitter4j;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class PlaceJSONImpl extends TwitterResponseImpl implements Serializable, Place {
    private static final long serialVersionUID = -6368276880878829754L;
    private GeoLocation[][] boundingBoxCoordinates;
    private String boundingBoxType;
    private Place[] containedWithIn;
    private String country;
    private String countryCode;
    private String fullName;
    private GeoLocation[][] geometryCoordinates;
    private String geometryType;

    /* renamed from: id */
    private String f3737id;
    private String name;
    private String placeType;
    private String streetAddress;
    private String url;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((Place) obj);
    }

    PlaceJSONImpl(HttpResponse httpResponse, Configuration configuration) throws TwitterException, IOException {
        super(httpResponse);
        JSONObject jSONObjectAsJSONObject = httpResponse.asJSONObject();
        init(jSONObjectAsJSONObject);
        if (configuration.isJSONStoreEnabled()) {
            TwitterObjectFactory.clearThreadLocalMap();
            TwitterObjectFactory.registerJSONObject(this, jSONObjectAsJSONObject);
        }
    }

    PlaceJSONImpl(JSONObject jSONObject) throws TwitterException {
        init(jSONObject);
    }

    PlaceJSONImpl() {
    }

    private void init(JSONObject jSONObject) throws TwitterException {
        try {
            this.name = ParseUtil.getUnescapedString("name", jSONObject);
            this.streetAddress = ParseUtil.getUnescapedString("street_address", jSONObject);
            this.countryCode = ParseUtil.getRawString("country_code", jSONObject);
            this.f3737id = ParseUtil.getRawString("id", jSONObject);
            this.country = ParseUtil.getRawString("country", jSONObject);
            if (!jSONObject.isNull("place_type")) {
                this.placeType = ParseUtil.getRawString("place_type", jSONObject);
            } else {
                this.placeType = ParseUtil.getRawString("type", jSONObject);
            }
            this.url = ParseUtil.getRawString("url", jSONObject);
            this.fullName = ParseUtil.getRawString("full_name", jSONObject);
            if (!jSONObject.isNull("bounding_box")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("bounding_box");
                this.boundingBoxType = ParseUtil.getRawString("type", jSONObject2);
                this.boundingBoxCoordinates = JSONImplFactory.coordinatesAsGeoLocationArray(jSONObject2.getJSONArray("coordinates"));
            } else {
                this.boundingBoxType = null;
                this.boundingBoxCoordinates = null;
            }
            if (!jSONObject.isNull("geometry")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("geometry");
                this.geometryType = ParseUtil.getRawString("type", jSONObject3);
                JSONArray jSONArray = jSONObject3.getJSONArray("coordinates");
                if (this.geometryType.equals("Point")) {
                    this.geometryCoordinates = (GeoLocation[][]) Array.newInstance((Class<?>) GeoLocation.class, 1, 1);
                    this.geometryCoordinates[0][0] = new GeoLocation(jSONArray.getDouble(1), jSONArray.getDouble(0));
                } else if (this.geometryType.equals("Polygon")) {
                    this.geometryCoordinates = JSONImplFactory.coordinatesAsGeoLocationArray(jSONArray);
                } else {
                    this.geometryType = null;
                    this.geometryCoordinates = null;
                }
            } else {
                this.geometryType = null;
                this.geometryCoordinates = null;
            }
            if (!jSONObject.isNull("contained_within")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("contained_within");
                this.containedWithIn = new Place[jSONArray2.length()];
                for (int i = 0; i < jSONArray2.length(); i++) {
                    this.containedWithIn[i] = new PlaceJSONImpl(jSONArray2.getJSONObject(i));
                }
                return;
            }
            this.containedWithIn = null;
        } catch (JSONException e) {
            throw new TwitterException(e.getMessage() + ":" + jSONObject.toString(), e);
        }
    }

    public final int compareTo(Place place) {
        return this.f3737id.compareTo(place.getId());
    }

    static ResponseList createPlaceList(HttpResponse httpResponse, Configuration configuration) throws TwitterException, IOException {
        JSONObject jSONObjectAsJSONObject = null;
        try {
            jSONObjectAsJSONObject = httpResponse.asJSONObject();
            return createPlaceList(jSONObjectAsJSONObject.getJSONObject("result").getJSONArray("places"), httpResponse, configuration);
        } catch (JSONException e) {
            throw new TwitterException(e.getMessage() + ":" + jSONObjectAsJSONObject.toString(), e);
        }
    }

    static ResponseList createPlaceList(JSONArray jSONArray, HttpResponse httpResponse, Configuration configuration) throws TwitterException {
        if (configuration.isJSONStoreEnabled()) {
            TwitterObjectFactory.clearThreadLocalMap();
        }
        try {
            int length = jSONArray.length();
            ResponseListImpl responseListImpl = new ResponseListImpl(length, httpResponse);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                PlaceJSONImpl placeJSONImpl = new PlaceJSONImpl(jSONObject);
                responseListImpl.add(placeJSONImpl);
                if (configuration.isJSONStoreEnabled()) {
                    TwitterObjectFactory.registerJSONObject(placeJSONImpl, jSONObject);
                }
            }
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.registerJSONObject(responseListImpl, jSONArray);
            }
            return responseListImpl;
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    @Override // twitter4j.Place
    public final String getName() {
        return this.name;
    }

    @Override // twitter4j.Place
    public final String getStreetAddress() {
        return this.streetAddress;
    }

    @Override // twitter4j.Place
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Override // twitter4j.Place
    public final String getId() {
        return this.f3737id;
    }

    @Override // twitter4j.Place
    public final String getCountry() {
        return this.country;
    }

    @Override // twitter4j.Place
    public final String getPlaceType() {
        return this.placeType;
    }

    @Override // twitter4j.Place
    public final String getURL() {
        return this.url;
    }

    @Override // twitter4j.Place
    public final String getFullName() {
        return this.fullName;
    }

    @Override // twitter4j.Place
    public final String getBoundingBoxType() {
        return this.boundingBoxType;
    }

    @Override // twitter4j.Place
    public final GeoLocation[][] getBoundingBoxCoordinates() {
        return this.boundingBoxCoordinates;
    }

    @Override // twitter4j.Place
    public final String getGeometryType() {
        return this.geometryType;
    }

    @Override // twitter4j.Place
    public final GeoLocation[][] getGeometryCoordinates() {
        return this.geometryCoordinates;
    }

    @Override // twitter4j.Place
    public final Place[] getContainedWithIn() {
        return this.containedWithIn;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof Place) && ((Place) obj).getId().equals(this.f3737id);
    }

    public final int hashCode() {
        return this.f3737id.hashCode();
    }

    public final String toString() {
        return "PlaceJSONImpl{name='" + this.name + "', streetAddress='" + this.streetAddress + "', countryCode='" + this.countryCode + "', id='" + this.f3737id + "', country='" + this.country + "', placeType='" + this.placeType + "', url='" + this.url + "', fullName='" + this.fullName + "', boundingBoxType='" + this.boundingBoxType + "', boundingBoxCoordinates=" + (this.boundingBoxCoordinates == null ? null : Arrays.asList(this.boundingBoxCoordinates)) + ", geometryType='" + this.geometryType + "', geometryCoordinates=" + (this.geometryCoordinates == null ? null : Arrays.asList(this.geometryCoordinates)) + ", containedWithIn=" + (this.containedWithIn != null ? Arrays.asList(this.containedWithIn) : null) + '}';
    }
}
