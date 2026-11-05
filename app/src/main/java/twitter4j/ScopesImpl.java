package twitter4j;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class ScopesImpl implements Scopes {
    private final String[] placeIds;

    ScopesImpl() {
        this.placeIds = new String[0];
    }

    public ScopesImpl(String[] strArr) {
        this.placeIds = strArr;
    }

    @Override // twitter4j.Scopes
    public String[] getPlaceIds() {
        return this.placeIds;
    }
}
