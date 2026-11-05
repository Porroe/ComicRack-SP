package twitter4j;

import java.io.Serializable;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public final class UploadedMedia implements Serializable {
    private static final long serialVersionUID = 5393092535610604718L;
    private int imageHeight;
    private String imageType;
    private int imageWidth;
    private long mediaId;
    private long size;

    UploadedMedia(JSONObject jSONObject) throws TwitterException {
        init(jSONObject);
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    public final int getImageHeight() {
        return this.imageHeight;
    }

    public final String getImageType() {
        return this.imageType;
    }

    public final long getMediaId() {
        return this.mediaId;
    }

    public final long getSize() {
        return this.size;
    }

    private void init(JSONObject jSONObject) throws TwitterException {
        this.mediaId = ParseUtil.getLong("media_id", jSONObject);
        this.size = ParseUtil.getLong("size", jSONObject);
        try {
            if (!jSONObject.isNull("image")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("image");
                this.imageWidth = ParseUtil.getInt("w", jSONObject2);
                this.imageHeight = ParseUtil.getInt("h", jSONObject2);
                this.imageType = ParseUtil.getUnescapedString("image_type", jSONObject2);
            }
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadedMedia uploadedMedia = (UploadedMedia) obj;
        return this.imageWidth == uploadedMedia.imageWidth && this.imageHeight == uploadedMedia.imageHeight && this.imageType == uploadedMedia.imageType && this.mediaId == uploadedMedia.mediaId && this.size == uploadedMedia.size;
    }

    public final int hashCode() {
        return (((this.imageType != null ? this.imageType.hashCode() : 0) + (((((((int) (this.mediaId ^ (this.mediaId >>> 32))) * 31) + this.imageWidth) * 31) + this.imageHeight) * 31)) * 31) + ((int) (this.size ^ (this.size >>> 32)));
    }

    public final String toString() {
        return "UploadedMedia{mediaId=" + this.mediaId + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", imageType='" + this.imageType + "', size=" + this.size + '}';
    }
}
