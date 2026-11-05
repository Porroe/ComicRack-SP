package twitter4j.api;

import twitter4j.IDs;
import twitter4j.PagableResponseList;
import twitter4j.Relationship;
import twitter4j.ResponseList;
import twitter4j.User;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface FriendsFollowersResources {
    User createFriendship(long j);

    User createFriendship(long j, boolean z);

    User createFriendship(String str);

    User createFriendship(String str, boolean z);

    User destroyFriendship(long j);

    User destroyFriendship(String str);

    IDs getFollowersIDs(long j);

    IDs getFollowersIDs(long j, long j2);

    IDs getFollowersIDs(long j, long j2, int i);

    IDs getFollowersIDs(String str, long j);

    IDs getFollowersIDs(String str, long j, int i);

    PagableResponseList getFollowersList(long j, long j2);

    PagableResponseList getFollowersList(long j, long j2, int i);

    PagableResponseList getFollowersList(long j, long j2, int i, boolean z, boolean z2);

    PagableResponseList getFollowersList(String str, long j);

    PagableResponseList getFollowersList(String str, long j, int i);

    PagableResponseList getFollowersList(String str, long j, int i, boolean z, boolean z2);

    IDs getFriendsIDs(long j);

    IDs getFriendsIDs(long j, long j2);

    IDs getFriendsIDs(long j, long j2, int i);

    IDs getFriendsIDs(String str, long j);

    IDs getFriendsIDs(String str, long j, int i);

    PagableResponseList getFriendsList(long j, long j2);

    PagableResponseList getFriendsList(long j, long j2, int i);

    PagableResponseList getFriendsList(long j, long j2, int i, boolean z, boolean z2);

    PagableResponseList getFriendsList(String str, long j);

    PagableResponseList getFriendsList(String str, long j, int i);

    PagableResponseList getFriendsList(String str, long j, int i, boolean z, boolean z2);

    IDs getIncomingFriendships(long j);

    IDs getNoRetweetsFriendships();

    IDs getOutgoingFriendships(long j);

    ResponseList lookupFriendships(long[] jArr);

    ResponseList lookupFriendships(String[] strArr);

    Relationship showFriendship(long j, long j2);

    Relationship showFriendship(String str, String str2);

    Relationship updateFriendship(long j, boolean z, boolean z2);

    Relationship updateFriendship(String str, boolean z, boolean z2);
}
