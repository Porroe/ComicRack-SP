package twitter4j;

import java.util.Arrays;
import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class IDsJSONImpl extends TwitterResponseImpl implements IDs {
    private static final long serialVersionUID = 6999637496007165672L;
    private long[] ids;
    private long nextCursor;
    private long previousCursor;

    IDsJSONImpl(HttpResponse httpResponse, Configuration configuration) throws Throwable {
        super(httpResponse);
        this.previousCursor = -1L;
        this.nextCursor = -1L;
        String strAsString = httpResponse.asString();
        init(strAsString);
        if (configuration.isJSONStoreEnabled()) {
            TwitterObjectFactory.clearThreadLocalMap();
            TwitterObjectFactory.registerJSONObject(this, strAsString);
        }
    }

    IDsJSONImpl(String str) throws TwitterException {
        this.previousCursor = -1L;
        this.nextCursor = -1L;
        init(str);
    }

    private void init(String str) throws TwitterException {
        int i = 0;
        try {
            if (str.startsWith("{")) {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArray = jSONObject.getJSONArray("ids");
                this.ids = new long[jSONArray.length()];
                while (i < jSONArray.length()) {
                    try {
                        this.ids[i] = Long.parseLong(jSONArray.getString(i));
                        i++;
                    } catch (NumberFormatException e) {
                        throw new TwitterException("Twitter API returned malformed response: " + jSONObject, e);
                    }
                }
                this.previousCursor = ParseUtil.getLong("previous_cursor", jSONObject);
                this.nextCursor = ParseUtil.getLong("next_cursor", jSONObject);
                return;
            }
            JSONArray jSONArray2 = new JSONArray(str);
            this.ids = new long[jSONArray2.length()];
            while (i < jSONArray2.length()) {
                try {
                    this.ids[i] = Long.parseLong(jSONArray2.getString(i));
                    i++;
                } catch (NumberFormatException e2) {
                    throw new TwitterException("Twitter API returned malformed response: " + jSONArray2, e2);
                }
            }
            return;
        } catch (JSONException e3) {
            throw new TwitterException(e3);
        }
        throw new TwitterException(e3);
    }

    @Override // twitter4j.IDs
    public final long[] getIDs() {
        return this.ids;
    }

    @Override // twitter4j.IDs, twitter4j.CursorSupport
    public final boolean hasPrevious() {
        return 0 != this.previousCursor;
    }

    @Override // twitter4j.IDs, twitter4j.CursorSupport
    public final long getPreviousCursor() {
        return this.previousCursor;
    }

    @Override // twitter4j.IDs, twitter4j.CursorSupport
    public final boolean hasNext() {
        return 0 != this.nextCursor;
    }

    @Override // twitter4j.IDs, twitter4j.CursorSupport
    public final long getNextCursor() {
        return this.nextCursor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IDs) && Arrays.equals(this.ids, ((IDs) obj).getIDs());
    }

    public final int hashCode() {
        if (this.ids != null) {
            return Arrays.hashCode(this.ids);
        }
        return 0;
    }

    public final String toString() {
        return "IDsJSONImpl{ids=" + Arrays.toString(this.ids) + ", previousCursor=" + this.previousCursor + ", nextCursor=" + this.nextCursor + '}';
    }
}
