package twitter4j;

import java.io.Serializable;
import java.util.Map;

/* compiled from: DontLook */
/* loaded from: classes.dex */
interface ObjectFactory extends Serializable {
    UserList createAUserList(HttpResponse httpResponse);

    UserList createAUserList(JSONObject jSONObject);

    AccountSettings createAccountSettings(HttpResponse httpResponse);

    AccountTotals createAccountTotals(HttpResponse httpResponse);

    ResponseList createCategoryList(HttpResponse httpResponse);

    DirectMessage createDirectMessage(HttpResponse httpResponse);

    ResponseList createDirectMessageList(HttpResponse httpResponse);

    ResponseList createEmptyResponseList();

    ResponseList createFriendshipList(HttpResponse httpResponse);

    IDs createIDs(HttpResponse httpResponse);

    ResponseList createLanguageList(HttpResponse httpResponse);

    ResponseList createLocationList(HttpResponse httpResponse);

    OEmbed createOEmbed(HttpResponse httpResponse);

    PagableResponseList createPagableUserList(HttpResponse httpResponse);

    PagableResponseList createPagableUserListList(HttpResponse httpResponse);

    Place createPlace(HttpResponse httpResponse);

    ResponseList createPlaceList(HttpResponse httpResponse);

    QueryResult createQueryResult(HttpResponse httpResponse, Query query);

    Map createRateLimitStatuses(HttpResponse httpResponse);

    Relationship createRelationship(HttpResponse httpResponse);

    SavedSearch createSavedSearch(HttpResponse httpResponse);

    ResponseList createSavedSearchList(HttpResponse httpResponse);

    Status createStatus(HttpResponse httpResponse);

    Status createStatus(JSONObject jSONObject);

    ResponseList createStatusList(HttpResponse httpResponse);

    Trends createTrends(HttpResponse httpResponse);

    TwitterAPIConfiguration createTwitterAPIConfiguration(HttpResponse httpResponse);

    User createUser(HttpResponse httpResponse);

    User createUser(JSONObject jSONObject);

    ResponseList createUserList(HttpResponse httpResponse);

    ResponseList createUserListFromJSONArray(HttpResponse httpResponse);

    ResponseList createUserListFromJSONArray_Users(HttpResponse httpResponse);

    ResponseList createUserListList(HttpResponse httpResponse);
}
