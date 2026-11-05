package twitter4j.api;

import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.Status;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface FavoritesResources {
    Status createFavorite(long j);

    Status destroyFavorite(long j);

    ResponseList getFavorites();

    ResponseList getFavorites(long j);

    ResponseList getFavorites(long j, Paging paging);

    ResponseList getFavorites(String str);

    ResponseList getFavorites(String str, Paging paging);

    ResponseList getFavorites(Paging paging);
}
