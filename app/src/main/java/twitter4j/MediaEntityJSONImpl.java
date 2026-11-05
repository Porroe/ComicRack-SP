package twitter4j;

import java.util.HashMap;
import java.util.Map;
import twitter4j.MediaEntity;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class MediaEntityJSONImpl extends EntityIndex implements MediaEntity {
    private static final long serialVersionUID = 3609683338035442290L;
    private String displayURL;
    private String expandedURL;

    /* renamed from: id */
    private long f3735id;
    private String mediaURL;
    private String mediaURLHttps;
    private Map sizes;
    private String type;
    private String url;

    @Override // twitter4j.EntityIndex
    public /* bridge */ /* synthetic */ int compareTo(EntityIndex entityIndex) {
        return super.compareTo(entityIndex);
    }

    MediaEntityJSONImpl(JSONObject jSONObject) throws TwitterException {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("indices");
            setStart(jSONArray.getInt(0));
            setEnd(jSONArray.getInt(1));
            this.f3735id = ParseUtil.getLong("id", jSONObject);
            this.url = jSONObject.getString("url");
            this.expandedURL = jSONObject.getString("expanded_url");
            this.mediaURL = jSONObject.getString("media_url");
            this.mediaURLHttps = jSONObject.getString("media_url_https");
            this.displayURL = jSONObject.getString("display_url");
            JSONObject jSONObject2 = jSONObject.getJSONObject("sizes");
            this.sizes = new HashMap(4);
            addMediaEntitySizeIfNotNull(this.sizes, jSONObject2, MediaEntity.Size.LARGE, "large");
            addMediaEntitySizeIfNotNull(this.sizes, jSONObject2, MediaEntity.Size.MEDIUM, "medium");
            addMediaEntitySizeIfNotNull(this.sizes, jSONObject2, MediaEntity.Size.SMALL, "small");
            addMediaEntitySizeIfNotNull(this.sizes, jSONObject2, MediaEntity.Size.THUMB, "thumb");
            if (!jSONObject.isNull("type")) {
                this.type = jSONObject.getString("type");
            }
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    private void addMediaEntitySizeIfNotNull(Map map, JSONObject jSONObject, Integer num, String str) {
        if (!jSONObject.isNull(str)) {
            map.put(num, new Size(jSONObject.getJSONObject(str)));
        }
    }

    MediaEntityJSONImpl() {
    }

    @Override // twitter4j.MediaEntity
    public long getId() {
        return this.f3735id;
    }

    @Override // twitter4j.MediaEntity
    public String getMediaURL() {
        return this.mediaURL;
    }

    @Override // twitter4j.MediaEntity
    public String getMediaURLHttps() {
        return this.mediaURLHttps;
    }

    @Override // twitter4j.URLEntity, twitter4j.TweetEntity
    public String getText() {
        return this.url;
    }

    @Override // twitter4j.URLEntity
    public String getURL() {
        return this.url;
    }

    @Override // twitter4j.URLEntity
    public String getDisplayURL() {
        return this.displayURL;
    }

    @Override // twitter4j.URLEntity
    public String getExpandedURL() {
        return this.expandedURL;
    }

    @Override // twitter4j.MediaEntity
    public Map getSizes() {
        return this.sizes;
    }

    @Override // twitter4j.MediaEntity
    public String getType() {
        return this.type;
    }

    @Override // twitter4j.EntityIndex, twitter4j.HashtagEntity, twitter4j.TweetEntity
    public int getStart() {
        return super.getStart();
    }

    @Override // twitter4j.EntityIndex, twitter4j.HashtagEntity, twitter4j.TweetEntity
    public int getEnd() {
        return super.getEnd();
    }

    /* compiled from: DontLook */
    class Size implements MediaEntity.Size {
        private static final long serialVersionUID = -2515842281909325169L;
        int height;
        int resize;
        int width;

        Size(JSONObject jSONObject) {
            this.width = jSONObject.getInt("w");
            this.height = jSONObject.getInt("h");
            this.resize = "fit".equals(jSONObject.getString("resize")) ? 100 : MediaEntity.Size.CROP;
        }

        @Override // twitter4j.MediaEntity.Size
        public int getWidth() {
            return this.width;
        }

        @Override // twitter4j.MediaEntity.Size
        public int getHeight() {
            return this.height;
        }

        @Override // twitter4j.MediaEntity.Size
        public int getResize() {
            return this.resize;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Size)) {
                return false;
            }
            Size size = (Size) obj;
            return this.height == size.height && this.resize == size.resize && this.width == size.width;
        }

        public int hashCode() {
            return (((this.width * 31) + this.height) * 31) + this.resize;
        }

        public String toString() {
            return "Size{width=" + this.width + ", height=" + this.height + ", resize=" + this.resize + '}';
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MediaEntityJSONImpl) && this.f3735id == ((MediaEntityJSONImpl) obj).f3735id;
    }

    public int hashCode() {
        return (int) (this.f3735id ^ (this.f3735id >>> 32));
    }

    public String toString() {
        return "MediaEntityJSONImpl{id=" + this.f3735id + ", url=" + this.url + ", mediaURL=" + this.mediaURL + ", mediaURLHttps=" + this.mediaURLHttps + ", expandedURL=" + this.expandedURL + ", displayURL='" + this.displayURL + "', sizes=" + this.sizes + ", type=" + this.type + '}';
    }
}
