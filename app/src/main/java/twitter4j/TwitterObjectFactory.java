package twitter4j;

import java.util.HashMap;
import java.util.Map;
import twitter4j.JSONObjectType;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public final class TwitterObjectFactory {
    private static final ThreadLocal rawJsonMap = new C11801();
    private static boolean registeredAtleastOnce = false;

    private TwitterObjectFactory() {
        throw new AssertionError("not intended to be instantiated.");
    }

    /* compiled from: DontLook */
    /* renamed from: twitter4j.TwitterObjectFactory$1 */
    final class C11801 extends ThreadLocal {
        C11801() {
        }

        @Override // java.lang.ThreadLocal
        protected final /* bridge */ /* synthetic */ Object initialValue() {
            return initialValue();
        }

        @Override // java.lang.ThreadLocal
        protected final Map initialValue() {
            return new HashMap();
        }
    }

    public static String getRawJSON(Object obj) {
        if (!registeredAtleastOnce) {
            throw new IllegalStateException("Apparently jsonStoreEnabled is not set to true.");
        }
        Object obj2 = ((Map) rawJsonMap.get()).get(obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 != null) {
            return obj2.toString();
        }
        return null;
    }

    public static Status createStatus(String str) throws TwitterException {
        try {
            return new StatusJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    public static User createUser(String str) throws TwitterException {
        try {
            return new UserJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    public static AccountTotals createAccountTotals(String str) throws TwitterException {
        try {
            return new AccountTotalsJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    public static Relationship createRelationship(String str) throws TwitterException {
        try {
            return new RelationshipJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    public static Place createPlace(String str) throws TwitterException {
        try {
            return new PlaceJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    public static SavedSearch createSavedSearch(String str) throws TwitterException {
        try {
            return new SavedSearchJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    public static Trend createTrend(String str) throws TwitterException {
        try {
            return new TrendJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    public static Trends createTrends(String str) {
        return new TrendsJSONImpl(str);
    }

    public static IDs createIDs(String str) {
        return new IDsJSONImpl(str);
    }

    public static Map createRateLimitStatus(String str) throws TwitterException {
        try {
            return RateLimitStatusJSONImpl.createRateLimitStatuses(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    public static Category createCategory(String str) throws TwitterException {
        try {
            return new CategoryJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    public static DirectMessage createDirectMessage(String str) throws TwitterException {
        try {
            return new DirectMessageJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    public static Location createLocation(String str) throws TwitterException {
        try {
            return new LocationJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    public static UserList createUserList(String str) throws TwitterException {
        try {
            return new UserListJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    public static OEmbed createOEmbed(String str) throws TwitterException {
        try {
            return new OEmbedJSONImpl(new JSONObject(str));
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    public static Object createObject(String str) throws TwitterException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            switch (C11812.$SwitchMap$twitter4j$JSONObjectType$Type[JSONObjectType.determine(jSONObject).ordinal()]) {
                case TwitterResponse.READ /* 1 */:
                    return registerJSONObject(new DirectMessageJSONImpl(jSONObject.getJSONObject("direct_message")), jSONObject);
                case TwitterResponse.READ_WRITE /* 2 */:
                    return registerJSONObject(new StatusJSONImpl(jSONObject), jSONObject);
                case TwitterResponse.READ_WRITE_DIRECTMESSAGES /* 3 */:
                    return registerJSONObject(new DirectMessageJSONImpl(jSONObject.getJSONObject("direct_message")), jSONObject);
                case 4:
                    return registerJSONObject(new StatusDeletionNoticeImpl(jSONObject.getJSONObject("delete").getJSONObject("status")), jSONObject);
                case 5:
                case 6:
                default:
                    return jSONObject;
            }
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    /* compiled from: DontLook */
    /* renamed from: twitter4j.TwitterObjectFactory$2 */
    /* synthetic */ class C11812 {
        static final /* synthetic */ int[] $SwitchMap$twitter4j$JSONObjectType$Type = new int[JSONObjectType.Type.values().length];

        static {
            try {
                $SwitchMap$twitter4j$JSONObjectType$Type[JSONObjectType.Type.SENDER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$twitter4j$JSONObjectType$Type[JSONObjectType.Type.STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$twitter4j$JSONObjectType$Type[JSONObjectType.Type.DIRECT_MESSAGE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$twitter4j$JSONObjectType$Type[JSONObjectType.Type.DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$twitter4j$JSONObjectType$Type[JSONObjectType.Type.LIMIT.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$twitter4j$JSONObjectType$Type[JSONObjectType.Type.SCRUB_GEO.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
        }
    }

    static void clearThreadLocalMap() {
        ((Map) rawJsonMap.get()).clear();
    }

    static Object registerJSONObject(Object obj, Object obj2) {
        registeredAtleastOnce = true;
        ((Map) rawJsonMap.get()).put(obj, obj2);
        return obj;
    }
}
