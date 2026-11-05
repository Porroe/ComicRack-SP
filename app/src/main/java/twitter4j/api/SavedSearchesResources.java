package twitter4j.api;

import twitter4j.ResponseList;
import twitter4j.SavedSearch;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface SavedSearchesResources {
    SavedSearch createSavedSearch(String str);

    SavedSearch destroySavedSearch(int i);

    ResponseList getSavedSearches();

    SavedSearch showSavedSearch(int i);
}
