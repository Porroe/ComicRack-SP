package twitter4j;

import java.io.Serializable;
import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
class AccountTotalsJSONImpl extends TwitterResponseImpl implements Serializable, AccountTotals {
    private static final long serialVersionUID = 4199733699237229892L;
    private final int favorites;
    private final int followers;
    private final int friends;
    private final int updates;

    private AccountTotalsJSONImpl(HttpResponse httpResponse, JSONObject jSONObject) {
        super(httpResponse);
        this.updates = ParseUtil.getInt("updates", jSONObject);
        this.followers = ParseUtil.getInt("followers", jSONObject);
        this.favorites = ParseUtil.getInt("favorites", jSONObject);
        this.friends = ParseUtil.getInt("friends", jSONObject);
    }

    AccountTotalsJSONImpl(HttpResponse httpResponse, Configuration configuration) {
        this(httpResponse, httpResponse.asJSONObject());
        if (configuration.isJSONStoreEnabled()) {
            TwitterObjectFactory.clearThreadLocalMap();
            TwitterObjectFactory.registerJSONObject(this, httpResponse.asJSONObject());
        }
    }

    AccountTotalsJSONImpl(JSONObject jSONObject) {
        this((HttpResponse) null, jSONObject);
    }

    @Override // twitter4j.AccountTotals
    public int getUpdates() {
        return this.updates;
    }

    @Override // twitter4j.AccountTotals
    public int getFollowers() {
        return this.followers;
    }

    @Override // twitter4j.AccountTotals
    public int getFavorites() {
        return this.favorites;
    }

    @Override // twitter4j.AccountTotals
    public int getFriends() {
        return this.friends;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccountTotalsJSONImpl accountTotalsJSONImpl = (AccountTotalsJSONImpl) obj;
        return this.favorites == accountTotalsJSONImpl.favorites && this.followers == accountTotalsJSONImpl.followers && this.friends == accountTotalsJSONImpl.friends && this.updates == accountTotalsJSONImpl.updates;
    }

    public int hashCode() {
        return (((((this.updates * 31) + this.followers) * 31) + this.favorites) * 31) + this.friends;
    }

    public String toString() {
        return "AccountTotalsJSONImpl{updates=" + this.updates + ", followers=" + this.followers + ", favorites=" + this.favorites + ", friends=" + this.friends + '}';
    }
}
