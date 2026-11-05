package twitter4j;

/* compiled from: DontLook */
/* loaded from: classes.dex */
class UserMentionEntityJSONImpl extends EntityIndex implements UserMentionEntity {
    private static final long serialVersionUID = 6060510953676673013L;

    /* renamed from: id */
    private long f3745id;
    private String name;
    private String screenName;

    UserMentionEntityJSONImpl(JSONObject jSONObject) throws TwitterException {
        init(jSONObject);
    }

    UserMentionEntityJSONImpl(int i, int i2, String str, String str2, long j) {
        setStart(i);
        setEnd(i2);
        this.name = str;
        this.screenName = str2;
        this.f3745id = j;
    }

    UserMentionEntityJSONImpl() {
    }

    private void init(JSONObject jSONObject) throws TwitterException {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("indices");
            setStart(jSONArray.getInt(0));
            setEnd(jSONArray.getInt(1));
            if (!jSONObject.isNull("name")) {
                this.name = jSONObject.getString("name");
            }
            if (!jSONObject.isNull("screen_name")) {
                this.screenName = jSONObject.getString("screen_name");
            }
            this.f3745id = ParseUtil.getLong("id", jSONObject);
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    @Override // twitter4j.UserMentionEntity, twitter4j.TweetEntity
    public String getText() {
        return this.screenName;
    }

    @Override // twitter4j.UserMentionEntity
    public String getName() {
        return this.name;
    }

    @Override // twitter4j.UserMentionEntity
    public String getScreenName() {
        return this.screenName;
    }

    @Override // twitter4j.UserMentionEntity
    public long getId() {
        return this.f3745id;
    }

    @Override // twitter4j.EntityIndex, twitter4j.HashtagEntity, twitter4j.TweetEntity
    public int getStart() {
        return super.getStart();
    }

    @Override // twitter4j.EntityIndex, twitter4j.HashtagEntity, twitter4j.TweetEntity
    public int getEnd() {
        return super.getEnd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserMentionEntityJSONImpl userMentionEntityJSONImpl = (UserMentionEntityJSONImpl) obj;
        if (this.f3745id != userMentionEntityJSONImpl.f3745id) {
            return false;
        }
        if (this.name == null ? userMentionEntityJSONImpl.name != null : !this.name.equals(userMentionEntityJSONImpl.name)) {
            return false;
        }
        if (this.screenName != null) {
            if (this.screenName.equals(userMentionEntityJSONImpl.screenName)) {
                return true;
            }
        } else if (userMentionEntityJSONImpl.screenName == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.name != null ? this.name.hashCode() : 0) * 31) + (this.screenName != null ? this.screenName.hashCode() : 0)) * 31) + ((int) (this.f3745id ^ (this.f3745id >>> 32)));
    }

    public String toString() {
        return "UserMentionEntityJSONImpl{name='" + this.name + "', screenName='" + this.screenName + "', id=" + this.f3745id + '}';
    }
}
