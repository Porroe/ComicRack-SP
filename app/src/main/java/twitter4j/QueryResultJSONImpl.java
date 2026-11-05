package twitter4j;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class QueryResultJSONImpl extends TwitterResponseImpl implements Serializable, QueryResult {
    private static final long serialVersionUID = -5359566235429947156L;
    private double completedIn;
    private int count;
    private long maxId;
    private String nextResults;
    private String query;
    private String refreshUrl;
    private long sinceId;
    private List tweets;

    QueryResultJSONImpl(HttpResponse httpResponse, Configuration configuration) throws TwitterException, IOException {
        super(httpResponse);
        JSONObject jSONObjectAsJSONObject = httpResponse.asJSONObject();
        try {
            JSONObject jSONObject = jSONObjectAsJSONObject.getJSONObject("search_metadata");
            this.completedIn = ParseUtil.getDouble("completed_in", jSONObject);
            this.count = ParseUtil.getInt("count", jSONObject);
            this.maxId = ParseUtil.getLong("max_id", jSONObject);
            this.nextResults = jSONObject.has("next_results") ? jSONObject.getString("next_results") : null;
            this.query = ParseUtil.getURLDecodedString("query", jSONObject);
            this.refreshUrl = ParseUtil.getUnescapedString("refresh_url", jSONObject);
            this.sinceId = ParseUtil.getLong("since_id", jSONObject);
            JSONArray jSONArray = jSONObjectAsJSONObject.getJSONArray("statuses");
            this.tweets = new ArrayList(jSONArray.length());
            if (configuration.isJSONStoreEnabled()) {
                TwitterObjectFactory.clearThreadLocalMap();
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                this.tweets.add(new StatusJSONImpl(jSONArray.getJSONObject(i), configuration));
            }
        } catch (JSONException e) {
            throw new TwitterException(e.getMessage() + ":" + jSONObjectAsJSONObject.toString(), e);
        }
    }

    QueryResultJSONImpl(Query query) {
        this.sinceId = query.getSinceId();
        this.count = query.getCount();
        this.tweets = new ArrayList(0);
    }

    @Override // twitter4j.QueryResult
    public final long getSinceId() {
        return this.sinceId;
    }

    @Override // twitter4j.QueryResult
    public final long getMaxId() {
        return this.maxId;
    }

    @Override // twitter4j.QueryResult
    public final String getRefreshURL() {
        return this.refreshUrl;
    }

    @Override // twitter4j.QueryResult
    public final int getCount() {
        return this.count;
    }

    @Override // twitter4j.QueryResult
    public final double getCompletedIn() {
        return this.completedIn;
    }

    @Override // twitter4j.QueryResult
    public final String getQuery() {
        return this.query;
    }

    @Override // twitter4j.QueryResult
    public final List getTweets() {
        return this.tweets;
    }

    @Override // twitter4j.QueryResult
    public final Query nextQuery() {
        if (this.nextResults == null) {
            return null;
        }
        return Query.createWithNextPageQuery(this.nextResults);
    }

    @Override // twitter4j.QueryResult
    public final boolean hasNext() {
        return this.nextResults != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryResult queryResult = (QueryResult) obj;
        if (Double.compare(queryResult.getCompletedIn(), this.completedIn) == 0 && this.maxId == queryResult.getMaxId() && this.count == queryResult.getCount() && this.sinceId == queryResult.getSinceId() && this.query.equals(queryResult.getQuery())) {
            if (this.refreshUrl == null ? queryResult.getRefreshURL() != null : !this.refreshUrl.equals(queryResult.getRefreshURL())) {
                return false;
            }
            if (this.tweets != null) {
                if (this.tweets.equals(queryResult.getTweets())) {
                    return true;
                }
            } else if (queryResult.getTweets() == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.refreshUrl != null ? this.refreshUrl.hashCode() : 0) + (((((int) (this.sinceId ^ (this.sinceId >>> 32))) * 31) + ((int) (this.maxId ^ (this.maxId >>> 32)))) * 31)) * 31) + this.count;
        long jDoubleToLongBits = this.completedIn != 0.0d ? Double.doubleToLongBits(this.completedIn) : 0L;
        return (((((iHashCode * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31) + this.query.hashCode()) * 31) + (this.tweets != null ? this.tweets.hashCode() : 0);
    }

    public final String toString() {
        return "QueryResultJSONImpl{sinceId=" + this.sinceId + ", maxId=" + this.maxId + ", refreshUrl='" + this.refreshUrl + "', count=" + this.count + ", completedIn=" + this.completedIn + ", query='" + this.query + "', tweets=" + this.tweets + '}';
    }
}
