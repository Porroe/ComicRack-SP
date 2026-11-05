package twitter4j;

import java.io.Serializable;
import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class CategoryJSONImpl implements Serializable, Category {
    private static final long serialVersionUID = 3811335888122469876L;
    private String name;
    private int size;
    private String slug;

    CategoryJSONImpl(JSONObject jSONObject) {
        init(jSONObject);
    }

    final void init(JSONObject jSONObject) {
        this.name = jSONObject.getString("name");
        this.slug = jSONObject.getString("slug");
        this.size = ParseUtil.getInt("size", jSONObject);
    }

    static ResponseList createCategoriesList(HttpResponse httpResponse, Configuration configuration) {
        return createCategoriesList(httpResponse.asJSONArray(), httpResponse, configuration);
    }

    static ResponseList createCategoriesList(JSONArray jSONArray, HttpResponse httpResponse, Configuration configuration) throws TwitterException {
        try {
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.clearThreadLocalMap();
            }
            ResponseListImpl responseListImpl = new ResponseListImpl(jSONArray.length(), httpResponse);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                CategoryJSONImpl categoryJSONImpl = new CategoryJSONImpl(jSONObject);
                responseListImpl.add(categoryJSONImpl);
                if (configuration.isJSONStoreEnabled()) {
                    TwitterObjectFactory.registerJSONObject(categoryJSONImpl, jSONObject);
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

    @Override // twitter4j.Category
    public final String getName() {
        return this.name;
    }

    @Override // twitter4j.Category
    public final String getSlug() {
        return this.slug;
    }

    @Override // twitter4j.Category
    public final int getSize() {
        return this.size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CategoryJSONImpl categoryJSONImpl = (CategoryJSONImpl) obj;
        if (this.size != categoryJSONImpl.size) {
            return false;
        }
        if (this.name == null ? categoryJSONImpl.name != null : !this.name.equals(categoryJSONImpl.name)) {
            return false;
        }
        if (this.slug != null) {
            if (this.slug.equals(categoryJSONImpl.slug)) {
                return true;
            }
        } else if (categoryJSONImpl.slug == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.name != null ? this.name.hashCode() : 0) * 31) + (this.slug != null ? this.slug.hashCode() : 0)) * 31) + this.size;
    }

    public final String toString() {
        return "CategoryJSONImpl{name='" + this.name + "', slug='" + this.slug + "', size=" + this.size + '}';
    }
}
