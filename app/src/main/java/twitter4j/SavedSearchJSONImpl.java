package twitter4j;

import java.io.IOException;
import java.util.Date;
import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class SavedSearchJSONImpl extends TwitterResponseImpl implements SavedSearch {
    private static final long serialVersionUID = 846086437256360810L;
    private Date createdAt;

    /* renamed from: id */
    private int f3740id;
    private String name;
    private int position;
    private String query;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((SavedSearch) obj);
    }

    SavedSearchJSONImpl(HttpResponse httpResponse, Configuration configuration) throws IOException {
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

    SavedSearchJSONImpl(JSONObject jSONObject) {
        init(jSONObject);
    }

    static ResponseList createSavedSearchList(HttpResponse httpResponse, Configuration configuration) throws TwitterException, IOException {
        if (configuration.isJSONStoreEnabled()) {
            TwitterObjectFactory.clearThreadLocalMap();
        }
        JSONArray jSONArrayAsJSONArray = httpResponse.asJSONArray();
        try {
            ResponseListImpl responseListImpl = new ResponseListImpl(jSONArrayAsJSONArray.length(), httpResponse);
            for (int i = 0; i < jSONArrayAsJSONArray.length(); i++) {
                JSONObject jSONObject = jSONArrayAsJSONArray.getJSONObject(i);
                SavedSearchJSONImpl savedSearchJSONImpl = new SavedSearchJSONImpl(jSONObject);
                responseListImpl.add(savedSearchJSONImpl);
                if (configuration.isJSONStoreEnabled()) {
                    TwitterObjectFactory.registerJSONObject(savedSearchJSONImpl, jSONObject);
                }
            }
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.registerJSONObject(responseListImpl, jSONArrayAsJSONArray);
            }
            return responseListImpl;
        } catch (JSONException e) {
            throw new TwitterException(e.getMessage() + ":" + httpResponse.asString(), e);
        }
    }

    private void init(JSONObject jSONObject) {
        this.createdAt = ParseUtil.getDate("created_at", jSONObject, "EEE MMM dd HH:mm:ss z yyyy");
        this.query = ParseUtil.getUnescapedString("query", jSONObject);
        this.position = ParseUtil.getInt("position", jSONObject);
        this.name = ParseUtil.getUnescapedString("name", jSONObject);
        this.f3740id = ParseUtil.getInt("id", jSONObject);
    }

    public final int compareTo(SavedSearch savedSearch) {
        return this.f3740id - savedSearch.getId();
    }

    @Override // twitter4j.SavedSearch
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Override // twitter4j.SavedSearch
    public final String getQuery() {
        return this.query;
    }

    @Override // twitter4j.SavedSearch
    public final int getPosition() {
        return this.position;
    }

    @Override // twitter4j.SavedSearch
    public final String getName() {
        return this.name;
    }

    @Override // twitter4j.SavedSearch
    public final int getId() {
        return this.f3740id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavedSearch) && this.f3740id == ((SavedSearch) obj).getId();
    }

    public final int hashCode() {
        return (((((((this.createdAt.hashCode() * 31) + this.query.hashCode()) * 31) + this.position) * 31) + this.name.hashCode()) * 31) + this.f3740id;
    }

    public final String toString() {
        return "SavedSearchJSONImpl{createdAt=" + this.createdAt + ", query='" + this.query + "', position=" + this.position + ", name='" + this.name + "', id=" + this.f3740id + '}';
    }
}
