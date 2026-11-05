package twitter4j.api;

import twitter4j.ResponseList;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface SuggestedUsersResources {
    ResponseList getMemberSuggestions(String str);

    ResponseList getSuggestedUserCategories();

    ResponseList getUserSuggestions(String str);
}
