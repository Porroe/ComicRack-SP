package twitter4j;

import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
class UserListJSONImpl extends TwitterResponseImpl implements Serializable, UserList {
    private static final long serialVersionUID = 449418980060197008L;
    private Date createdAt;
    private String description;
    private boolean following;
    private String fullName;

    /* renamed from: id */
    private long f3744id;
    private int memberCount;
    private boolean mode;
    private String name;
    private String slug;
    private int subscriberCount;
    private String uri;
    private User user;

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((UserList) obj);
    }

    UserListJSONImpl(HttpResponse httpResponse, Configuration configuration) throws TwitterException, IOException {
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

    UserListJSONImpl(JSONObject jSONObject) throws TwitterException {
        init(jSONObject);
    }

    private void init(JSONObject jSONObject) throws TwitterException {
        this.f3744id = ParseUtil.getLong("id", jSONObject);
        this.name = ParseUtil.getRawString("name", jSONObject);
        this.fullName = ParseUtil.getRawString("full_name", jSONObject);
        this.slug = ParseUtil.getRawString("slug", jSONObject);
        this.description = ParseUtil.getRawString("description", jSONObject);
        this.subscriberCount = ParseUtil.getInt("subscriber_count", jSONObject);
        this.memberCount = ParseUtil.getInt("member_count", jSONObject);
        this.uri = ParseUtil.getRawString("uri", jSONObject);
        this.mode = "public".equals(ParseUtil.getRawString("mode", jSONObject));
        this.following = ParseUtil.getBoolean("following", jSONObject);
        this.createdAt = ParseUtil.getDate("created_at", jSONObject);
        try {
            if (!jSONObject.isNull("user")) {
                this.user = new UserJSONImpl(jSONObject.getJSONObject("user"));
            }
        } catch (JSONException e) {
            throw new TwitterException(e.getMessage() + ":" + jSONObject.toString(), e);
        }
    }

    public int compareTo(UserList userList) {
        long id = this.f3744id - userList.getId();
        if (id < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        if (id > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) id;
    }

    @Override // twitter4j.UserList
    public long getId() {
        return this.f3744id;
    }

    @Override // twitter4j.UserList
    public String getName() {
        return this.name;
    }

    @Override // twitter4j.UserList
    public String getFullName() {
        return this.fullName;
    }

    @Override // twitter4j.UserList
    public String getSlug() {
        return this.slug;
    }

    @Override // twitter4j.UserList
    public String getDescription() {
        return this.description;
    }

    @Override // twitter4j.UserList
    public int getSubscriberCount() {
        return this.subscriberCount;
    }

    @Override // twitter4j.UserList
    public int getMemberCount() {
        return this.memberCount;
    }

    @Override // twitter4j.UserList
    public URI getURI() {
        try {
            return new URI(this.uri);
        } catch (URISyntaxException e) {
            return null;
        }
    }

    @Override // twitter4j.UserList
    public boolean isPublic() {
        return this.mode;
    }

    @Override // twitter4j.UserList
    public boolean isFollowing() {
        return this.following;
    }

    @Override // twitter4j.UserList
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @Override // twitter4j.UserList
    public User getUser() {
        return this.user;
    }

    static PagableResponseList createPagableUserListList(HttpResponse httpResponse, Configuration configuration) throws TwitterException, IOException {
        try {
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.clearThreadLocalMap();
            }
            JSONObject jSONObjectAsJSONObject = httpResponse.asJSONObject();
            JSONArray jSONArray = jSONObjectAsJSONObject.getJSONArray("lists");
            int length = jSONArray.length();
            PagableResponseListImpl pagableResponseListImpl = new PagableResponseListImpl(length, jSONObjectAsJSONObject, httpResponse);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                UserListJSONImpl userListJSONImpl = new UserListJSONImpl(jSONObject);
                pagableResponseListImpl.add(userListJSONImpl);
                if (configuration.isJSONStoreEnabled()) {
                    TwitterObjectFactory.registerJSONObject(userListJSONImpl, jSONObject);
                }
            }
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.registerJSONObject(pagableResponseListImpl, jSONObjectAsJSONObject);
            }
            return pagableResponseListImpl;
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    static ResponseList createUserListList(HttpResponse httpResponse, Configuration configuration) throws TwitterException, IOException {
        try {
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.clearThreadLocalMap();
            }
            JSONArray jSONArrayAsJSONArray = httpResponse.asJSONArray();
            int length = jSONArrayAsJSONArray.length();
            ResponseListImpl responseListImpl = new ResponseListImpl(length, httpResponse);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArrayAsJSONArray.getJSONObject(i);
                UserListJSONImpl userListJSONImpl = new UserListJSONImpl(jSONObject);
                responseListImpl.add(userListJSONImpl);
                if (configuration.isJSONStoreEnabled()) {
                    TwitterObjectFactory.registerJSONObject(userListJSONImpl, jSONObject);
                }
            }
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.registerJSONObject(responseListImpl, jSONArrayAsJSONArray);
            }
            return responseListImpl;
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    public int hashCode() {
        return (int) this.f3744id;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserList) && ((UserList) obj).getId() == this.f3744id;
    }

    public String toString() {
        return "UserListJSONImpl{id=" + this.f3744id + ", name='" + this.name + "', fullName='" + this.fullName + "', slug='" + this.slug + "', description='" + this.description + "', subscriberCount=" + this.subscriberCount + ", memberCount=" + this.memberCount + ", uri='" + this.uri + "', mode=" + this.mode + ", user=" + this.user + ", following=" + this.following + '}';
    }
}
