package twitter4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public final class GeoQuery implements Serializable {
    private static final long serialVersionUID = 5434503339001056634L;
    private String accuracy;
    private String granularity;

    /* renamed from: ip */
    private String f3732ip;
    private GeoLocation location;
    private int maxResults;
    private String query;

    public GeoQuery(GeoLocation geoLocation) {
        this.query = null;
        this.f3732ip = null;
        this.accuracy = null;
        this.granularity = null;
        this.maxResults = -1;
        this.location = geoLocation;
    }

    public GeoQuery(String str) {
        this.query = null;
        this.f3732ip = null;
        this.accuracy = null;
        this.granularity = null;
        this.maxResults = -1;
        this.f3732ip = str;
    }

    public final GeoLocation getLocation() {
        return this.location;
    }

    public final String getQuery() {
        return this.query;
    }

    public final void setQuery(String str) {
        this.query = str;
    }

    public final String getIp() {
        return this.f3732ip;
    }

    public final String getAccuracy() {
        return this.accuracy;
    }

    public final void setAccuracy(String str) {
        this.accuracy = str;
    }

    public final GeoQuery accuracy(String str) {
        this.accuracy = str;
        return this;
    }

    public final String getGranularity() {
        return this.granularity;
    }

    public final void setGranularity(String str) {
        this.granularity = str;
    }

    public final GeoQuery granularity(String str) {
        this.granularity = str;
        return this;
    }

    public final int getMaxResults() {
        return this.maxResults;
    }

    public final void setMaxResults(int i) {
        this.maxResults = i;
    }

    public final GeoQuery maxResults(int i) {
        this.maxResults = i;
        return this;
    }

    final HttpParameter[] asHttpParameterArray() {
        ArrayList arrayList = new ArrayList();
        if (this.location != null) {
            appendParameter("lat", this.location.getLatitude(), arrayList);
            appendParameter("long", this.location.getLongitude(), arrayList);
        }
        if (this.f3732ip != null) {
            appendParameter("ip", this.f3732ip, arrayList);
        }
        appendParameter("accuracy", this.accuracy, arrayList);
        appendParameter("query", this.query, arrayList);
        appendParameter("granularity", this.granularity, arrayList);
        appendParameter("max_results", this.maxResults, (List) arrayList);
        return (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()]);
    }

    private void appendParameter(String str, String str2, List list) {
        if (str2 != null) {
            list.add(new HttpParameter(str, str2));
        }
    }

    private void appendParameter(String str, int i, List list) {
        if (i > 0) {
            list.add(new HttpParameter(str, String.valueOf(i)));
        }
    }

    private void appendParameter(String str, double d, List list) {
        list.add(new HttpParameter(str, String.valueOf(d)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeoQuery geoQuery = (GeoQuery) obj;
        if (this.maxResults != geoQuery.maxResults) {
            return false;
        }
        if (this.accuracy == null ? geoQuery.accuracy != null : !this.accuracy.equals(geoQuery.accuracy)) {
            return false;
        }
        if (this.granularity == null ? geoQuery.granularity != null : !this.granularity.equals(geoQuery.granularity)) {
            return false;
        }
        if (this.f3732ip == null ? geoQuery.f3732ip != null : !this.f3732ip.equals(geoQuery.f3732ip)) {
            return false;
        }
        if (this.location != null) {
            if (this.location.equals(geoQuery.location)) {
                return true;
            }
        } else if (geoQuery.location == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.accuracy != null ? this.accuracy.hashCode() : 0) + (((this.f3732ip != null ? this.f3732ip.hashCode() : 0) + ((this.location != null ? this.location.hashCode() : 0) * 31)) * 31)) * 31) + (this.granularity != null ? this.granularity.hashCode() : 0)) * 31) + this.maxResults;
    }

    public final String toString() {
        return "GeoQuery{location=" + this.location + ", query='" + this.query + "', ip='" + this.f3732ip + "', accuracy='" + this.accuracy + "', granularity='" + this.granularity + "', maxResults=" + this.maxResults + '}';
    }
}
