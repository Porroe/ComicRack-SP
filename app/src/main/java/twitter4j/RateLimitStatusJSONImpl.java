package twitter4j;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class RateLimitStatusJSONImpl implements Serializable, RateLimitStatus {
    private static final long serialVersionUID = 7790337632915862445L;
    private int limit;
    private int remaining;
    private int resetTimeInSeconds;
    private int secondsUntilReset;

    static Map createRateLimitStatuses(HttpResponse httpResponse, Configuration configuration) throws TwitterException, IOException {
        JSONObject jSONObjectAsJSONObject = httpResponse.asJSONObject();
        Map mapCreateRateLimitStatuses = createRateLimitStatuses(jSONObjectAsJSONObject);
        if (configuration.isJSONStoreEnabled()) {
            TwitterObjectFactory.clearThreadLocalMap();
            TwitterObjectFactory.registerJSONObject(mapCreateRateLimitStatuses, jSONObjectAsJSONObject);
        }
        return mapCreateRateLimitStatuses;
    }

    static Map createRateLimitStatuses(JSONObject jSONObject) throws TwitterException {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("resources");
            Iterator itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject((String) itKeys.next());
                Iterator itKeys2 = jSONObject3.keys();
                while (itKeys2.hasNext()) {
                    String str = (String) itKeys2.next();
                    map.put(str, new RateLimitStatusJSONImpl(jSONObject3.getJSONObject(str)));
                }
            }
            return Collections.unmodifiableMap(map);
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    private RateLimitStatusJSONImpl(int i, int i2, int i3) {
        this.limit = i;
        this.remaining = i2;
        this.resetTimeInSeconds = i3;
        this.secondsUntilReset = (int) (((i3 * 1000) - System.currentTimeMillis()) / 1000);
    }

    RateLimitStatusJSONImpl(JSONObject jSONObject) {
        init(jSONObject);
    }

    final void init(JSONObject jSONObject) {
        this.limit = ParseUtil.getInt("limit", jSONObject);
        this.remaining = ParseUtil.getInt("remaining", jSONObject);
        this.resetTimeInSeconds = ParseUtil.getInt("reset", jSONObject);
        this.secondsUntilReset = (int) (((this.resetTimeInSeconds * 1000) - System.currentTimeMillis()) / 1000);
    }

    static RateLimitStatus createFromResponseHeader(HttpResponse httpResponse) throws NumberFormatException {
        String responseHeader;
        if (httpResponse == null || (responseHeader = httpResponse.getResponseHeader("X-Rate-Limit-Limit")) == null) {
            return null;
        }
        int i = Integer.parseInt(responseHeader);
        String responseHeader2 = httpResponse.getResponseHeader("X-Rate-Limit-Remaining");
        if (responseHeader2 == null) {
            return null;
        }
        int i2 = Integer.parseInt(responseHeader2);
        String responseHeader3 = httpResponse.getResponseHeader("X-Rate-Limit-Reset");
        if (responseHeader3 != null) {
            return new RateLimitStatusJSONImpl(i, i2, (int) Long.parseLong(responseHeader3));
        }
        return null;
    }

    @Override // twitter4j.RateLimitStatus
    public final int getRemaining() {
        return this.remaining;
    }

    @Override // twitter4j.RateLimitStatus
    public final int getLimit() {
        return this.limit;
    }

    @Override // twitter4j.RateLimitStatus
    public final int getResetTimeInSeconds() {
        return this.resetTimeInSeconds;
    }

    @Override // twitter4j.RateLimitStatus
    public final int getSecondsUntilReset() {
        return this.secondsUntilReset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RateLimitStatusJSONImpl rateLimitStatusJSONImpl = (RateLimitStatusJSONImpl) obj;
        return this.limit == rateLimitStatusJSONImpl.limit && this.remaining == rateLimitStatusJSONImpl.remaining && this.resetTimeInSeconds == rateLimitStatusJSONImpl.resetTimeInSeconds && this.secondsUntilReset == rateLimitStatusJSONImpl.secondsUntilReset;
    }

    public final int hashCode() {
        return (((((this.remaining * 31) + this.limit) * 31) + this.resetTimeInSeconds) * 31) + this.secondsUntilReset;
    }

    public final String toString() {
        return "RateLimitStatusJSONImpl{remaining=" + this.remaining + ", limit=" + this.limit + ", resetTimeInSeconds=" + this.resetTimeInSeconds + ", secondsUntilReset=" + this.secondsUntilReset + '}';
    }
}
