package twitter4j;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import twitter4j.MediaEntity;
import twitter4j.MediaEntityJSONImpl;
import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
class TwitterAPIConfigurationJSONImpl extends TwitterResponseImpl implements TwitterAPIConfiguration {
    private static final long serialVersionUID = -3588904550808591686L;
    private int charactersReservedPerMedia;
    private int maxMediaPerUpload;
    private String[] nonUsernamePaths;
    private int photoSizeLimit;
    private Map photoSizes;
    private int shortURLLength;
    private int shortURLLengthHttps;

    TwitterAPIConfigurationJSONImpl(HttpResponse httpResponse, Configuration configuration) throws TwitterException, IOException {
        JSONObject jSONObject;
        super(httpResponse);
        try {
            JSONObject jSONObjectAsJSONObject = httpResponse.asJSONObject();
            this.photoSizeLimit = ParseUtil.getInt("photo_size_limit", jSONObjectAsJSONObject);
            this.shortURLLength = ParseUtil.getInt("short_url_length", jSONObjectAsJSONObject);
            this.shortURLLengthHttps = ParseUtil.getInt("short_url_length_https", jSONObjectAsJSONObject);
            this.charactersReservedPerMedia = ParseUtil.getInt("characters_reserved_per_media", jSONObjectAsJSONObject);
            JSONObject jSONObject2 = jSONObjectAsJSONObject.getJSONObject("photo_sizes");
            this.photoSizes = new HashMap(4);
            this.photoSizes.put(MediaEntity.Size.LARGE, new MediaEntityJSONImpl.Size(jSONObject2.getJSONObject("large")));
            if (jSONObject2.isNull("med")) {
                jSONObject = jSONObject2.getJSONObject("medium");
            } else {
                jSONObject = jSONObject2.getJSONObject("med");
            }
            this.photoSizes.put(MediaEntity.Size.MEDIUM, new MediaEntityJSONImpl.Size(jSONObject));
            this.photoSizes.put(MediaEntity.Size.SMALL, new MediaEntityJSONImpl.Size(jSONObject2.getJSONObject("small")));
            this.photoSizes.put(MediaEntity.Size.THUMB, new MediaEntityJSONImpl.Size(jSONObject2.getJSONObject("thumb")));
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.clearThreadLocalMap();
                TwitterObjectFactory.registerJSONObject(this, httpResponse.asJSONObject());
            }
            JSONArray jSONArray = jSONObjectAsJSONObject.getJSONArray("non_username_paths");
            this.nonUsernamePaths = new String[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                this.nonUsernamePaths[i] = jSONArray.getString(i);
            }
            this.maxMediaPerUpload = ParseUtil.getInt("max_media_per_upload", jSONObjectAsJSONObject);
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    @Override // twitter4j.TwitterAPIConfiguration
    public int getPhotoSizeLimit() {
        return this.photoSizeLimit;
    }

    @Override // twitter4j.TwitterAPIConfiguration
    public int getShortURLLength() {
        return this.shortURLLength;
    }

    @Override // twitter4j.TwitterAPIConfiguration
    public int getShortURLLengthHttps() {
        return this.shortURLLengthHttps;
    }

    @Override // twitter4j.TwitterAPIConfiguration
    public int getCharactersReservedPerMedia() {
        return this.charactersReservedPerMedia;
    }

    @Override // twitter4j.TwitterAPIConfiguration
    public Map getPhotoSizes() {
        return this.photoSizes;
    }

    @Override // twitter4j.TwitterAPIConfiguration
    public String[] getNonUsernamePaths() {
        return this.nonUsernamePaths;
    }

    @Override // twitter4j.TwitterAPIConfiguration
    public int getMaxMediaPerUpload() {
        return this.maxMediaPerUpload;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterAPIConfigurationJSONImpl)) {
            return false;
        }
        TwitterAPIConfigurationJSONImpl twitterAPIConfigurationJSONImpl = (TwitterAPIConfigurationJSONImpl) obj;
        if (this.charactersReservedPerMedia == twitterAPIConfigurationJSONImpl.charactersReservedPerMedia && this.maxMediaPerUpload == twitterAPIConfigurationJSONImpl.maxMediaPerUpload && this.photoSizeLimit == twitterAPIConfigurationJSONImpl.photoSizeLimit && this.shortURLLength == twitterAPIConfigurationJSONImpl.shortURLLength && this.shortURLLengthHttps == twitterAPIConfigurationJSONImpl.shortURLLengthHttps && Arrays.equals(this.nonUsernamePaths, twitterAPIConfigurationJSONImpl.nonUsernamePaths)) {
            if (this.photoSizes != null) {
                if (this.photoSizes.equals(twitterAPIConfigurationJSONImpl.photoSizes)) {
                    return true;
                }
            } else if (twitterAPIConfigurationJSONImpl.photoSizes == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.photoSizes != null ? this.photoSizes.hashCode() : 0) + (((((((this.photoSizeLimit * 31) + this.shortURLLength) * 31) + this.shortURLLengthHttps) * 31) + this.charactersReservedPerMedia) * 31)) * 31) + (this.nonUsernamePaths != null ? Arrays.hashCode(this.nonUsernamePaths) : 0)) * 31) + this.maxMediaPerUpload;
    }

    public String toString() {
        return "TwitterAPIConfigurationJSONImpl{photoSizeLimit=" + this.photoSizeLimit + ", shortURLLength=" + this.shortURLLength + ", shortURLLengthHttps=" + this.shortURLLengthHttps + ", charactersReservedPerMedia=" + this.charactersReservedPerMedia + ", photoSizes=" + this.photoSizes + ", nonUsernamePaths=" + (this.nonUsernamePaths == null ? null : Arrays.asList(this.nonUsernamePaths)) + ", maxMediaPerUpload=" + this.maxMediaPerUpload + '}';
    }
}
