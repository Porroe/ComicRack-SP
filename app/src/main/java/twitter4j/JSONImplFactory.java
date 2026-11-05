package twitter4j;

import java.util.Map;
import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
class JSONImplFactory implements ObjectFactory {
    private static final long serialVersionUID = -1853541456182663343L;
    private final Configuration conf;

    public JSONImplFactory(Configuration configuration) {
        this.conf = configuration;
    }

    @Override // twitter4j.ObjectFactory
    public Status createStatus(JSONObject jSONObject) {
        return new StatusJSONImpl(jSONObject);
    }

    @Override // twitter4j.ObjectFactory
    public User createUser(JSONObject jSONObject) {
        return new UserJSONImpl(jSONObject);
    }

    @Override // twitter4j.ObjectFactory
    public UserList createAUserList(JSONObject jSONObject) {
        return new UserListJSONImpl(jSONObject);
    }

    @Override // twitter4j.ObjectFactory
    public Map createRateLimitStatuses(HttpResponse httpResponse) {
        return RateLimitStatusJSONImpl.createRateLimitStatuses(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public Status createStatus(HttpResponse httpResponse) {
        return new StatusJSONImpl(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public ResponseList createStatusList(HttpResponse httpResponse) {
        return StatusJSONImpl.createStatusList(httpResponse, this.conf);
    }

    static GeoLocation createGeoLocation(JSONObject jSONObject) throws TwitterException {
        try {
            if (!jSONObject.isNull("coordinates")) {
                String[] strArrSplit = jSONObject.getJSONObject("coordinates").getString("coordinates").substring(1, r0.length() - 1).split(",");
                return new GeoLocation(Double.parseDouble(strArrSplit[1]), Double.parseDouble(strArrSplit[0]));
            }
            return null;
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    static GeoLocation[][] coordinatesAsGeoLocationArray(JSONArray jSONArray) throws TwitterException {
        try {
            GeoLocation[][] geoLocationArr = new GeoLocation[jSONArray.length()][];
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                geoLocationArr[i] = new GeoLocation[jSONArray2.length()];
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONArray jSONArray3 = jSONArray2.getJSONArray(i2);
                    geoLocationArr[i][i2] = new GeoLocation(jSONArray3.getDouble(1), jSONArray3.getDouble(0));
                }
            }
            return geoLocationArr;
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    public static RateLimitStatus createRateLimitStatusFromResponseHeader(HttpResponse httpResponse) {
        return RateLimitStatusJSONImpl.createFromResponseHeader(httpResponse);
    }

    @Override // twitter4j.ObjectFactory
    public Trends createTrends(HttpResponse httpResponse) {
        return new TrendsJSONImpl(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public User createUser(HttpResponse httpResponse) {
        return new UserJSONImpl(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public ResponseList createUserList(HttpResponse httpResponse) {
        return UserJSONImpl.createUserList(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public ResponseList createUserListFromJSONArray(HttpResponse httpResponse) {
        return UserJSONImpl.createUserList(httpResponse.asJSONArray(), httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public ResponseList createUserListFromJSONArray_Users(HttpResponse httpResponse) throws TwitterException {
        try {
            return UserJSONImpl.createUserList(httpResponse.asJSONObject().getJSONArray("users"), httpResponse, this.conf);
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    @Override // twitter4j.ObjectFactory
    public QueryResult createQueryResult(HttpResponse httpResponse, Query query) throws TwitterException {
        try {
            return new QueryResultJSONImpl(httpResponse, this.conf);
        } catch (TwitterException e) {
            if (404 == e.getStatusCode()) {
                return new QueryResultJSONImpl(query);
            }
            throw e;
        }
    }

    @Override // twitter4j.ObjectFactory
    public IDs createIDs(HttpResponse httpResponse) {
        return new IDsJSONImpl(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public PagableResponseList createPagableUserList(HttpResponse httpResponse) {
        return UserJSONImpl.createPagableUserList(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public UserList createAUserList(HttpResponse httpResponse) {
        return new UserListJSONImpl(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public PagableResponseList createPagableUserListList(HttpResponse httpResponse) {
        return UserListJSONImpl.createPagableUserListList(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public ResponseList createUserListList(HttpResponse httpResponse) {
        return UserListJSONImpl.createUserListList(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public ResponseList createCategoryList(HttpResponse httpResponse) {
        return CategoryJSONImpl.createCategoriesList(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public DirectMessage createDirectMessage(HttpResponse httpResponse) {
        return new DirectMessageJSONImpl(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public ResponseList createDirectMessageList(HttpResponse httpResponse) {
        return DirectMessageJSONImpl.createDirectMessageList(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public Relationship createRelationship(HttpResponse httpResponse) {
        return new RelationshipJSONImpl(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public ResponseList createFriendshipList(HttpResponse httpResponse) {
        return FriendshipJSONImpl.createFriendshipList(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public AccountTotals createAccountTotals(HttpResponse httpResponse) {
        return new AccountTotalsJSONImpl(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public AccountSettings createAccountSettings(HttpResponse httpResponse) {
        return new AccountSettingsJSONImpl(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public SavedSearch createSavedSearch(HttpResponse httpResponse) {
        return new SavedSearchJSONImpl(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public ResponseList createSavedSearchList(HttpResponse httpResponse) {
        return SavedSearchJSONImpl.createSavedSearchList(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public ResponseList createLocationList(HttpResponse httpResponse) {
        return LocationJSONImpl.createLocationList(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public Place createPlace(HttpResponse httpResponse) {
        return new PlaceJSONImpl(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public ResponseList createPlaceList(HttpResponse httpResponse) throws TwitterException {
        try {
            return PlaceJSONImpl.createPlaceList(httpResponse, this.conf);
        } catch (TwitterException e) {
            if (e.getStatusCode() == 404) {
                return new ResponseListImpl(0, (HttpResponse) null);
            }
            throw e;
        }
    }

    @Override // twitter4j.ObjectFactory
    public TwitterAPIConfiguration createTwitterAPIConfiguration(HttpResponse httpResponse) {
        return new TwitterAPIConfigurationJSONImpl(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public ResponseList createLanguageList(HttpResponse httpResponse) {
        return LanguageJSONImpl.createLanguageList(httpResponse, this.conf);
    }

    @Override // twitter4j.ObjectFactory
    public ResponseList createEmptyResponseList() {
        return new ResponseListImpl(0, (HttpResponse) null);
    }

    @Override // twitter4j.ObjectFactory
    public OEmbed createOEmbed(HttpResponse httpResponse) {
        return new OEmbedJSONImpl(httpResponse, this.conf);
    }

    public static HashtagEntity createHashtagEntity(int i, int i2, String str) {
        return new HashtagEntityJSONImpl(i, i2, str);
    }

    public static UserMentionEntity createUserMentionEntity(int i, int i2, String str, String str2, long j) {
        return new UserMentionEntityJSONImpl(i, i2, str, str2, j);
    }

    public static URLEntity createUrlEntity(int i, int i2, String str, String str2, String str3) {
        return new URLEntityJSONImpl(i, i2, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JSONImplFactory)) {
            return false;
        }
        JSONImplFactory jSONImplFactory = (JSONImplFactory) obj;
        if (this.conf != null) {
            if (this.conf.equals(jSONImplFactory.conf)) {
                return true;
            }
        } else if (jSONImplFactory.conf == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.conf != null) {
            return this.conf.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "JSONImplFactory{conf=" + this.conf + '}';
    }
}
