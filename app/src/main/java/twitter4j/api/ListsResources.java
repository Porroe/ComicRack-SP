package twitter4j.api;

import twitter4j.PagableResponseList;
import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.User;
import twitter4j.UserList;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface ListsResources {
    UserList createUserList(String str, boolean z, String str2);

    UserList createUserListMember(long j, long j2);

    UserList createUserListMember(long j, String str, long j2);

    UserList createUserListMember(String str, String str2, long j);

    UserList createUserListMembers(long j, String str, long[] jArr);

    UserList createUserListMembers(long j, String str, String[] strArr);

    UserList createUserListMembers(long j, long[] jArr);

    UserList createUserListMembers(long j, String[] strArr);

    UserList createUserListMembers(String str, String str2, long[] jArr);

    UserList createUserListMembers(String str, String str2, String[] strArr);

    UserList createUserListSubscription(long j);

    UserList createUserListSubscription(long j, String str);

    UserList createUserListSubscription(String str, String str2);

    UserList destroyUserList(long j);

    UserList destroyUserList(long j, String str);

    UserList destroyUserList(String str, String str2);

    UserList destroyUserListMember(long j, long j2);

    UserList destroyUserListMember(long j, String str);

    UserList destroyUserListMember(long j, String str, long j2);

    UserList destroyUserListMember(String str, String str2, long j);

    UserList destroyUserListMembers(long j, long[] jArr);

    UserList destroyUserListMembers(long j, String[] strArr);

    UserList destroyUserListMembers(String str, String str2, String[] strArr);

    UserList destroyUserListSubscription(long j);

    UserList destroyUserListSubscription(long j, String str);

    UserList destroyUserListSubscription(String str, String str2);

    PagableResponseList getUserListMembers(long j, long j2);

    PagableResponseList getUserListMembers(long j, String str, long j2);

    PagableResponseList getUserListMembers(String str, String str2, long j);

    PagableResponseList getUserListMemberships(long j);

    PagableResponseList getUserListMemberships(long j, long j2);

    PagableResponseList getUserListMemberships(long j, long j2, boolean z);

    PagableResponseList getUserListMemberships(String str, long j);

    PagableResponseList getUserListMemberships(String str, long j, boolean z);

    ResponseList getUserListStatuses(long j, String str, Paging paging);

    ResponseList getUserListStatuses(long j, Paging paging);

    ResponseList getUserListStatuses(String str, String str2, Paging paging);

    PagableResponseList getUserListSubscribers(long j, long j2);

    PagableResponseList getUserListSubscribers(long j, String str, long j2);

    PagableResponseList getUserListSubscribers(String str, String str2, long j);

    PagableResponseList getUserListSubscriptions(String str, long j);

    ResponseList getUserLists(long j);

    ResponseList getUserLists(String str);

    PagableResponseList getUserListsOwnerships(long j, int i, long j2);

    PagableResponseList getUserListsOwnerships(String str, int i, long j);

    UserList showUserList(long j);

    UserList showUserList(long j, String str);

    UserList showUserList(String str, String str2);

    User showUserListMembership(long j, long j2);

    User showUserListMembership(long j, String str, long j2);

    User showUserListMembership(String str, String str2, long j);

    User showUserListSubscription(long j, long j2);

    User showUserListSubscription(long j, String str, long j2);

    User showUserListSubscription(String str, String str2, long j);

    UserList updateUserList(long j, String str, String str2, boolean z, String str3);

    UserList updateUserList(long j, String str, boolean z, String str2);

    UserList updateUserList(String str, String str2, String str3, boolean z, String str4);
}
