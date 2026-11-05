package twitter4j;

import java.io.IOException;
import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
class FriendshipJSONImpl implements Friendship {
    private static final long serialVersionUID = 6847273186993125826L;
    private boolean followedBy;
    private boolean following;

    /* renamed from: id */
    private final long f3731id;
    private final String name;
    private final String screenName;

    FriendshipJSONImpl(JSONObject jSONObject) throws TwitterException {
        this.following = false;
        this.followedBy = false;
        try {
            this.f3731id = ParseUtil.getLong("id", jSONObject);
            this.name = jSONObject.getString("name");
            this.screenName = jSONObject.getString("screen_name");
            JSONArray jSONArray = jSONObject.getJSONArray("connections");
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                if ("following".equals(string)) {
                    this.following = true;
                } else if ("followed_by".equals(string)) {
                    this.followedBy = true;
                }
            }
        } catch (JSONException e) {
            throw new TwitterException(e.getMessage() + ":" + jSONObject.toString(), e);
        }
    }

    static ResponseList createFriendshipList(HttpResponse httpResponse, Configuration configuration) throws TwitterException, IOException {
        try {
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.clearThreadLocalMap();
            }
            JSONArray jSONArrayAsJSONArray = httpResponse.asJSONArray();
            int length = jSONArrayAsJSONArray.length();
            ResponseListImpl responseListImpl = new ResponseListImpl(length, httpResponse);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArrayAsJSONArray.getJSONObject(i);
                FriendshipJSONImpl friendshipJSONImpl = new FriendshipJSONImpl(jSONObject);
                if (configuration.isJSONStoreEnabled()) {
                    TwitterObjectFactory.registerJSONObject(friendshipJSONImpl, jSONObject);
                }
                responseListImpl.add(friendshipJSONImpl);
            }
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.registerJSONObject(responseListImpl, jSONArrayAsJSONArray);
            }
            return responseListImpl;
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    @Override // twitter4j.Friendship
    public long getId() {
        return this.f3731id;
    }

    @Override // twitter4j.Friendship
    public String getName() {
        return this.name;
    }

    @Override // twitter4j.Friendship
    public String getScreenName() {
        return this.screenName;
    }

    @Override // twitter4j.Friendship
    public boolean isFollowing() {
        return this.following;
    }

    @Override // twitter4j.Friendship
    public boolean isFollowedBy() {
        return this.followedBy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FriendshipJSONImpl friendshipJSONImpl = (FriendshipJSONImpl) obj;
        return this.followedBy == friendshipJSONImpl.followedBy && this.following == friendshipJSONImpl.following && this.f3731id == friendshipJSONImpl.f3731id && this.name.equals(friendshipJSONImpl.name) && this.screenName.equals(friendshipJSONImpl.screenName);
    }

    public int hashCode() {
        return (((this.following ? 1 : 0) + (((this.screenName != null ? this.screenName.hashCode() : 0) + (((this.name != null ? this.name.hashCode() : 0) + (((int) (this.f3731id ^ (this.f3731id >>> 32))) * 31)) * 31)) * 31)) * 31) + (this.followedBy ? 1 : 0);
    }

    public String toString() {
        return "FriendshipJSONImpl{id=" + this.f3731id + ", name='" + this.name + "', screenName='" + this.screenName + "', following=" + this.following + ", followedBy=" + this.followedBy + '}';
    }
}
