package twitter4j;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class UserJSONImpl extends TwitterResponseImpl implements Serializable, User {
    private static final long serialVersionUID = -5448266606847617015L;
    private Date createdAt;
    private String description;
    private URLEntity[] descriptionURLEntities;
    private int favouritesCount;
    private int followersCount;
    private int friendsCount;

    /* renamed from: id */
    private long f3743id;
    private boolean isContributorsEnabled;
    private boolean isDefaultProfile;
    private boolean isDefaultProfileImage;
    private boolean isFollowRequestSent;
    private boolean isGeoEnabled;
    private boolean isProtected;
    private boolean isVerified;
    private String lang;
    private int listedCount;
    private String location;
    private String name;
    private String profileBackgroundColor;
    private String profileBackgroundImageUrl;
    private String profileBackgroundImageUrlHttps;
    private boolean profileBackgroundTiled;
    private String profileBannerImageUrl;
    private String profileImageUrl;
    private String profileImageUrlHttps;
    private String profileLinkColor;
    private String profileSidebarBorderColor;
    private String profileSidebarFillColor;
    private String profileTextColor;
    private boolean profileUseBackgroundImage;
    private String screenName;
    private boolean showAllInlineMedia;
    private Status status;
    private int statusesCount;
    private String timeZone;
    private boolean translator;
    private String url;
    private URLEntity urlEntity;
    private int utcOffset;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((User) obj);
    }

    UserJSONImpl(HttpResponse httpResponse, Configuration configuration) throws TwitterException, IOException {
        super(httpResponse);
        if (configuration.isJSONStoreEnabled()) {
            TwitterObjectFactory.clearThreadLocalMap();
        }
        JSONObject jSONObjectAsJSONObject = httpResponse.asJSONObject();
        init(jSONObjectAsJSONObject);
        if (configuration.isJSONStoreEnabled()) {
            TwitterObjectFactory.registerJSONObject(this, jSONObjectAsJSONObject);
        }
    }

    UserJSONImpl(JSONObject jSONObject) throws TwitterException {
        init(jSONObject);
    }

    UserJSONImpl() {
    }

    private void init(JSONObject jSONObject) throws TwitterException {
        try {
            this.f3743id = ParseUtil.getLong("id", jSONObject);
            this.name = ParseUtil.getRawString("name", jSONObject);
            this.screenName = ParseUtil.getRawString("screen_name", jSONObject);
            this.location = ParseUtil.getRawString("location", jSONObject);
            this.descriptionURLEntities = getURLEntitiesFromJSON(jSONObject, "description");
            this.descriptionURLEntities = this.descriptionURLEntities == null ? new URLEntity[0] : this.descriptionURLEntities;
            URLEntity[] uRLEntitiesFromJSON = getURLEntitiesFromJSON(jSONObject, "url");
            if (uRLEntitiesFromJSON != null && uRLEntitiesFromJSON.length > 0) {
                this.urlEntity = uRLEntitiesFromJSON[0];
            }
            this.description = ParseUtil.getRawString("description", jSONObject);
            if (this.description != null) {
                this.description = HTMLEntity.unescapeAndSlideEntityIncdices(this.description, null, this.descriptionURLEntities, null, null);
            }
            this.isContributorsEnabled = ParseUtil.getBoolean("contributors_enabled", jSONObject);
            this.profileImageUrl = ParseUtil.getRawString("profile_image_url", jSONObject);
            this.profileImageUrlHttps = ParseUtil.getRawString("profile_image_url_https", jSONObject);
            this.isDefaultProfileImage = ParseUtil.getBoolean("default_profile_image", jSONObject);
            this.url = ParseUtil.getRawString("url", jSONObject);
            this.isProtected = ParseUtil.getBoolean("protected", jSONObject);
            this.isGeoEnabled = ParseUtil.getBoolean("geo_enabled", jSONObject);
            this.isVerified = ParseUtil.getBoolean("verified", jSONObject);
            this.translator = ParseUtil.getBoolean("is_translator", jSONObject);
            this.followersCount = ParseUtil.getInt("followers_count", jSONObject);
            this.profileBackgroundColor = ParseUtil.getRawString("profile_background_color", jSONObject);
            this.profileTextColor = ParseUtil.getRawString("profile_text_color", jSONObject);
            this.profileLinkColor = ParseUtil.getRawString("profile_link_color", jSONObject);
            this.profileSidebarFillColor = ParseUtil.getRawString("profile_sidebar_fill_color", jSONObject);
            this.profileSidebarBorderColor = ParseUtil.getRawString("profile_sidebar_border_color", jSONObject);
            this.profileUseBackgroundImage = ParseUtil.getBoolean("profile_use_background_image", jSONObject);
            this.isDefaultProfile = ParseUtil.getBoolean("default_profile", jSONObject);
            this.showAllInlineMedia = ParseUtil.getBoolean("show_all_inline_media", jSONObject);
            this.friendsCount = ParseUtil.getInt("friends_count", jSONObject);
            this.createdAt = ParseUtil.getDate("created_at", jSONObject, "EEE MMM dd HH:mm:ss z yyyy");
            this.favouritesCount = ParseUtil.getInt("favourites_count", jSONObject);
            this.utcOffset = ParseUtil.getInt("utc_offset", jSONObject);
            this.timeZone = ParseUtil.getRawString("time_zone", jSONObject);
            this.profileBackgroundImageUrl = ParseUtil.getRawString("profile_background_image_url", jSONObject);
            this.profileBackgroundImageUrlHttps = ParseUtil.getRawString("profile_background_image_url_https", jSONObject);
            this.profileBannerImageUrl = ParseUtil.getRawString("profile_banner_url", jSONObject);
            this.profileBackgroundTiled = ParseUtil.getBoolean("profile_background_tile", jSONObject);
            this.lang = ParseUtil.getRawString("lang", jSONObject);
            this.statusesCount = ParseUtil.getInt("statuses_count", jSONObject);
            this.listedCount = ParseUtil.getInt("listed_count", jSONObject);
            this.isFollowRequestSent = ParseUtil.getBoolean("follow_request_sent", jSONObject);
            if (!jSONObject.isNull("status")) {
                this.status = new StatusJSONImpl(jSONObject.getJSONObject("status"));
            }
        } catch (JSONException e) {
            throw new TwitterException(e.getMessage() + ":" + jSONObject.toString(), e);
        }
    }

    private static URLEntity[] getURLEntitiesFromJSON(JSONObject jSONObject, String str) throws JSONException {
        if (!jSONObject.isNull("entities")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("entities");
            if (!jSONObject2.isNull(str)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
                if (!jSONObject3.isNull("urls")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("urls");
                    int length = jSONArray.length();
                    URLEntity[] uRLEntityArr = new URLEntity[length];
                    for (int i = 0; i < length; i++) {
                        uRLEntityArr[i] = new URLEntityJSONImpl(jSONArray.getJSONObject(i));
                    }
                    return uRLEntityArr;
                }
            }
        }
        return null;
    }

    public final int compareTo(User user) {
        return (int) (this.f3743id - user.getId());
    }

    @Override // twitter4j.User
    public final long getId() {
        return this.f3743id;
    }

    @Override // twitter4j.User
    public final String getName() {
        return this.name;
    }

    @Override // twitter4j.User
    public final String getScreenName() {
        return this.screenName;
    }

    @Override // twitter4j.User
    public final String getLocation() {
        return this.location;
    }

    @Override // twitter4j.User
    public final String getDescription() {
        return this.description;
    }

    @Override // twitter4j.User
    public final boolean isContributorsEnabled() {
        return this.isContributorsEnabled;
    }

    @Override // twitter4j.User
    public final String getProfileImageURL() {
        return this.profileImageUrl;
    }

    @Override // twitter4j.User
    public final String getBiggerProfileImageURL() {
        return toResizedURL(this.profileImageUrl, "_bigger");
    }

    @Override // twitter4j.User
    public final String getMiniProfileImageURL() {
        return toResizedURL(this.profileImageUrl, "_mini");
    }

    @Override // twitter4j.User
    public final String getOriginalProfileImageURL() {
        return toResizedURL(this.profileImageUrl, "");
    }

    private String toResizedURL(String str, String str2) {
        if (str == null) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf("_");
        int iLastIndexOf2 = str.lastIndexOf(".");
        int iLastIndexOf3 = str.lastIndexOf("/");
        String str3 = str.substring(0, iLastIndexOf) + str2;
        if (iLastIndexOf2 > iLastIndexOf3) {
            return str3 + str.substring(iLastIndexOf2);
        }
        return str3;
    }

    @Override // twitter4j.User
    public final String getProfileImageURLHttps() {
        return this.profileImageUrlHttps;
    }

    @Override // twitter4j.User
    public final String getBiggerProfileImageURLHttps() {
        return toResizedURL(this.profileImageUrlHttps, "_bigger");
    }

    @Override // twitter4j.User
    public final String getMiniProfileImageURLHttps() {
        return toResizedURL(this.profileImageUrlHttps, "_mini");
    }

    @Override // twitter4j.User
    public final String getOriginalProfileImageURLHttps() {
        return toResizedURL(this.profileImageUrlHttps, "");
    }

    @Override // twitter4j.User
    public final boolean isDefaultProfileImage() {
        return this.isDefaultProfileImage;
    }

    @Override // twitter4j.User
    public final String getURL() {
        return this.url;
    }

    @Override // twitter4j.User
    public final boolean isProtected() {
        return this.isProtected;
    }

    @Override // twitter4j.User
    public final int getFollowersCount() {
        return this.followersCount;
    }

    @Override // twitter4j.User
    public final String getProfileBackgroundColor() {
        return this.profileBackgroundColor;
    }

    @Override // twitter4j.User
    public final String getProfileTextColor() {
        return this.profileTextColor;
    }

    @Override // twitter4j.User
    public final String getProfileLinkColor() {
        return this.profileLinkColor;
    }

    @Override // twitter4j.User
    public final String getProfileSidebarFillColor() {
        return this.profileSidebarFillColor;
    }

    @Override // twitter4j.User
    public final String getProfileSidebarBorderColor() {
        return this.profileSidebarBorderColor;
    }

    @Override // twitter4j.User
    public final boolean isProfileUseBackgroundImage() {
        return this.profileUseBackgroundImage;
    }

    @Override // twitter4j.User
    public final boolean isDefaultProfile() {
        return this.isDefaultProfile;
    }

    @Override // twitter4j.User
    public final boolean isShowAllInlineMedia() {
        return this.showAllInlineMedia;
    }

    @Override // twitter4j.User
    public final int getFriendsCount() {
        return this.friendsCount;
    }

    @Override // twitter4j.User
    public final Status getStatus() {
        return this.status;
    }

    @Override // twitter4j.User
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Override // twitter4j.User
    public final int getFavouritesCount() {
        return this.favouritesCount;
    }

    @Override // twitter4j.User
    public final int getUtcOffset() {
        return this.utcOffset;
    }

    @Override // twitter4j.User
    public final String getTimeZone() {
        return this.timeZone;
    }

    @Override // twitter4j.User
    public final String getProfileBackgroundImageURL() {
        return this.profileBackgroundImageUrl;
    }

    @Override // twitter4j.User
    public final String getProfileBackgroundImageUrlHttps() {
        return this.profileBackgroundImageUrlHttps;
    }

    @Override // twitter4j.User
    public final String getProfileBannerURL() {
        if (this.profileBannerImageUrl != null) {
            return this.profileBannerImageUrl + "/web";
        }
        return null;
    }

    @Override // twitter4j.User
    public final String getProfileBannerRetinaURL() {
        if (this.profileBannerImageUrl != null) {
            return this.profileBannerImageUrl + "/web_retina";
        }
        return null;
    }

    @Override // twitter4j.User
    public final String getProfileBannerIPadURL() {
        if (this.profileBannerImageUrl != null) {
            return this.profileBannerImageUrl + "/ipad";
        }
        return null;
    }

    @Override // twitter4j.User
    public final String getProfileBannerIPadRetinaURL() {
        if (this.profileBannerImageUrl != null) {
            return this.profileBannerImageUrl + "/ipad_retina";
        }
        return null;
    }

    @Override // twitter4j.User
    public final String getProfileBannerMobileURL() {
        if (this.profileBannerImageUrl != null) {
            return this.profileBannerImageUrl + "/mobile";
        }
        return null;
    }

    @Override // twitter4j.User
    public final String getProfileBannerMobileRetinaURL() {
        if (this.profileBannerImageUrl != null) {
            return this.profileBannerImageUrl + "/mobile_retina";
        }
        return null;
    }

    @Override // twitter4j.User
    public final boolean isProfileBackgroundTiled() {
        return this.profileBackgroundTiled;
    }

    @Override // twitter4j.User
    public final String getLang() {
        return this.lang;
    }

    @Override // twitter4j.User
    public final int getStatusesCount() {
        return this.statusesCount;
    }

    @Override // twitter4j.User
    public final boolean isGeoEnabled() {
        return this.isGeoEnabled;
    }

    @Override // twitter4j.User
    public final boolean isVerified() {
        return this.isVerified;
    }

    @Override // twitter4j.User
    public final boolean isTranslator() {
        return this.translator;
    }

    @Override // twitter4j.User
    public final int getListedCount() {
        return this.listedCount;
    }

    @Override // twitter4j.User
    public final boolean isFollowRequestSent() {
        return this.isFollowRequestSent;
    }

    @Override // twitter4j.User
    public final URLEntity[] getDescriptionURLEntities() {
        return this.descriptionURLEntities;
    }

    @Override // twitter4j.User
    public final URLEntity getURLEntity() {
        if (this.urlEntity == null) {
            String str = this.url == null ? "" : this.url;
            this.urlEntity = new URLEntityJSONImpl(0, str.length(), str, str, str);
        }
        return this.urlEntity;
    }

    static PagableResponseList createPagableUserList(HttpResponse httpResponse, Configuration configuration) throws TwitterException, IOException {
        try {
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.clearThreadLocalMap();
            }
            JSONObject jSONObjectAsJSONObject = httpResponse.asJSONObject();
            JSONArray jSONArray = jSONObjectAsJSONObject.getJSONArray("users");
            int length = jSONArray.length();
            PagableResponseListImpl pagableResponseListImpl = new PagableResponseListImpl(length, jSONObjectAsJSONObject, httpResponse);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                UserJSONImpl userJSONImpl = new UserJSONImpl(jSONObject);
                if (configuration.isJSONStoreEnabled()) {
                    TwitterObjectFactory.registerJSONObject(userJSONImpl, jSONObject);
                }
                pagableResponseListImpl.add(userJSONImpl);
            }
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.registerJSONObject(pagableResponseListImpl, jSONObjectAsJSONObject);
            }
            return pagableResponseListImpl;
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    static ResponseList createUserList(HttpResponse httpResponse, Configuration configuration) {
        return createUserList(httpResponse.asJSONArray(), httpResponse, configuration);
    }

    static ResponseList createUserList(JSONArray jSONArray, HttpResponse httpResponse, Configuration configuration) throws TwitterException {
        try {
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.clearThreadLocalMap();
            }
            int length = jSONArray.length();
            ResponseListImpl responseListImpl = new ResponseListImpl(length, httpResponse);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                UserJSONImpl userJSONImpl = new UserJSONImpl(jSONObject);
                responseListImpl.add(userJSONImpl);
                if (configuration.isJSONStoreEnabled()) {
                    TwitterObjectFactory.registerJSONObject(userJSONImpl, jSONObject);
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

    public final int hashCode() {
        return (int) this.f3743id;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof User) && ((User) obj).getId() == this.f3743id;
    }

    public final String toString() {
        return "UserJSONImpl{id=" + this.f3743id + ", name='" + this.name + "', screenName='" + this.screenName + "', location='" + this.location + "', description='" + this.description + "', isContributorsEnabled=" + this.isContributorsEnabled + ", profileImageUrl='" + this.profileImageUrl + "', profileImageUrlHttps='" + this.profileImageUrlHttps + "', isDefaultProfileImage=" + this.isDefaultProfileImage + ", url='" + this.url + "', isProtected=" + this.isProtected + ", followersCount=" + this.followersCount + ", status=" + this.status + ", profileBackgroundColor='" + this.profileBackgroundColor + "', profileTextColor='" + this.profileTextColor + "', profileLinkColor='" + this.profileLinkColor + "', profileSidebarFillColor='" + this.profileSidebarFillColor + "', profileSidebarBorderColor='" + this.profileSidebarBorderColor + "', profileUseBackgroundImage=" + this.profileUseBackgroundImage + ", isDefaultProfile=" + this.isDefaultProfile + ", showAllInlineMedia=" + this.showAllInlineMedia + ", friendsCount=" + this.friendsCount + ", createdAt=" + this.createdAt + ", favouritesCount=" + this.favouritesCount + ", utcOffset=" + this.utcOffset + ", timeZone='" + this.timeZone + "', profileBackgroundImageUrl='" + this.profileBackgroundImageUrl + "', profileBackgroundImageUrlHttps='" + this.profileBackgroundImageUrlHttps + "', profileBackgroundTiled=" + this.profileBackgroundTiled + ", lang='" + this.lang + "', statusesCount=" + this.statusesCount + ", isGeoEnabled=" + this.isGeoEnabled + ", isVerified=" + this.isVerified + ", translator=" + this.translator + ", listedCount=" + this.listedCount + ", isFollowRequestSent=" + this.isFollowRequestSent + '}';
    }
}
