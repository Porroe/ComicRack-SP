package twitter4j;

import java.io.Serializable;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class TrendJSONImpl implements Serializable, Trend {
    private static final long serialVersionUID = -4353426776065521132L;
    private final String name;
    private String query;
    private String url;

    TrendJSONImpl(JSONObject jSONObject, boolean z) {
        this.url = null;
        this.query = null;
        this.name = ParseUtil.getRawString("name", jSONObject);
        this.url = ParseUtil.getRawString("url", jSONObject);
        this.query = ParseUtil.getRawString("query", jSONObject);
        if (z) {
            TwitterObjectFactory.registerJSONObject(this, jSONObject);
        }
    }

    TrendJSONImpl(JSONObject jSONObject) {
        this(jSONObject, false);
    }

    @Override // twitter4j.Trend
    public final String getName() {
        return this.name;
    }

    @Override // twitter4j.Trend
    public final String getURL() {
        return this.url;
    }

    @Override // twitter4j.Trend
    public final String getQuery() {
        return this.query;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Trend)) {
            return false;
        }
        Trend trend = (Trend) obj;
        if (!this.name.equals(trend.getName())) {
            return false;
        }
        if (this.query == null ? trend.getQuery() != null : !this.query.equals(trend.getQuery())) {
            return false;
        }
        if (this.url != null) {
            if (this.url.equals(trend.getURL())) {
                return true;
            }
        } else if (trend.getURL() == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.url != null ? this.url.hashCode() : 0) + (this.name.hashCode() * 31)) * 31) + (this.query != null ? this.query.hashCode() : 0);
    }

    public final String toString() {
        return "TrendJSONImpl{name='" + this.name + "', url='" + this.url + "', query='" + this.query + "'}";
    }
}
