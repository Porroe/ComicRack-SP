package twitter4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public final class Query implements Serializable {
    private static final long serialVersionUID = 7196404519192910019L;
    private int count;
    private String geocode;
    private String lang;
    private String locale;
    private long maxId;
    private String nextPageQuery;
    private String query;
    private ResultType resultType;
    private String since;
    private long sinceId;
    private String until;
    public static final Unit MILES = Unit.mi;
    public static final Unit KILOMETERS = Unit.km;
    public static final ResultType MIXED = ResultType.mixed;
    public static final ResultType POPULAR = ResultType.popular;
    public static final ResultType RECENT = ResultType.recent;
    private static final HttpParameter WITH_TWITTER_USER_ID = new HttpParameter("with_twitter_user_id", "true");

    /* compiled from: DontLook */
    public enum ResultType {
        popular,
        mixed,
        recent
    }

    /* compiled from: DontLook */
    public enum Unit {
        mi,
        km
    }

    public Query() {
        this.query = null;
        this.lang = null;
        this.locale = null;
        this.maxId = -1L;
        this.count = -1;
        this.since = null;
        this.sinceId = -1L;
        this.geocode = null;
        this.until = null;
        this.resultType = null;
        this.nextPageQuery = null;
    }

    public Query(String str) {
        this.query = null;
        this.lang = null;
        this.locale = null;
        this.maxId = -1L;
        this.count = -1;
        this.since = null;
        this.sinceId = -1L;
        this.geocode = null;
        this.until = null;
        this.resultType = null;
        this.nextPageQuery = null;
        this.query = str;
    }

    static Query createWithNextPageQuery(String str) {
        Query query = new Query();
        query.nextPageQuery = str;
        return query;
    }

    public final String getQuery() {
        return this.query;
    }

    public final void setQuery(String str) {
        this.query = str;
    }

    public final Query query(String str) {
        this.query = str;
        return this;
    }

    public final String getLang() {
        return this.lang;
    }

    public final void setLang(String str) {
        this.lang = str;
    }

    public final Query lang(String str) {
        this.lang = str;
        return this;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final void setLocale(String str) {
        this.locale = str;
    }

    public final Query locale(String str) {
        this.locale = str;
        return this;
    }

    public final long getMaxId() {
        return this.maxId;
    }

    public final void setMaxId(long j) {
        this.maxId = j;
    }

    public final Query maxId(long j) {
        this.maxId = j;
        return this;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final Query count(int i) {
        this.count = i;
        return this;
    }

    public final String getSince() {
        return this.since;
    }

    public final void setSince(String str) {
        this.since = str;
    }

    public final Query since(String str) {
        this.since = str;
        return this;
    }

    public final long getSinceId() {
        return this.sinceId;
    }

    public final void setSinceId(long j) {
        this.sinceId = j;
    }

    public final Query sinceId(long j) {
        this.sinceId = j;
        return this;
    }

    public final String getGeocode() {
        return this.geocode;
    }

    public final void setGeoCode(GeoLocation geoLocation, double d, Unit unit) {
        this.geocode = geoLocation.getLatitude() + "," + geoLocation.getLongitude() + "," + d + unit.name();
    }

    public final void setGeoCode(GeoLocation geoLocation, double d, String str) {
        this.geocode = geoLocation.getLatitude() + "," + geoLocation.getLongitude() + "," + d + str;
    }

    public final Query geoCode(GeoLocation geoLocation, double d, String str) {
        setGeoCode(geoLocation, d, str);
        return this;
    }

    public final String getUntil() {
        return this.until;
    }

    public final void setUntil(String str) {
        this.until = str;
    }

    public final Query until(String str) {
        this.until = str;
        return this;
    }

    public final ResultType getResultType() {
        return this.resultType;
    }

    public final void setResultType(ResultType resultType) {
        this.resultType = resultType;
    }

    public final Query resultType(ResultType resultType) {
        this.resultType = resultType;
        return this;
    }

    final HttpParameter[] asHttpParameterArray() {
        ArrayList arrayList = new ArrayList(12);
        appendParameter("q", this.query, arrayList);
        appendParameter("lang", this.lang, arrayList);
        appendParameter("locale", this.locale, arrayList);
        appendParameter("max_id", this.maxId, arrayList);
        appendParameter("count", this.count, arrayList);
        appendParameter("since", this.since, arrayList);
        appendParameter("since_id", this.sinceId, arrayList);
        appendParameter("geocode", this.geocode, arrayList);
        appendParameter("until", this.until, arrayList);
        if (this.resultType != null) {
            arrayList.add(new HttpParameter("result_type", this.resultType.name()));
        }
        arrayList.add(WITH_TWITTER_USER_ID);
        return (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()]);
    }

    private void appendParameter(String str, String str2, List list) {
        if (str2 != null) {
            list.add(new HttpParameter(str, str2));
        }
    }

    private void appendParameter(String str, long j, List list) {
        if (0 <= j) {
            list.add(new HttpParameter(str, String.valueOf(j)));
        }
    }

    final String nextPage() {
        return this.nextPageQuery;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Query query = (Query) obj;
        if (this.maxId == query.maxId && this.count == query.count && this.sinceId == query.sinceId) {
            if (this.geocode == null ? query.geocode != null : !this.geocode.equals(query.geocode)) {
                return false;
            }
            if (this.lang == null ? query.lang != null : !this.lang.equals(query.lang)) {
                return false;
            }
            if (this.locale == null ? query.locale != null : !this.locale.equals(query.locale)) {
                return false;
            }
            if (this.nextPageQuery == null ? query.nextPageQuery != null : !this.nextPageQuery.equals(query.nextPageQuery)) {
                return false;
            }
            if (this.query == null ? query.query != null : !this.query.equals(query.query)) {
                return false;
            }
            if (this.resultType == null ? query.resultType != null : !this.resultType.equals(query.resultType)) {
                return false;
            }
            if (this.since == null ? query.since != null : !this.since.equals(query.since)) {
                return false;
            }
            if (this.until != null) {
                if (this.until.equals(query.until)) {
                    return true;
                }
            } else if (query.until == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.resultType != null ? this.resultType.hashCode() : 0) + (((this.until != null ? this.until.hashCode() : 0) + (((this.geocode != null ? this.geocode.hashCode() : 0) + (((((this.since != null ? this.since.hashCode() : 0) + (((((((this.locale != null ? this.locale.hashCode() : 0) + (((this.lang != null ? this.lang.hashCode() : 0) + ((this.query != null ? this.query.hashCode() : 0) * 31)) * 31)) * 31) + ((int) (this.maxId ^ (this.maxId >>> 32)))) * 31) + this.count) * 31)) * 31) + ((int) (this.sinceId ^ (this.sinceId >>> 32)))) * 31)) * 31)) * 31)) * 31) + (this.nextPageQuery != null ? this.nextPageQuery.hashCode() : 0);
    }

    public final String toString() {
        return "Query{query='" + this.query + "', lang='" + this.lang + "', locale='" + this.locale + "', maxId=" + this.maxId + ", count=" + this.count + ", since='" + this.since + "', sinceId=" + this.sinceId + ", geocode='" + this.geocode + "', until='" + this.until + "', resultType='" + this.resultType + "', nextPageQuery='" + this.nextPageQuery + "'}";
    }
}
