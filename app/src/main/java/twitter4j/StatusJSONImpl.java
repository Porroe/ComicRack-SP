package twitter4j;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class StatusJSONImpl extends TwitterResponseImpl implements Serializable, Status {
    private static final Logger logger = Logger.getLogger(StatusJSONImpl.class);
    private static final long serialVersionUID = -6461195536943679985L;
    private long[] contributorsIDs;
    private Date createdAt;
    private long currentUserRetweetId;
    private MediaEntity[] extendedMediaEntities;
    private int favoriteCount;
    private GeoLocation geoLocation;
    private HashtagEntity[] hashtagEntities;

    /* renamed from: id */
    private long f3741id;
    private String inReplyToScreenName;
    private long inReplyToStatusId;
    private long inReplyToUserId;
    private boolean isFavorited;
    private boolean isPossiblySensitive;
    private boolean isRetweeted;
    private boolean isTruncated;
    private String lang;
    private MediaEntity[] mediaEntities;
    private Place place;
    private long retweetCount;
    private Status retweetedStatus;
    private Scopes scopes;
    private String source;
    private SymbolEntity[] symbolEntities;
    private String text;
    private URLEntity[] urlEntities;
    private User user;
    private UserMentionEntity[] userMentionEntities;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((Status) obj);
    }

    StatusJSONImpl(HttpResponse httpResponse, Configuration configuration) throws TwitterException, IOException {
        super(httpResponse);
        this.geoLocation = null;
        this.place = null;
        this.currentUserRetweetId = -1L;
        this.user = null;
        JSONObject jSONObjectAsJSONObject = httpResponse.asJSONObject();
        init(jSONObjectAsJSONObject);
        if (configuration.isJSONStoreEnabled()) {
            TwitterObjectFactory.clearThreadLocalMap();
            TwitterObjectFactory.registerJSONObject(this, jSONObjectAsJSONObject);
        }
    }

    StatusJSONImpl(JSONObject jSONObject, Configuration configuration) throws TwitterException {
        this.geoLocation = null;
        this.place = null;
        this.currentUserRetweetId = -1L;
        this.user = null;
        init(jSONObject);
        if (configuration.isJSONStoreEnabled()) {
            TwitterObjectFactory.registerJSONObject(this, jSONObject);
        }
    }

    StatusJSONImpl(JSONObject jSONObject) throws TwitterException {
        this.geoLocation = null;
        this.place = null;
        this.currentUserRetweetId = -1L;
        this.user = null;
        init(jSONObject);
    }

    StatusJSONImpl() {
        this.geoLocation = null;
        this.place = null;
        this.currentUserRetweetId = -1L;
        this.user = null;
    }

    private void init(JSONObject jSONObject) throws TwitterException {
        this.f3741id = ParseUtil.getLong("id", jSONObject);
        this.source = ParseUtil.getUnescapedString("source", jSONObject);
        this.createdAt = ParseUtil.getDate("created_at", jSONObject);
        this.isTruncated = ParseUtil.getBoolean("truncated", jSONObject);
        this.inReplyToStatusId = ParseUtil.getLong("in_reply_to_status_id", jSONObject);
        this.inReplyToUserId = ParseUtil.getLong("in_reply_to_user_id", jSONObject);
        this.isFavorited = ParseUtil.getBoolean("favorited", jSONObject);
        this.isRetweeted = ParseUtil.getBoolean("retweeted", jSONObject);
        this.inReplyToScreenName = ParseUtil.getUnescapedString("in_reply_to_screen_name", jSONObject);
        this.retweetCount = ParseUtil.getLong("retweet_count", jSONObject);
        this.favoriteCount = ParseUtil.getInt("favorite_count", jSONObject);
        this.isPossiblySensitive = ParseUtil.getBoolean("possibly_sensitive", jSONObject);
        try {
            if (!jSONObject.isNull("user")) {
                this.user = new UserJSONImpl(jSONObject.getJSONObject("user"));
            }
            this.geoLocation = JSONImplFactory.createGeoLocation(jSONObject);
            if (!jSONObject.isNull("place")) {
                this.place = new PlaceJSONImpl(jSONObject.getJSONObject("place"));
            }
            if (!jSONObject.isNull("retweeted_status")) {
                this.retweetedStatus = new StatusJSONImpl(jSONObject.getJSONObject("retweeted_status"));
            }
            if (!jSONObject.isNull("contributors")) {
                JSONArray jSONArray = jSONObject.getJSONArray("contributors");
                this.contributorsIDs = new long[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.contributorsIDs[i] = Long.parseLong(jSONArray.getString(i));
                }
            } else {
                this.contributorsIDs = new long[0];
            }
            if (!jSONObject.isNull("entities")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("entities");
                if (!jSONObject2.isNull("user_mentions")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("user_mentions");
                    int length = jSONArray2.length();
                    this.userMentionEntities = new UserMentionEntity[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        this.userMentionEntities[i2] = new UserMentionEntityJSONImpl(jSONArray2.getJSONObject(i2));
                    }
                }
                if (!jSONObject2.isNull("urls")) {
                    JSONArray jSONArray3 = jSONObject2.getJSONArray("urls");
                    int length2 = jSONArray3.length();
                    this.urlEntities = new URLEntity[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        this.urlEntities[i3] = new URLEntityJSONImpl(jSONArray3.getJSONObject(i3));
                    }
                }
                if (!jSONObject2.isNull("hashtags")) {
                    JSONArray jSONArray4 = jSONObject2.getJSONArray("hashtags");
                    int length3 = jSONArray4.length();
                    this.hashtagEntities = new HashtagEntity[length3];
                    for (int i4 = 0; i4 < length3; i4++) {
                        this.hashtagEntities[i4] = new HashtagEntityJSONImpl(jSONArray4.getJSONObject(i4));
                    }
                }
                if (!jSONObject2.isNull("symbols")) {
                    JSONArray jSONArray5 = jSONObject2.getJSONArray("symbols");
                    int length4 = jSONArray5.length();
                    this.symbolEntities = new SymbolEntity[length4];
                    for (int i5 = 0; i5 < length4; i5++) {
                        this.symbolEntities[i5] = new HashtagEntityJSONImpl(jSONArray5.getJSONObject(i5));
                    }
                }
                if (!jSONObject2.isNull("media")) {
                    JSONArray jSONArray6 = jSONObject2.getJSONArray("media");
                    int length5 = jSONArray6.length();
                    this.mediaEntities = new MediaEntity[length5];
                    for (int i6 = 0; i6 < length5; i6++) {
                        this.mediaEntities[i6] = new MediaEntityJSONImpl(jSONArray6.getJSONObject(i6));
                    }
                }
            }
            if (!jSONObject.isNull("extended_entities")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("extended_entities");
                if (!jSONObject3.isNull("media")) {
                    JSONArray jSONArray7 = jSONObject3.getJSONArray("media");
                    int length6 = jSONArray7.length();
                    this.extendedMediaEntities = new MediaEntity[length6];
                    for (int i7 = 0; i7 < length6; i7++) {
                        this.extendedMediaEntities[i7] = new MediaEntityJSONImpl(jSONArray7.getJSONObject(i7));
                    }
                }
            }
            this.userMentionEntities = this.userMentionEntities == null ? new UserMentionEntity[0] : this.userMentionEntities;
            this.urlEntities = this.urlEntities == null ? new URLEntity[0] : this.urlEntities;
            this.hashtagEntities = this.hashtagEntities == null ? new HashtagEntity[0] : this.hashtagEntities;
            this.symbolEntities = this.symbolEntities == null ? new SymbolEntity[0] : this.symbolEntities;
            this.mediaEntities = this.mediaEntities == null ? new MediaEntity[0] : this.mediaEntities;
            this.extendedMediaEntities = this.extendedMediaEntities == null ? new MediaEntity[0] : this.extendedMediaEntities;
            this.text = HTMLEntity.unescapeAndSlideEntityIncdices(jSONObject.getString("text"), this.userMentionEntities, this.urlEntities, this.hashtagEntities, this.mediaEntities);
            if (!jSONObject.isNull("current_user_retweet")) {
                this.currentUserRetweetId = jSONObject.getJSONObject("current_user_retweet").getLong("id");
            }
            if (!jSONObject.isNull("lang")) {
                this.lang = ParseUtil.getUnescapedString("lang", jSONObject);
            }
            if (!jSONObject.isNull("scopes")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("scopes");
                if (!jSONObject4.isNull("place_ids")) {
                    JSONArray jSONArray8 = jSONObject4.getJSONArray("place_ids");
                    int length7 = jSONArray8.length();
                    String[] strArr = new String[length7];
                    for (int i8 = 0; i8 < length7; i8++) {
                        strArr[i8] = jSONArray8.getString(i8);
                    }
                    this.scopes = new ScopesImpl(strArr);
                }
            }
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    public final int compareTo(Status status) {
        long id = this.f3741id - status.getId();
        if (id < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        if (id > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) id;
    }

    @Override // twitter4j.Status
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Override // twitter4j.Status
    public final long getId() {
        return this.f3741id;
    }

    @Override // twitter4j.Status
    public final String getText() {
        return this.text;
    }

    @Override // twitter4j.Status
    public final String getSource() {
        return this.source;
    }

    @Override // twitter4j.Status
    public final boolean isTruncated() {
        return this.isTruncated;
    }

    @Override // twitter4j.Status
    public final long getInReplyToStatusId() {
        return this.inReplyToStatusId;
    }

    @Override // twitter4j.Status
    public final long getInReplyToUserId() {
        return this.inReplyToUserId;
    }

    @Override // twitter4j.Status
    public final String getInReplyToScreenName() {
        return this.inReplyToScreenName;
    }

    @Override // twitter4j.Status
    public final GeoLocation getGeoLocation() {
        return this.geoLocation;
    }

    @Override // twitter4j.Status
    public final Place getPlace() {
        return this.place;
    }

    @Override // twitter4j.Status
    public final long[] getContributors() {
        return this.contributorsIDs;
    }

    @Override // twitter4j.Status
    public final boolean isFavorited() {
        return this.isFavorited;
    }

    @Override // twitter4j.Status
    public final boolean isRetweeted() {
        return this.isRetweeted;
    }

    @Override // twitter4j.Status
    public final int getFavoriteCount() {
        return this.favoriteCount;
    }

    @Override // twitter4j.Status
    public final User getUser() {
        return this.user;
    }

    @Override // twitter4j.Status
    public final boolean isRetweet() {
        return this.retweetedStatus != null;
    }

    @Override // twitter4j.Status
    public final Status getRetweetedStatus() {
        return this.retweetedStatus;
    }

    @Override // twitter4j.Status
    public final int getRetweetCount() {
        return (int) this.retweetCount;
    }

    @Override // twitter4j.Status
    public final boolean isRetweetedByMe() {
        return this.currentUserRetweetId != -1;
    }

    @Override // twitter4j.Status
    public final long getCurrentUserRetweetId() {
        return this.currentUserRetweetId;
    }

    @Override // twitter4j.Status
    public final boolean isPossiblySensitive() {
        return this.isPossiblySensitive;
    }

    @Override // twitter4j.EntitySupport
    public final UserMentionEntity[] getUserMentionEntities() {
        return this.userMentionEntities;
    }

    @Override // twitter4j.EntitySupport
    public final URLEntity[] getURLEntities() {
        return this.urlEntities;
    }

    @Override // twitter4j.EntitySupport
    public final HashtagEntity[] getHashtagEntities() {
        return this.hashtagEntities;
    }

    @Override // twitter4j.EntitySupport
    public final MediaEntity[] getMediaEntities() {
        return this.mediaEntities;
    }

    @Override // twitter4j.EntitySupport
    public final MediaEntity[] getExtendedMediaEntities() {
        return this.extendedMediaEntities;
    }

    @Override // twitter4j.EntitySupport
    public final SymbolEntity[] getSymbolEntities() {
        return this.symbolEntities;
    }

    @Override // twitter4j.Status
    public final Scopes getScopes() {
        return this.scopes;
    }

    @Override // twitter4j.Status
    public final String getLang() {
        return this.lang;
    }

    static ResponseList createStatusList(HttpResponse httpResponse, Configuration configuration) throws TwitterException, IOException {
        try {
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.clearThreadLocalMap();
            }
            JSONArray jSONArrayAsJSONArray = httpResponse.asJSONArray();
            int length = jSONArrayAsJSONArray.length();
            ResponseListImpl responseListImpl = new ResponseListImpl(length, httpResponse);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArrayAsJSONArray.getJSONObject(i);
                StatusJSONImpl statusJSONImpl = new StatusJSONImpl(jSONObject);
                if (configuration.isJSONStoreEnabled()) {
                    TwitterObjectFactory.registerJSONObject(statusJSONImpl, jSONObject);
                }
                responseListImpl.add(statusJSONImpl);
            }
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.registerJSONObject(responseListImpl, jSONArrayAsJSONArray);
            }
            return responseListImpl;
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    public final int hashCode() {
        return (int) this.f3741id;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof Status) && ((Status) obj).getId() == this.f3741id;
    }

    public final String toString() {
        return "StatusJSONImpl{createdAt=" + this.createdAt + ", id=" + this.f3741id + ", text='" + this.text + "', source='" + this.source + "', isTruncated=" + this.isTruncated + ", inReplyToStatusId=" + this.inReplyToStatusId + ", inReplyToUserId=" + this.inReplyToUserId + ", isFavorited=" + this.isFavorited + ", isRetweeted=" + this.isRetweeted + ", favoriteCount=" + this.favoriteCount + ", inReplyToScreenName='" + this.inReplyToScreenName + "', geoLocation=" + this.geoLocation + ", place=" + this.place + ", retweetCount=" + this.retweetCount + ", isPossiblySensitive=" + this.isPossiblySensitive + ", lang='" + this.lang + "', contributorsIDs=" + Arrays.toString(this.contributorsIDs) + ", retweetedStatus=" + this.retweetedStatus + ", userMentionEntities=" + Arrays.toString(this.userMentionEntities) + ", urlEntities=" + Arrays.toString(this.urlEntities) + ", hashtagEntities=" + Arrays.toString(this.hashtagEntities) + ", mediaEntities=" + Arrays.toString(this.mediaEntities) + ", symbolEntities=" + Arrays.toString(this.symbolEntities) + ", currentUserRetweetId=" + this.currentUserRetweetId + ", user=" + this.user + '}';
    }
}
