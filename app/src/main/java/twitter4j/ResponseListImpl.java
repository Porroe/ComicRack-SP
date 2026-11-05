package twitter4j;

import java.util.ArrayList;

/* compiled from: DontLook */
/* loaded from: classes.dex */
class ResponseListImpl extends ArrayList implements ResponseList {
    private static final long serialVersionUID = 9105950888010803544L;
    private transient int accessLevel;
    private transient RateLimitStatus rateLimitStatus;

    ResponseListImpl(HttpResponse httpResponse) {
        this.rateLimitStatus = null;
        init(httpResponse);
    }

    ResponseListImpl(int i, HttpResponse httpResponse) {
        super(i);
        this.rateLimitStatus = null;
        init(httpResponse);
    }

    ResponseListImpl(RateLimitStatus rateLimitStatus, int i) {
        this.rateLimitStatus = null;
        this.rateLimitStatus = rateLimitStatus;
        this.accessLevel = i;
    }

    private void init(HttpResponse httpResponse) {
        this.rateLimitStatus = RateLimitStatusJSONImpl.createFromResponseHeader(httpResponse);
        this.accessLevel = ParseUtil.toAccessLevel(httpResponse);
    }

    @Override // twitter4j.ResponseList, twitter4j.TwitterResponse
    public RateLimitStatus getRateLimitStatus() {
        return this.rateLimitStatus;
    }

    @Override // twitter4j.TwitterResponse
    public int getAccessLevel() {
        return this.accessLevel;
    }
}
