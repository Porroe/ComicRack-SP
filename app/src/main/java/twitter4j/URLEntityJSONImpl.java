package twitter4j;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class URLEntityJSONImpl extends EntityIndex implements URLEntity {
    private static final long serialVersionUID = 7333552738058031524L;
    private String displayURL;
    private String expandedURL;
    private String url;

    URLEntityJSONImpl(JSONObject jSONObject) throws TwitterException {
        init(jSONObject);
    }

    URLEntityJSONImpl(int i, int i2, String str, String str2, String str3) {
        setStart(i);
        setEnd(i2);
        this.url = str;
        this.expandedURL = str2;
        this.displayURL = str3;
    }

    URLEntityJSONImpl() {
    }

    private void init(JSONObject jSONObject) throws TwitterException {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("indices");
            setStart(jSONArray.getInt(0));
            setEnd(jSONArray.getInt(1));
            this.url = jSONObject.getString("url");
            if (!jSONObject.isNull("expanded_url")) {
                this.expandedURL = jSONObject.getString("expanded_url");
            } else {
                this.expandedURL = this.url;
            }
            if (!jSONObject.isNull("display_url")) {
                this.displayURL = jSONObject.getString("display_url");
            } else {
                this.displayURL = this.url;
            }
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    @Override // twitter4j.URLEntity, twitter4j.TweetEntity
    public final String getText() {
        return this.url;
    }

    @Override // twitter4j.URLEntity
    public final String getURL() {
        return this.url;
    }

    @Override // twitter4j.URLEntity
    public final String getExpandedURL() {
        return this.expandedURL;
    }

    @Override // twitter4j.URLEntity
    public final String getDisplayURL() {
        return this.displayURL;
    }

    @Override // twitter4j.EntityIndex, twitter4j.HashtagEntity, twitter4j.TweetEntity
    public final int getStart() {
        return super.getStart();
    }

    @Override // twitter4j.EntityIndex, twitter4j.HashtagEntity, twitter4j.TweetEntity
    public final int getEnd() {
        return super.getEnd();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        URLEntityJSONImpl uRLEntityJSONImpl = (URLEntityJSONImpl) obj;
        if (this.displayURL == null ? uRLEntityJSONImpl.displayURL != null : !this.displayURL.equals(uRLEntityJSONImpl.displayURL)) {
            return false;
        }
        if (this.expandedURL == null ? uRLEntityJSONImpl.expandedURL != null : !this.expandedURL.equals(uRLEntityJSONImpl.expandedURL)) {
            return false;
        }
        if (this.url != null) {
            if (this.url.equals(uRLEntityJSONImpl.url)) {
                return true;
            }
        } else if (uRLEntityJSONImpl.url == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.expandedURL != null ? this.expandedURL.hashCode() : 0) + ((this.url != null ? this.url.hashCode() : 0) * 31)) * 31) + (this.displayURL != null ? this.displayURL.hashCode() : 0);
    }

    public final String toString() {
        return "URLEntityJSONImpl{url='" + this.url + "', expandedURL='" + this.expandedURL + "', displayURL='" + this.displayURL + "'}";
    }
}
