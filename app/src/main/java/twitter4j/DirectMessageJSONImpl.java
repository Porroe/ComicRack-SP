package twitter4j;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class DirectMessageJSONImpl extends TwitterResponseImpl implements Serializable, DirectMessage {
    private static final long serialVersionUID = 7092906238192790921L;
    private Date createdAt;
    private MediaEntity[] extendedMediaEntities;
    private HashtagEntity[] hashtagEntities;

    /* renamed from: id */
    private long f3730id;
    private MediaEntity[] mediaEntities;
    private User recipient;
    private long recipientId;
    private String recipientScreenName;
    private User sender;
    private long senderId;
    private String senderScreenName;
    private SymbolEntity[] symbolEntities;
    private String text;
    private URLEntity[] urlEntities;
    private UserMentionEntity[] userMentionEntities;

    DirectMessageJSONImpl(HttpResponse httpResponse, Configuration configuration) throws TwitterException, IOException {
        super(httpResponse);
        JSONObject jSONObjectAsJSONObject = httpResponse.asJSONObject();
        init(jSONObjectAsJSONObject);
        if (configuration.isJSONStoreEnabled()) {
            TwitterObjectFactory.clearThreadLocalMap();
            TwitterObjectFactory.registerJSONObject(this, jSONObjectAsJSONObject);
        }
    }

    DirectMessageJSONImpl(JSONObject jSONObject) throws TwitterException {
        init(jSONObject);
    }

    private void init(JSONObject jSONObject) throws TwitterException {
        this.f3730id = ParseUtil.getLong("id", jSONObject);
        this.senderId = ParseUtil.getLong("sender_id", jSONObject);
        this.recipientId = ParseUtil.getLong("recipient_id", jSONObject);
        this.createdAt = ParseUtil.getDate("created_at", jSONObject);
        this.senderScreenName = ParseUtil.getUnescapedString("sender_screen_name", jSONObject);
        this.recipientScreenName = ParseUtil.getUnescapedString("recipient_screen_name", jSONObject);
        try {
            this.sender = new UserJSONImpl(jSONObject.getJSONObject("sender"));
            this.recipient = new UserJSONImpl(jSONObject.getJSONObject("recipient"));
            if (!jSONObject.isNull("entities")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("entities");
                if (!jSONObject2.isNull("user_mentions")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("user_mentions");
                    int length = jSONArray.length();
                    this.userMentionEntities = new UserMentionEntity[length];
                    for (int i = 0; i < length; i++) {
                        this.userMentionEntities[i] = new UserMentionEntityJSONImpl(jSONArray.getJSONObject(i));
                    }
                }
                if (!jSONObject2.isNull("urls")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("urls");
                    int length2 = jSONArray2.length();
                    this.urlEntities = new URLEntity[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        this.urlEntities[i2] = new URLEntityJSONImpl(jSONArray2.getJSONObject(i2));
                    }
                }
                if (!jSONObject2.isNull("hashtags")) {
                    JSONArray jSONArray3 = jSONObject2.getJSONArray("hashtags");
                    int length3 = jSONArray3.length();
                    this.hashtagEntities = new HashtagEntity[length3];
                    for (int i3 = 0; i3 < length3; i3++) {
                        this.hashtagEntities[i3] = new HashtagEntityJSONImpl(jSONArray3.getJSONObject(i3));
                    }
                }
                if (!jSONObject2.isNull("symbols")) {
                    JSONArray jSONArray4 = jSONObject2.getJSONArray("symbols");
                    int length4 = jSONArray4.length();
                    this.symbolEntities = new SymbolEntity[length4];
                    for (int i4 = 0; i4 < length4; i4++) {
                        this.symbolEntities[i4] = new HashtagEntityJSONImpl(jSONArray4.getJSONObject(i4));
                    }
                }
                if (!jSONObject2.isNull("media")) {
                    JSONArray jSONArray5 = jSONObject2.getJSONArray("media");
                    int length5 = jSONArray5.length();
                    this.mediaEntities = new MediaEntity[length5];
                    for (int i5 = 0; i5 < length5; i5++) {
                        this.mediaEntities[i5] = new MediaEntityJSONImpl(jSONArray5.getJSONObject(i5));
                    }
                }
            }
            this.userMentionEntities = this.userMentionEntities == null ? new UserMentionEntity[0] : this.userMentionEntities;
            this.urlEntities = this.urlEntities == null ? new URLEntity[0] : this.urlEntities;
            this.hashtagEntities = this.hashtagEntities == null ? new HashtagEntity[0] : this.hashtagEntities;
            this.symbolEntities = this.symbolEntities == null ? new SymbolEntity[0] : this.symbolEntities;
            this.mediaEntities = this.mediaEntities == null ? new MediaEntity[0] : this.mediaEntities;
            this.extendedMediaEntities = this.extendedMediaEntities == null ? new MediaEntity[0] : this.extendedMediaEntities;
            this.text = HTMLEntity.unescapeAndSlideEntityIncdices(jSONObject.getString("text"), this.userMentionEntities, this.urlEntities, this.hashtagEntities, this.mediaEntities);
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    @Override // twitter4j.DirectMessage
    public final long getId() {
        return this.f3730id;
    }

    @Override // twitter4j.DirectMessage
    public final String getText() {
        return this.text;
    }

    @Override // twitter4j.DirectMessage
    public final long getSenderId() {
        return this.senderId;
    }

    @Override // twitter4j.DirectMessage
    public final long getRecipientId() {
        return this.recipientId;
    }

    @Override // twitter4j.DirectMessage
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Override // twitter4j.DirectMessage
    public final String getSenderScreenName() {
        return this.senderScreenName;
    }

    @Override // twitter4j.DirectMessage
    public final String getRecipientScreenName() {
        return this.recipientScreenName;
    }

    @Override // twitter4j.DirectMessage
    public final User getSender() {
        return this.sender;
    }

    @Override // twitter4j.DirectMessage
    public final User getRecipient() {
        return this.recipient;
    }

    @Override // twitter4j.EntitySupport
    public final UserMentionEntity[] getUserMentionEntities() {
        return this.userMentionEntities;
    }

    @Override // twitter4j.EntitySupport
    public final URLEntity[] getURLEntities() {
        return this.urlEntities;
    }

    @Override // twitter4j.EntitySupport
    public final HashtagEntity[] getHashtagEntities() {
        return this.hashtagEntities;
    }

    @Override // twitter4j.EntitySupport
    public final MediaEntity[] getMediaEntities() {
        return this.mediaEntities;
    }

    @Override // twitter4j.EntitySupport
    public final MediaEntity[] getExtendedMediaEntities() {
        return this.extendedMediaEntities;
    }

    @Override // twitter4j.EntitySupport
    public final SymbolEntity[] getSymbolEntities() {
        return this.symbolEntities;
    }

    static ResponseList createDirectMessageList(HttpResponse httpResponse, Configuration configuration) throws TwitterException, IOException {
        try {
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.clearThreadLocalMap();
            }
            JSONArray jSONArrayAsJSONArray = httpResponse.asJSONArray();
            int length = jSONArrayAsJSONArray.length();
            ResponseListImpl responseListImpl = new ResponseListImpl(length, httpResponse);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArrayAsJSONArray.getJSONObject(i);
                DirectMessageJSONImpl directMessageJSONImpl = new DirectMessageJSONImpl(jSONObject);
                responseListImpl.add(directMessageJSONImpl);
                if (configuration.isJSONStoreEnabled()) {
                    TwitterObjectFactory.registerJSONObject(directMessageJSONImpl, jSONObject);
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

    public final int hashCode() {
        return (int) this.f3730id;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof DirectMessage) && ((DirectMessage) obj).getId() == this.f3730id;
    }

    public final String toString() {
        return "DirectMessageJSONImpl{id=" + this.f3730id + ", text='" + this.text + "', sender_id=" + this.senderId + ", recipient_id=" + this.recipientId + ", created_at=" + this.createdAt + ", userMentionEntities=" + (this.userMentionEntities == null ? null : Arrays.asList(this.userMentionEntities)) + ", urlEntities=" + (this.urlEntities == null ? null : Arrays.asList(this.urlEntities)) + ", hashtagEntities=" + (this.hashtagEntities == null ? null : Arrays.asList(this.hashtagEntities)) + ", sender_screen_name='" + this.senderScreenName + "', recipient_screen_name='" + this.recipientScreenName + "', sender=" + this.sender + ", recipient=" + this.recipient + ", userMentionEntities=" + (this.userMentionEntities == null ? null : Arrays.asList(this.userMentionEntities)) + ", urlEntities=" + (this.urlEntities == null ? null : Arrays.asList(this.urlEntities)) + ", hashtagEntities=" + (this.hashtagEntities != null ? Arrays.asList(this.hashtagEntities) : null) + '}';
    }
}
