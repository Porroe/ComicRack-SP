package twitter4j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import twitter4j.api.DirectMessagesResources;
import twitter4j.api.FavoritesResources;
import twitter4j.api.FriendsFollowersResources;
import twitter4j.api.HelpResources;
import twitter4j.api.ListsResources;
import twitter4j.api.PlacesGeoResources;
import twitter4j.api.SavedSearchesResources;
import twitter4j.api.SearchResource;
import twitter4j.api.SpamReportingResource;
import twitter4j.api.SuggestedUsersResources;
import twitter4j.api.TimelinesResources;
import twitter4j.api.TrendsResources;
import twitter4j.api.TweetsResources;
import twitter4j.api.UsersResources;
import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
class TwitterImpl extends TwitterBaseImpl implements Twitter {
    private static final ConcurrentHashMap implicitParamsMap = new ConcurrentHashMap();
    private static final ConcurrentHashMap implicitParamsStrMap = new ConcurrentHashMap();
    private static final long serialVersionUID = 9170943084096085770L;
    private final HttpParameter[] IMPLICIT_PARAMS;
    private final String IMPLICIT_PARAMS_STR;
    private final HttpParameter INCLUDE_MY_RETWEET;

    TwitterImpl(Configuration configuration, Authorization authorization) {
        String str;
        super(configuration, authorization);
        this.INCLUDE_MY_RETWEET = new HttpParameter("include_my_retweet", configuration.isIncludeMyRetweetEnabled());
        if (implicitParamsMap.containsKey(configuration)) {
            this.IMPLICIT_PARAMS = (HttpParameter[]) implicitParamsMap.get(configuration);
            this.IMPLICIT_PARAMS_STR = (String) implicitParamsStrMap.get(configuration);
            return;
        }
        String str2 = configuration.isIncludeEntitiesEnabled() ? "include_entities=true" : "";
        boolean z = configuration.getContributingTo() != -1;
        if (z) {
            str = ("".equals(str2) ? str2 : str2 + "?") + "contributingto=" + configuration.getContributingTo();
        } else {
            str = str2;
        }
        ArrayList arrayList = new ArrayList(3);
        if (configuration.isIncludeEntitiesEnabled()) {
            arrayList.add(new HttpParameter("include_entities", "true"));
        }
        if (z) {
            arrayList.add(new HttpParameter("contributingto", configuration.getContributingTo()));
        }
        if (configuration.isTrimUserEnabled()) {
            arrayList.add(new HttpParameter("trim_user", "1"));
        }
        HttpParameter[] httpParameterArr = (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()]);
        implicitParamsStrMap.putIfAbsent(configuration, str);
        implicitParamsMap.putIfAbsent(configuration, httpParameterArr);
        this.IMPLICIT_PARAMS = httpParameterArr;
        this.IMPLICIT_PARAMS_STR = str;
    }

    @Override // twitter4j.api.TimelinesResources
    public ResponseList getMentionsTimeline() {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/mentions_timeline.json"));
    }

    @Override // twitter4j.api.TimelinesResources
    public ResponseList getMentionsTimeline(Paging paging) {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/mentions_timeline.json", paging.asPostParameterArray()));
    }

    @Override // twitter4j.api.TimelinesResources
    public ResponseList getHomeTimeline() {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/home_timeline.json", new HttpParameter[]{this.INCLUDE_MY_RETWEET}));
    }

    @Override // twitter4j.api.TimelinesResources
    public ResponseList getHomeTimeline(Paging paging) {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/home_timeline.json", mergeParameters(paging.asPostParameterArray(), new HttpParameter[]{this.INCLUDE_MY_RETWEET})));
    }

    @Override // twitter4j.api.TimelinesResources
    public ResponseList getRetweetsOfMe() {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/retweets_of_me.json"));
    }

    @Override // twitter4j.api.TimelinesResources
    public ResponseList getRetweetsOfMe(Paging paging) {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/retweets_of_me.json", paging.asPostParameterArray()));
    }

    @Override // twitter4j.api.TimelinesResources
    public ResponseList getUserTimeline(String str, Paging paging) {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/user_timeline.json", mergeParameters(new HttpParameter[]{new HttpParameter("screen_name", str), this.INCLUDE_MY_RETWEET}, paging.asPostParameterArray())));
    }

    @Override // twitter4j.api.TimelinesResources
    public ResponseList getUserTimeline(long j, Paging paging) {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/user_timeline.json", mergeParameters(new HttpParameter[]{new HttpParameter("user_id", j), this.INCLUDE_MY_RETWEET}, paging.asPostParameterArray())));
    }

    @Override // twitter4j.api.TimelinesResources
    public ResponseList getUserTimeline(String str) {
        return getUserTimeline(str, new Paging());
    }

    @Override // twitter4j.api.TimelinesResources
    public ResponseList getUserTimeline(long j) {
        return getUserTimeline(j, new Paging());
    }

    @Override // twitter4j.api.TimelinesResources
    public ResponseList getUserTimeline() {
        return getUserTimeline(new Paging());
    }

    @Override // twitter4j.api.TimelinesResources
    public ResponseList getUserTimeline(Paging paging) {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/user_timeline.json", mergeParameters(new HttpParameter[]{this.INCLUDE_MY_RETWEET}, paging.asPostParameterArray())));
    }

    @Override // twitter4j.api.TweetsResources
    public ResponseList getRetweets(long j) {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/retweets/" + j + ".json?count=100"));
    }

    @Override // twitter4j.api.TweetsResources
    public IDs getRetweeterIds(long j, long j2) {
        return getRetweeterIds(j, 100, j2);
    }

    @Override // twitter4j.api.TweetsResources
    public IDs getRetweeterIds(long j, int i, long j2) {
        return this.factory.createIDs(get(this.conf.getRestBaseURL() + "statuses/retweeters/ids.json?id=" + j + "&cursor=" + j2 + "&count=" + i));
    }

    @Override // twitter4j.api.TweetsResources
    public Status showStatus(long j) {
        return this.factory.createStatus(get(this.conf.getRestBaseURL() + "statuses/show/" + j + ".json", new HttpParameter[]{this.INCLUDE_MY_RETWEET}));
    }

    @Override // twitter4j.api.TweetsResources
    public Status destroyStatus(long j) {
        return this.factory.createStatus(post(this.conf.getRestBaseURL() + "statuses/destroy/" + j + ".json"));
    }

    @Override // twitter4j.api.TweetsResources
    public Status updateStatus(String str) {
        return this.factory.createStatus(post(this.conf.getRestBaseURL() + "statuses/update.json", new HttpParameter[]{new HttpParameter("status", str)}));
    }

    @Override // twitter4j.api.TweetsResources
    public Status updateStatus(StatusUpdate statusUpdate) {
        return this.factory.createStatus(post(this.conf.getRestBaseURL() + (statusUpdate.isForUpdateWithMedia() ? "statuses/update_with_media.json" : "statuses/update.json"), statusUpdate.asHttpParameterArray()));
    }

    @Override // twitter4j.api.TweetsResources
    public Status retweetStatus(long j) {
        return this.factory.createStatus(post(this.conf.getRestBaseURL() + "statuses/retweet/" + j + ".json"));
    }

    @Override // twitter4j.api.TweetsResources
    public OEmbed getOEmbed(OEmbedRequest oEmbedRequest) {
        return this.factory.createOEmbed(get(this.conf.getRestBaseURL() + "statuses/oembed.json", oEmbedRequest.asHttpParameterArray()));
    }

    @Override // twitter4j.api.TweetsResources
    public ResponseList lookup(long[] jArr) {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "statuses/lookup.json?id=" + StringUtil.join(jArr)));
    }

    @Override // twitter4j.api.TweetsResources
    public UploadedMedia uploadMedia(File file) throws TwitterException {
        checkFileValidity(file);
        return new UploadedMedia(post(this.conf.getUploadBaseURL() + "media/upload.json", new HttpParameter[]{new HttpParameter("media", file)}).asJSONObject());
    }

    @Override // twitter4j.api.SearchResource
    public QueryResult search(Query query) {
        if (query.nextPage() != null) {
            return this.factory.createQueryResult(get(this.conf.getRestBaseURL() + "search/tweets.json" + query.nextPage()), query);
        }
        return this.factory.createQueryResult(get(this.conf.getRestBaseURL() + "search/tweets.json", query.asHttpParameterArray()), query);
    }

    @Override // twitter4j.api.DirectMessagesResources
    public ResponseList getDirectMessages() {
        return this.factory.createDirectMessageList(get(this.conf.getRestBaseURL() + "direct_messages.json"));
    }

    @Override // twitter4j.api.DirectMessagesResources
    public ResponseList getDirectMessages(Paging paging) {
        return this.factory.createDirectMessageList(get(this.conf.getRestBaseURL() + "direct_messages.json", paging.asPostParameterArray()));
    }

    @Override // twitter4j.api.DirectMessagesResources
    public ResponseList getSentDirectMessages() {
        return this.factory.createDirectMessageList(get(this.conf.getRestBaseURL() + "direct_messages/sent.json"));
    }

    @Override // twitter4j.api.DirectMessagesResources
    public ResponseList getSentDirectMessages(Paging paging) {
        return this.factory.createDirectMessageList(get(this.conf.getRestBaseURL() + "direct_messages/sent.json", paging.asPostParameterArray()));
    }

    @Override // twitter4j.api.DirectMessagesResources
    public DirectMessage showDirectMessage(long j) {
        return this.factory.createDirectMessage(get(this.conf.getRestBaseURL() + "direct_messages/show.json?id=" + j));
    }

    @Override // twitter4j.api.DirectMessagesResources
    public DirectMessage destroyDirectMessage(long j) {
        return this.factory.createDirectMessage(post(this.conf.getRestBaseURL() + "direct_messages/destroy.json?id=" + j));
    }

    @Override // twitter4j.api.DirectMessagesResources
    public DirectMessage sendDirectMessage(long j, String str) {
        return this.factory.createDirectMessage(post(this.conf.getRestBaseURL() + "direct_messages/new.json", new HttpParameter[]{new HttpParameter("user_id", j), new HttpParameter("text", str)}));
    }

    @Override // twitter4j.api.DirectMessagesResources
    public DirectMessage sendDirectMessage(String str, String str2) {
        return this.factory.createDirectMessage(post(this.conf.getRestBaseURL() + "direct_messages/new.json", new HttpParameter[]{new HttpParameter("screen_name", str), new HttpParameter("text", str2)}));
    }

    @Override // twitter4j.api.DirectMessagesResources
    public InputStream getDMImageAsStream(String str) {
        return get(str).asStream();
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public IDs getNoRetweetsFriendships() {
        return this.factory.createIDs(get(this.conf.getRestBaseURL() + "friendships/no_retweets/ids.json"));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public IDs getFriendsIDs(long j) {
        return this.factory.createIDs(get(this.conf.getRestBaseURL() + "friends/ids.json?cursor=" + j));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public IDs getFriendsIDs(long j, long j2) {
        return this.factory.createIDs(get(this.conf.getRestBaseURL() + "friends/ids.json?user_id=" + j + "&cursor=" + j2));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public IDs getFriendsIDs(long j, long j2, int i) {
        return this.factory.createIDs(get(this.conf.getRestBaseURL() + "friends/ids.json?user_id=" + j + "&cursor=" + j2 + "&count=" + i));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public IDs getFriendsIDs(String str, long j) {
        return this.factory.createIDs(get(this.conf.getRestBaseURL() + "friends/ids.json?screen_name=" + str + "&cursor=" + j));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public IDs getFriendsIDs(String str, long j, int i) {
        return this.factory.createIDs(get(this.conf.getRestBaseURL() + "friends/ids.json?screen_name=" + str + "&cursor=" + j + "&count=" + i));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public IDs getFollowersIDs(long j) {
        return this.factory.createIDs(get(this.conf.getRestBaseURL() + "followers/ids.json?cursor=" + j));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public IDs getFollowersIDs(long j, long j2) {
        return this.factory.createIDs(get(this.conf.getRestBaseURL() + "followers/ids.json?user_id=" + j + "&cursor=" + j2));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public IDs getFollowersIDs(long j, long j2, int i) {
        return this.factory.createIDs(get(this.conf.getRestBaseURL() + "followers/ids.json?user_id=" + j + "&cursor=" + j2 + "&count=" + i));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public IDs getFollowersIDs(String str, long j) {
        return this.factory.createIDs(get(this.conf.getRestBaseURL() + "followers/ids.json?screen_name=" + str + "&cursor=" + j));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public IDs getFollowersIDs(String str, long j, int i) {
        return this.factory.createIDs(get(this.conf.getRestBaseURL() + "followers/ids.json?screen_name=" + str + "&cursor=" + j + "&count=" + i));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public ResponseList lookupFriendships(long[] jArr) {
        return this.factory.createFriendshipList(get(this.conf.getRestBaseURL() + "friendships/lookup.json?user_id=" + StringUtil.join(jArr)));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public ResponseList lookupFriendships(String[] strArr) {
        return this.factory.createFriendshipList(get(this.conf.getRestBaseURL() + "friendships/lookup.json?screen_name=" + StringUtil.join(strArr)));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public IDs getIncomingFriendships(long j) {
        return this.factory.createIDs(get(this.conf.getRestBaseURL() + "friendships/incoming.json?cursor=" + j));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public IDs getOutgoingFriendships(long j) {
        return this.factory.createIDs(get(this.conf.getRestBaseURL() + "friendships/outgoing.json?cursor=" + j));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public User createFriendship(long j) {
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "friendships/create.json?user_id=" + j));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public User createFriendship(String str) {
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "friendships/create.json?screen_name=" + str));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public User createFriendship(long j, boolean z) {
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "friendships/create.json?user_id=" + j + "&follow=" + z));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public User createFriendship(String str, boolean z) {
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "friendships/create.json?screen_name=" + str + "&follow=" + z));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public User destroyFriendship(long j) {
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "friendships/destroy.json?user_id=" + j));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public User destroyFriendship(String str) {
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "friendships/destroy.json?screen_name=" + str));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public Relationship updateFriendship(long j, boolean z, boolean z2) {
        return this.factory.createRelationship(post(this.conf.getRestBaseURL() + "friendships/update.json", new HttpParameter[]{new HttpParameter("user_id", j), new HttpParameter("device", z), new HttpParameter("retweets", z2)}));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public Relationship updateFriendship(String str, boolean z, boolean z2) {
        return this.factory.createRelationship(post(this.conf.getRestBaseURL() + "friendships/update.json", new HttpParameter[]{new HttpParameter("screen_name", str), new HttpParameter("device", z), new HttpParameter("retweets", z2)}));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public Relationship showFriendship(long j, long j2) {
        return this.factory.createRelationship(get(this.conf.getRestBaseURL() + "friendships/show.json", new HttpParameter[]{new HttpParameter("source_id", j), new HttpParameter("target_id", j2)}));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public Relationship showFriendship(String str, String str2) {
        return this.factory.createRelationship(get(this.conf.getRestBaseURL() + "friendships/show.json", HttpParameter.getParameterArray("source_screen_name", str, "target_screen_name", str2)));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public PagableResponseList getFriendsList(long j, long j2) {
        return getFriendsList(j, j2, 20);
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public PagableResponseList getFriendsList(long j, long j2, int i) {
        return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "friends/list.json?user_id=" + j + "&cursor=" + j2 + "&count=" + i));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public PagableResponseList getFriendsList(String str, long j) {
        return getFriendsList(str, j, 20);
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public PagableResponseList getFriendsList(String str, long j, int i) {
        return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "friends/list.json?screen_name=" + str + "&cursor=" + j + "&count=" + i));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public PagableResponseList getFriendsList(long j, long j2, int i, boolean z, boolean z2) {
        return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "friends/list.json?user_id=" + j + "&cursor=" + j2 + "&count=" + i + "&skip_status=" + z + "&include_user_entities=" + z2));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public PagableResponseList getFriendsList(String str, long j, int i, boolean z, boolean z2) {
        return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "friends/list.json?screen_name=" + str + "&cursor=" + j + "&count=" + i + "&skip_status=" + z + "&include_user_entities=" + z2));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public PagableResponseList getFollowersList(long j, long j2) {
        return getFollowersList(j, j2, 20);
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public PagableResponseList getFollowersList(String str, long j) {
        return getFollowersList(str, j, 20);
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public PagableResponseList getFollowersList(long j, long j2, int i) {
        return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "followers/list.json?user_id=" + j + "&cursor=" + j2 + "&count=" + i));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public PagableResponseList getFollowersList(String str, long j, int i) {
        return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "followers/list.json?screen_name=" + str + "&cursor=" + j + "&count=" + i));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public PagableResponseList getFollowersList(long j, long j2, int i, boolean z, boolean z2) {
        return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "followers/list.json?user_id=" + j + "&cursor=" + j2 + "&count=" + i + "&skip_status=" + z + "&include_user_entities=" + z2));
    }

    @Override // twitter4j.api.FriendsFollowersResources
    public PagableResponseList getFollowersList(String str, long j, int i, boolean z, boolean z2) {
        return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "followers/list.json?screen_name=" + str + "&cursor=" + j + "&count=" + i + "&skip_status=" + z + "&include_user_entities=" + z2));
    }

    @Override // twitter4j.api.UsersResources
    public AccountSettings getAccountSettings() {
        return this.factory.createAccountSettings(get(this.conf.getRestBaseURL() + "account/settings.json"));
    }

    @Override // twitter4j.api.UsersResources
    public User verifyCredentials() {
        return super.fillInIDAndScreenName();
    }

    @Override // twitter4j.api.UsersResources
    public AccountSettings updateAccountSettings(Integer num, Boolean bool, String str, String str2, String str3, String str4) {
        ArrayList arrayList = new ArrayList(6);
        if (num != null) {
            arrayList.add(new HttpParameter("trend_location_woeid", num.intValue()));
        }
        if (bool != null) {
            arrayList.add(new HttpParameter("sleep_time_enabled", bool.toString()));
        }
        if (str != null) {
            arrayList.add(new HttpParameter("start_sleep_time", str));
        }
        if (str2 != null) {
            arrayList.add(new HttpParameter("end_sleep_time", str2));
        }
        if (str3 != null) {
            arrayList.add(new HttpParameter("time_zone", str3));
        }
        if (str4 != null) {
            arrayList.add(new HttpParameter("lang", str4));
        }
        return this.factory.createAccountSettings(post(this.conf.getRestBaseURL() + "account/settings.json", (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()])));
    }

    @Override // twitter4j.api.UsersResources
    public User updateProfile(String str, String str2, String str3, String str4) {
        ArrayList arrayList = new ArrayList(4);
        addParameterToList(arrayList, "name", str);
        addParameterToList(arrayList, "url", str2);
        addParameterToList(arrayList, "location", str3);
        addParameterToList(arrayList, "description", str4);
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "account/update_profile.json", (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()])));
    }

    @Override // twitter4j.api.UsersResources
    public User updateProfileBackgroundImage(File file, boolean z) throws TwitterException {
        checkFileValidity(file);
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "account/update_profile_background_image.json", new HttpParameter[]{new HttpParameter("image", file), new HttpParameter("tile", z)}));
    }

    @Override // twitter4j.api.UsersResources
    public User updateProfileBackgroundImage(InputStream inputStream, boolean z) {
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "account/update_profile_background_image.json", new HttpParameter[]{new HttpParameter("image", "image", inputStream), new HttpParameter("tile", z)}));
    }

    @Override // twitter4j.api.UsersResources
    public User updateProfileColors(String str, String str2, String str3, String str4, String str5) {
        ArrayList arrayList = new ArrayList(6);
        addParameterToList(arrayList, "profile_background_color", str);
        addParameterToList(arrayList, "profile_text_color", str2);
        addParameterToList(arrayList, "profile_link_color", str3);
        addParameterToList(arrayList, "profile_sidebar_fill_color", str4);
        addParameterToList(arrayList, "profile_sidebar_border_color", str5);
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "account/update_profile_colors.json", (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()])));
    }

    private void addParameterToList(List list, String str, String str2) {
        if (str2 != null) {
            list.add(new HttpParameter(str, str2));
        }
    }

    @Override // twitter4j.api.UsersResources
    public User updateProfileImage(File file) throws TwitterException {
        checkFileValidity(file);
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "account/update_profile_image.json", new HttpParameter[]{new HttpParameter("image", file)}));
    }

    @Override // twitter4j.api.UsersResources
    public User updateProfileImage(InputStream inputStream) {
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "account/update_profile_image.json", new HttpParameter[]{new HttpParameter("image", "image", inputStream)}));
    }

    private void checkFileValidity(File file) throws TwitterException {
        if (!file.exists()) {
            throw new TwitterException(new FileNotFoundException(file + " is not found."));
        }
        if (!file.isFile()) {
            throw new TwitterException(new IOException(file + " is not a file."));
        }
    }

    @Override // twitter4j.api.UsersResources
    public PagableResponseList getBlocksList() {
        return getBlocksList(-1L);
    }

    @Override // twitter4j.api.UsersResources
    public PagableResponseList getBlocksList(long j) {
        return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "blocks/list.json?cursor=" + j));
    }

    @Override // twitter4j.api.UsersResources
    public IDs getBlocksIDs() {
        return this.factory.createIDs(get(this.conf.getRestBaseURL() + "blocks/ids.json"));
    }

    @Override // twitter4j.api.UsersResources
    public IDs getBlocksIDs(long j) {
        return this.factory.createIDs(get(this.conf.getRestBaseURL() + "blocks/ids.json?cursor=" + j));
    }

    @Override // twitter4j.api.UsersResources
    public User createBlock(long j) {
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "blocks/create.json?user_id=" + j));
    }

    @Override // twitter4j.api.UsersResources
    public User createBlock(String str) {
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "blocks/create.json?screen_name=" + str));
    }

    @Override // twitter4j.api.UsersResources
    public User destroyBlock(long j) {
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "blocks/destroy.json?user_id=" + j));
    }

    @Override // twitter4j.api.UsersResources
    public User destroyBlock(String str) {
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "blocks/destroy.json?screen_name=" + str));
    }

    @Override // twitter4j.api.UsersResources
    public PagableResponseList getMutesList(long j) {
        return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "mutes/users/list.json?cursor=" + j));
    }

    @Override // twitter4j.api.UsersResources
    public IDs getMutesIDs(long j) {
        return this.factory.createIDs(get(this.conf.getRestBaseURL() + "mutes/users/ids.json?cursor=" + j));
    }

    @Override // twitter4j.api.UsersResources
    public User createMute(long j) {
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "mutes/users/create.json?user_id=" + j));
    }

    @Override // twitter4j.api.UsersResources
    public User createMute(String str) {
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "mutes/users/create.json?screen_name=" + str));
    }

    @Override // twitter4j.api.UsersResources
    public User destroyMute(long j) {
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "mutes/users/destroy.json?user_id=" + j));
    }

    @Override // twitter4j.api.UsersResources
    public User destroyMute(String str) {
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "mutes/users/destroy.json?screen_name=" + str));
    }

    @Override // twitter4j.api.UsersResources
    public ResponseList lookupUsers(long[] jArr) {
        return this.factory.createUserList(get(this.conf.getRestBaseURL() + "users/lookup.json", new HttpParameter[]{new HttpParameter("user_id", StringUtil.join(jArr))}));
    }

    @Override // twitter4j.api.UsersResources
    public ResponseList lookupUsers(String[] strArr) {
        return this.factory.createUserList(get(this.conf.getRestBaseURL() + "users/lookup.json", new HttpParameter[]{new HttpParameter("screen_name", StringUtil.join(strArr))}));
    }

    @Override // twitter4j.api.UsersResources
    public User showUser(long j) {
        return this.factory.createUser(get(this.conf.getRestBaseURL() + "users/show.json?user_id=" + j));
    }

    @Override // twitter4j.api.UsersResources
    public User showUser(String str) {
        return this.factory.createUser(get(this.conf.getRestBaseURL() + "users/show.json?screen_name=" + str));
    }

    @Override // twitter4j.api.UsersResources
    public ResponseList searchUsers(String str, int i) {
        return this.factory.createUserList(get(this.conf.getRestBaseURL() + "users/search.json", new HttpParameter[]{new HttpParameter("q", str), new HttpParameter("per_page", 20), new HttpParameter("page", i)}));
    }

    @Override // twitter4j.api.UsersResources
    public ResponseList getContributees(long j) {
        return this.factory.createUserList(get(this.conf.getRestBaseURL() + "users/contributees.json?user_id=" + j));
    }

    @Override // twitter4j.api.UsersResources
    public ResponseList getContributees(String str) {
        return this.factory.createUserList(get(this.conf.getRestBaseURL() + "users/contributees.json?screen_name=" + str));
    }

    @Override // twitter4j.api.UsersResources
    public ResponseList getContributors(long j) {
        return this.factory.createUserList(get(this.conf.getRestBaseURL() + "users/contributors.json?user_id=" + j));
    }

    @Override // twitter4j.api.UsersResources
    public ResponseList getContributors(String str) {
        return this.factory.createUserList(get(this.conf.getRestBaseURL() + "users/contributors.json?screen_name=" + str));
    }

    @Override // twitter4j.api.UsersResources
    public void removeProfileBanner() {
        post(this.conf.getRestBaseURL() + "account/remove_profile_banner.json");
    }

    @Override // twitter4j.api.UsersResources
    public void updateProfileBanner(File file) throws TwitterException {
        checkFileValidity(file);
        post(this.conf.getRestBaseURL() + "account/update_profile_banner.json", new HttpParameter[]{new HttpParameter("banner", file)});
    }

    @Override // twitter4j.api.UsersResources
    public void updateProfileBanner(InputStream inputStream) {
        post(this.conf.getRestBaseURL() + "account/update_profile_banner.json", new HttpParameter[]{new HttpParameter("banner", "banner", inputStream)});
    }

    @Override // twitter4j.api.SuggestedUsersResources
    public ResponseList getUserSuggestions(String str) {
        try {
            return this.factory.createUserListFromJSONArray_Users(get(this.conf.getRestBaseURL() + "users/suggestions/" + URLEncoder.encode(str, "UTF-8") + ".json"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // twitter4j.api.SuggestedUsersResources
    public ResponseList getSuggestedUserCategories() {
        return this.factory.createCategoryList(get(this.conf.getRestBaseURL() + "users/suggestions.json"));
    }

    @Override // twitter4j.api.SuggestedUsersResources
    public ResponseList getMemberSuggestions(String str) {
        try {
            return this.factory.createUserListFromJSONArray(get(this.conf.getRestBaseURL() + "users/suggestions/" + URLEncoder.encode(str, "UTF-8") + "/members.json"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // twitter4j.api.FavoritesResources
    public ResponseList getFavorites() {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "favorites/list.json"));
    }

    @Override // twitter4j.api.FavoritesResources
    public ResponseList getFavorites(long j) {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "favorites/list.json?user_id=" + j));
    }

    @Override // twitter4j.api.FavoritesResources
    public ResponseList getFavorites(String str) {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "favorites/list.json?screen_name=" + str));
    }

    @Override // twitter4j.api.FavoritesResources
    public ResponseList getFavorites(Paging paging) {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "favorites/list.json", paging.asPostParameterArray()));
    }

    @Override // twitter4j.api.FavoritesResources
    public ResponseList getFavorites(long j, Paging paging) {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "favorites/list.json", mergeParameters(new HttpParameter[]{new HttpParameter("user_id", j)}, paging.asPostParameterArray())));
    }

    @Override // twitter4j.api.FavoritesResources
    public ResponseList getFavorites(String str, Paging paging) {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "favorites/list.json", mergeParameters(new HttpParameter[]{new HttpParameter("screen_name", str)}, paging.asPostParameterArray())));
    }

    @Override // twitter4j.api.FavoritesResources
    public Status destroyFavorite(long j) {
        return this.factory.createStatus(post(this.conf.getRestBaseURL() + "favorites/destroy.json?id=" + j));
    }

    @Override // twitter4j.api.FavoritesResources
    public Status createFavorite(long j) {
        return this.factory.createStatus(post(this.conf.getRestBaseURL() + "favorites/create.json?id=" + j));
    }

    @Override // twitter4j.api.ListsResources
    public ResponseList getUserLists(String str) {
        return this.factory.createUserListList(get(this.conf.getRestBaseURL() + "lists/list.json?screen_name=" + str));
    }

    @Override // twitter4j.api.ListsResources
    public ResponseList getUserLists(long j) {
        return this.factory.createUserListList(get(this.conf.getRestBaseURL() + "lists/list.json?user_id=" + j));
    }

    @Override // twitter4j.api.ListsResources
    public ResponseList getUserListStatuses(long j, Paging paging) {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "lists/statuses.json", mergeParameters(paging.asPostParameterArray(Paging.SMCP, "count"), new HttpParameter("list_id", j))));
    }

    @Override // twitter4j.api.ListsResources
    public ResponseList getUserListStatuses(long j, String str, Paging paging) {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "lists/statuses.json", mergeParameters(paging.asPostParameterArray(Paging.SMCP, "count"), new HttpParameter[]{new HttpParameter("owner_id", j), new HttpParameter("slug", str)})));
    }

    @Override // twitter4j.api.ListsResources
    public ResponseList getUserListStatuses(String str, String str2, Paging paging) {
        return this.factory.createStatusList(get(this.conf.getRestBaseURL() + "lists/statuses.json", mergeParameters(paging.asPostParameterArray(Paging.SMCP, "count"), new HttpParameter[]{new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2)})));
    }

    @Override // twitter4j.api.ListsResources
    public UserList destroyUserListMember(long j, long j2) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/destroy.json", new HttpParameter[]{new HttpParameter("list_id", j), new HttpParameter("user_id", j2)}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList destroyUserListMember(long j, String str, long j2) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/destroy.json", new HttpParameter[]{new HttpParameter("owner_id", j), new HttpParameter("slug", str), new HttpParameter("user_id", j2)}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList destroyUserListMember(long j, String str) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/destroy.json", new HttpParameter[]{new HttpParameter("list_id", j), new HttpParameter("screen_name", str)}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList destroyUserListMember(String str, String str2, long j) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/destroy.json", new HttpParameter[]{new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2), new HttpParameter("user_id", j)}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList destroyUserListMembers(long j, String[] strArr) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/destroy_all.json", new HttpParameter[]{new HttpParameter("list_id", j), new HttpParameter("screen_name", StringUtil.join(strArr))}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList destroyUserListMembers(long j, long[] jArr) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/destroy_all.json", new HttpParameter[]{new HttpParameter("list_id", j), new HttpParameter("user_id", StringUtil.join(jArr))}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList destroyUserListMembers(String str, String str2, String[] strArr) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/destroy_all.json", new HttpParameter[]{new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2), new HttpParameter("screen_name", StringUtil.join(strArr))}));
    }

    @Override // twitter4j.api.ListsResources
    public PagableResponseList getUserListMemberships(long j) {
        return this.factory.createPagableUserListList(get(this.conf.getRestBaseURL() + "lists/memberships.json?cursor=" + j));
    }

    @Override // twitter4j.api.ListsResources
    public PagableResponseList getUserListMemberships(String str, long j) {
        return getUserListMemberships(str, j, false);
    }

    @Override // twitter4j.api.ListsResources
    public PagableResponseList getUserListMemberships(long j, long j2) {
        return getUserListMemberships(j, j2, false);
    }

    @Override // twitter4j.api.ListsResources
    public PagableResponseList getUserListMemberships(long j, long j2, boolean z) {
        return this.factory.createPagableUserListList(get(this.conf.getRestBaseURL() + "lists/memberships.json?user_id=" + j + "&cursor=" + j2 + "&filter_to_owned_lists=" + z));
    }

    @Override // twitter4j.api.ListsResources
    public PagableResponseList getUserListMemberships(String str, long j, boolean z) {
        return this.factory.createPagableUserListList(get(this.conf.getRestBaseURL() + "lists/memberships.json?screen_name=" + str + "&cursor=" + j + "&filter_to_owned_lists=" + z));
    }

    @Override // twitter4j.api.ListsResources
    public PagableResponseList getUserListSubscribers(long j, long j2) {
        return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "lists/subscribers.json?list_id=" + j + "&cursor=" + j2));
    }

    @Override // twitter4j.api.ListsResources
    public PagableResponseList getUserListSubscribers(long j, String str, long j2) {
        return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "lists/subscribers.json?owner_id=" + j + "&slug=" + str + "&cursor=" + j2));
    }

    @Override // twitter4j.api.ListsResources
    public PagableResponseList getUserListSubscribers(String str, String str2, long j) {
        return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "lists/subscribers.json?owner_screen_name=" + str + "&slug=" + str2 + "&cursor=" + j));
    }

    @Override // twitter4j.api.ListsResources
    public UserList createUserListSubscription(long j) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/subscribers/create.json", new HttpParameter[]{new HttpParameter("list_id", j)}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList createUserListSubscription(long j, String str) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/subscribers/create.json", new HttpParameter[]{new HttpParameter("owner_id", j), new HttpParameter("slug", str)}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList createUserListSubscription(String str, String str2) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/subscribers/create.json", new HttpParameter[]{new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2)}));
    }

    @Override // twitter4j.api.ListsResources
    public User showUserListSubscription(long j, long j2) {
        return this.factory.createUser(get(this.conf.getRestBaseURL() + "lists/subscribers/show.json?list_id=" + j + "&user_id=" + j2));
    }

    @Override // twitter4j.api.ListsResources
    public User showUserListSubscription(long j, String str, long j2) {
        return this.factory.createUser(get(this.conf.getRestBaseURL() + "lists/subscribers/show.json?owner_id=" + j + "&slug=" + str + "&user_id=" + j2));
    }

    @Override // twitter4j.api.ListsResources
    public User showUserListSubscription(String str, String str2, long j) {
        return this.factory.createUser(get(this.conf.getRestBaseURL() + "lists/subscribers/show.json?owner_screen_name=" + str + "&slug=" + str2 + "&user_id=" + j));
    }

    @Override // twitter4j.api.ListsResources
    public UserList destroyUserListSubscription(long j) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/subscribers/destroy.json", new HttpParameter[]{new HttpParameter("list_id", j)}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList destroyUserListSubscription(long j, String str) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/subscribers/destroy.json", new HttpParameter[]{new HttpParameter("owner_id", j), new HttpParameter("slug", str)}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList destroyUserListSubscription(String str, String str2) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/subscribers/destroy.json", new HttpParameter[]{new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2)}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList createUserListMembers(long j, long[] jArr) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/create_all.json", new HttpParameter[]{new HttpParameter("list_id", j), new HttpParameter("user_id", StringUtil.join(jArr))}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList createUserListMembers(long j, String str, long[] jArr) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/create_all.json", new HttpParameter[]{new HttpParameter("owner_id", j), new HttpParameter("slug", str), new HttpParameter("user_id", StringUtil.join(jArr))}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList createUserListMembers(String str, String str2, long[] jArr) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/create_all.json", new HttpParameter[]{new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2), new HttpParameter("user_id", StringUtil.join(jArr))}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList createUserListMembers(long j, String[] strArr) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/create_all.json", new HttpParameter[]{new HttpParameter("list_id", j), new HttpParameter("screen_name", StringUtil.join(strArr))}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList createUserListMembers(long j, String str, String[] strArr) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/create_all.json", new HttpParameter[]{new HttpParameter("owner_id", j), new HttpParameter("slug", str), new HttpParameter("screen_name", StringUtil.join(strArr))}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList createUserListMembers(String str, String str2, String[] strArr) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/create_all.json", new HttpParameter[]{new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2), new HttpParameter("screen_name", StringUtil.join(strArr))}));
    }

    @Override // twitter4j.api.ListsResources
    public User showUserListMembership(long j, long j2) {
        return this.factory.createUser(get(this.conf.getRestBaseURL() + "lists/members/show.json?list_id=" + j + "&user_id=" + j2));
    }

    @Override // twitter4j.api.ListsResources
    public User showUserListMembership(long j, String str, long j2) {
        return this.factory.createUser(get(this.conf.getRestBaseURL() + "lists/members/show.json?owner_id=" + j + "&slug=" + str + "&user_id=" + j2));
    }

    @Override // twitter4j.api.ListsResources
    public User showUserListMembership(String str, String str2, long j) {
        return this.factory.createUser(get(this.conf.getRestBaseURL() + "lists/members/show.json?owner_screen_name=" + str + "&slug=" + str2 + "&user_id=" + j));
    }

    @Override // twitter4j.api.ListsResources
    public PagableResponseList getUserListMembers(long j, long j2) {
        return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "lists/members.json?list_id=" + j + "&cursor=" + j2));
    }

    @Override // twitter4j.api.ListsResources
    public PagableResponseList getUserListMembers(long j, String str, long j2) {
        return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "lists/members.json?owner_id=" + j + "&slug=" + str + "&cursor=" + j2));
    }

    @Override // twitter4j.api.ListsResources
    public PagableResponseList getUserListMembers(String str, String str2, long j) {
        return this.factory.createPagableUserList(get(this.conf.getRestBaseURL() + "lists/members.json?owner_screen_name=" + str + "&slug=" + str2 + "&cursor=" + j));
    }

    @Override // twitter4j.api.ListsResources
    public UserList createUserListMember(long j, long j2) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/create.json", new HttpParameter[]{new HttpParameter("user_id", j2), new HttpParameter("list_id", j)}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList createUserListMember(long j, String str, long j2) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/create.json", new HttpParameter[]{new HttpParameter("user_id", j2), new HttpParameter("owner_id", j), new HttpParameter("slug", str)}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList createUserListMember(String str, String str2, long j) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/members/create.json", new HttpParameter[]{new HttpParameter("user_id", j), new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2)}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList destroyUserList(long j) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/destroy.json", new HttpParameter[]{new HttpParameter("list_id", j)}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList destroyUserList(long j, String str) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/destroy.json", new HttpParameter[]{new HttpParameter("owner_id", j), new HttpParameter("slug", str)}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList destroyUserList(String str, String str2) {
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/destroy.json", new HttpParameter[]{new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2)}));
    }

    @Override // twitter4j.api.ListsResources
    public UserList updateUserList(long j, String str, boolean z, String str2) {
        return updateUserList(str, z, str2, new HttpParameter("list_id", j));
    }

    @Override // twitter4j.api.ListsResources
    public UserList updateUserList(long j, String str, String str2, boolean z, String str3) {
        return updateUserList(str2, z, str3, new HttpParameter("owner_id", j), new HttpParameter("slug", str));
    }

    @Override // twitter4j.api.ListsResources
    public UserList updateUserList(String str, String str2, String str3, boolean z, String str4) {
        return updateUserList(str3, z, str4, new HttpParameter("owner_screen_name", str), new HttpParameter("slug", str2));
    }

    private UserList updateUserList(String str, boolean z, String str2, HttpParameter... httpParameterArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, httpParameterArr);
        if (str != null) {
            arrayList.add(new HttpParameter("name", str));
        }
        arrayList.add(new HttpParameter("mode", z ? "public" : "private"));
        if (str2 != null) {
            arrayList.add(new HttpParameter("description", str2));
        }
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/update.json", (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()])));
    }

    @Override // twitter4j.api.ListsResources
    public UserList createUserList(String str, boolean z, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HttpParameter("name", str));
        arrayList.add(new HttpParameter("mode", z ? "public" : "private"));
        if (str2 != null) {
            arrayList.add(new HttpParameter("description", str2));
        }
        return this.factory.createAUserList(post(this.conf.getRestBaseURL() + "lists/create.json", (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()])));
    }

    @Override // twitter4j.api.ListsResources
    public UserList showUserList(long j) {
        return this.factory.createAUserList(get(this.conf.getRestBaseURL() + "lists/show.json?list_id=" + j));
    }

    @Override // twitter4j.api.ListsResources
    public UserList showUserList(long j, String str) {
        return this.factory.createAUserList(get(this.conf.getRestBaseURL() + "lists/show.json?owner_id=" + j + "&slug=" + str));
    }

    @Override // twitter4j.api.ListsResources
    public UserList showUserList(String str, String str2) {
        return this.factory.createAUserList(get(this.conf.getRestBaseURL() + "lists/show.json?owner_screen_name=" + str + "&slug=" + str2));
    }

    @Override // twitter4j.api.ListsResources
    public PagableResponseList getUserListSubscriptions(String str, long j) {
        return this.factory.createPagableUserListList(get(this.conf.getRestBaseURL() + "lists/subscriptions.json?screen_name=" + str + "&cursor=" + j));
    }

    @Override // twitter4j.api.ListsResources
    public PagableResponseList getUserListsOwnerships(String str, int i, long j) {
        return this.factory.createPagableUserListList(get(this.conf.getRestBaseURL() + "lists/ownerships.json", new HttpParameter[]{new HttpParameter("screen_name", str), new HttpParameter("count", i), new HttpParameter("cursor", j)}));
    }

    @Override // twitter4j.api.ListsResources
    public PagableResponseList getUserListsOwnerships(long j, int i, long j2) {
        return this.factory.createPagableUserListList(get(this.conf.getRestBaseURL() + "lists/ownerships.json", new HttpParameter[]{new HttpParameter("user_id", j), new HttpParameter("count", i), new HttpParameter("cursor", j2)}));
    }

    @Override // twitter4j.api.SavedSearchesResources
    public ResponseList getSavedSearches() {
        return this.factory.createSavedSearchList(get(this.conf.getRestBaseURL() + "saved_searches/list.json"));
    }

    @Override // twitter4j.api.SavedSearchesResources
    public SavedSearch showSavedSearch(int i) {
        return this.factory.createSavedSearch(get(this.conf.getRestBaseURL() + "saved_searches/show/" + i + ".json"));
    }

    @Override // twitter4j.api.SavedSearchesResources
    public SavedSearch createSavedSearch(String str) {
        return this.factory.createSavedSearch(post(this.conf.getRestBaseURL() + "saved_searches/create.json", new HttpParameter[]{new HttpParameter("query", str)}));
    }

    @Override // twitter4j.api.SavedSearchesResources
    public SavedSearch destroySavedSearch(int i) {
        return this.factory.createSavedSearch(post(this.conf.getRestBaseURL() + "saved_searches/destroy/" + i + ".json"));
    }

    @Override // twitter4j.api.PlacesGeoResources
    public Place getGeoDetails(String str) {
        return this.factory.createPlace(get(this.conf.getRestBaseURL() + "geo/id/" + str + ".json"));
    }

    @Override // twitter4j.api.PlacesGeoResources
    public ResponseList reverseGeoCode(GeoQuery geoQuery) throws TwitterException {
        try {
            return this.factory.createPlaceList(get(this.conf.getRestBaseURL() + "geo/reverse_geocode.json", geoQuery.asHttpParameterArray()));
        } catch (TwitterException e) {
            if (e.getStatusCode() == 404) {
                return this.factory.createEmptyResponseList();
            }
            throw e;
        }
    }

    @Override // twitter4j.api.PlacesGeoResources
    public ResponseList searchPlaces(GeoQuery geoQuery) {
        return this.factory.createPlaceList(get(this.conf.getRestBaseURL() + "geo/search.json", geoQuery.asHttpParameterArray()));
    }

    @Override // twitter4j.api.PlacesGeoResources
    public ResponseList getSimilarPlaces(GeoLocation geoLocation, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new HttpParameter("lat", geoLocation.getLatitude()));
        arrayList.add(new HttpParameter("long", geoLocation.getLongitude()));
        arrayList.add(new HttpParameter("name", str));
        if (str2 != null) {
            arrayList.add(new HttpParameter("contained_within", str2));
        }
        if (str3 != null) {
            arrayList.add(new HttpParameter("attribute:street_address", str3));
        }
        return this.factory.createPlaceList(get(this.conf.getRestBaseURL() + "geo/similar_places.json", (HttpParameter[]) arrayList.toArray(new HttpParameter[arrayList.size()])));
    }

    @Override // twitter4j.api.TrendsResources
    public Trends getPlaceTrends(int i) {
        return this.factory.createTrends(get(this.conf.getRestBaseURL() + "trends/place.json?id=" + i));
    }

    @Override // twitter4j.api.TrendsResources
    public ResponseList getAvailableTrends() {
        return this.factory.createLocationList(get(this.conf.getRestBaseURL() + "trends/available.json"));
    }

    @Override // twitter4j.api.TrendsResources
    public ResponseList getClosestTrends(GeoLocation geoLocation) {
        return this.factory.createLocationList(get(this.conf.getRestBaseURL() + "trends/closest.json", new HttpParameter[]{new HttpParameter("lat", geoLocation.getLatitude()), new HttpParameter("long", geoLocation.getLongitude())}));
    }

    @Override // twitter4j.api.SpamReportingResource
    public User reportSpam(long j) {
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "users/report_spam.json?user_id=" + j));
    }

    @Override // twitter4j.api.SpamReportingResource
    public User reportSpam(String str) {
        return this.factory.createUser(post(this.conf.getRestBaseURL() + "users/report_spam.json?screen_name=" + str));
    }

    @Override // twitter4j.api.HelpResources
    public TwitterAPIConfiguration getAPIConfiguration() {
        return this.factory.createTwitterAPIConfiguration(get(this.conf.getRestBaseURL() + "help/configuration.json"));
    }

    @Override // twitter4j.api.HelpResources
    public ResponseList getLanguages() {
        return this.factory.createLanguageList(get(this.conf.getRestBaseURL() + "help/languages.json"));
    }

    @Override // twitter4j.api.HelpResources
    public String getPrivacyPolicy() throws TwitterException {
        try {
            return get(this.conf.getRestBaseURL() + "help/privacy.json").asJSONObject().getString("privacy");
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    @Override // twitter4j.api.HelpResources
    public String getTermsOfService() throws TwitterException {
        try {
            return get(this.conf.getRestBaseURL() + "help/tos.json").asJSONObject().getString("tos");
        } catch (JSONException e) {
            throw new TwitterException(e);
        }
    }

    @Override // twitter4j.api.HelpResources
    public Map getRateLimitStatus() {
        return this.factory.createRateLimitStatuses(get(this.conf.getRestBaseURL() + "application/rate_limit_status.json"));
    }

    @Override // twitter4j.api.HelpResources
    public Map getRateLimitStatus(String... strArr) {
        return this.factory.createRateLimitStatuses(get(this.conf.getRestBaseURL() + "application/rate_limit_status.json?resources=" + StringUtil.join(strArr)));
    }

    @Override // twitter4j.Twitter
    public TimelinesResources timelines() {
        return this;
    }

    @Override // twitter4j.Twitter
    public TweetsResources tweets() {
        return this;
    }

    @Override // twitter4j.Twitter
    public SearchResource search() {
        return this;
    }

    @Override // twitter4j.Twitter
    public DirectMessagesResources directMessages() {
        return this;
    }

    @Override // twitter4j.Twitter
    public FriendsFollowersResources friendsFollowers() {
        return this;
    }

    @Override // twitter4j.Twitter
    public UsersResources users() {
        return this;
    }

    @Override // twitter4j.Twitter
    public SuggestedUsersResources suggestedUsers() {
        return this;
    }

    @Override // twitter4j.Twitter
    public FavoritesResources favorites() {
        return this;
    }

    @Override // twitter4j.Twitter
    public ListsResources list() {
        return this;
    }

    @Override // twitter4j.Twitter
    public SavedSearchesResources savedSearches() {
        return this;
    }

    @Override // twitter4j.Twitter
    public PlacesGeoResources placesGeo() {
        return this;
    }

    @Override // twitter4j.Twitter
    public TrendsResources trends() {
        return this;
    }

    @Override // twitter4j.Twitter
    public SpamReportingResource spamReporting() {
        return this;
    }

    @Override // twitter4j.Twitter
    public HelpResources help() {
        return this;
    }

    private HttpResponse get(String str) {
        ensureAuthorizationEnabled();
        if (this.IMPLICIT_PARAMS_STR.length() > 0) {
            if (str.contains("?")) {
                str = str + "&" + this.IMPLICIT_PARAMS_STR;
            } else {
                str = str + "?" + this.IMPLICIT_PARAMS_STR;
            }
        }
        if (!this.conf.isMBeanEnabled()) {
            return this.http.get(str, null, this.auth, this);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            HttpResponse httpResponse = this.http.get(str, null, this.auth, this);
            TwitterAPIMonitor.getInstance().methodCalled(str, System.currentTimeMillis() - jCurrentTimeMillis, isOk(httpResponse));
            return httpResponse;
        } catch (Throwable th) {
            TwitterAPIMonitor.getInstance().methodCalled(str, System.currentTimeMillis() - jCurrentTimeMillis, isOk(null));
            throw th;
        }
    }

    private HttpResponse get(String str, HttpParameter[] httpParameterArr) {
        ensureAuthorizationEnabled();
        if (!this.conf.isMBeanEnabled()) {
            return this.http.get(str, mergeImplicitParams(httpParameterArr), this.auth, this);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            HttpResponse httpResponse = this.http.get(str, mergeImplicitParams(httpParameterArr), this.auth, this);
            TwitterAPIMonitor.getInstance().methodCalled(str, System.currentTimeMillis() - jCurrentTimeMillis, isOk(httpResponse));
            return httpResponse;
        } catch (Throwable th) {
            TwitterAPIMonitor.getInstance().methodCalled(str, System.currentTimeMillis() - jCurrentTimeMillis, isOk(null));
            throw th;
        }
    }

    private HttpResponse post(String str) {
        ensureAuthorizationEnabled();
        if (!this.conf.isMBeanEnabled()) {
            return this.http.post(str, this.IMPLICIT_PARAMS, this.auth, this);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            HttpResponse httpResponsePost = this.http.post(str, this.IMPLICIT_PARAMS, this.auth, this);
            TwitterAPIMonitor.getInstance().methodCalled(str, System.currentTimeMillis() - jCurrentTimeMillis, isOk(httpResponsePost));
            return httpResponsePost;
        } catch (Throwable th) {
            TwitterAPIMonitor.getInstance().methodCalled(str, System.currentTimeMillis() - jCurrentTimeMillis, isOk(null));
            throw th;
        }
    }

    private HttpResponse post(String str, HttpParameter[] httpParameterArr) {
        ensureAuthorizationEnabled();
        if (!this.conf.isMBeanEnabled()) {
            return this.http.post(str, mergeImplicitParams(httpParameterArr), this.auth, this);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            HttpResponse httpResponsePost = this.http.post(str, mergeImplicitParams(httpParameterArr), this.auth, this);
            TwitterAPIMonitor.getInstance().methodCalled(str, System.currentTimeMillis() - jCurrentTimeMillis, isOk(httpResponsePost));
            return httpResponsePost;
        } catch (Throwable th) {
            TwitterAPIMonitor.getInstance().methodCalled(str, System.currentTimeMillis() - jCurrentTimeMillis, isOk(null));
            throw th;
        }
    }

    private HttpParameter[] mergeParameters(HttpParameter[] httpParameterArr, HttpParameter[] httpParameterArr2) {
        if (httpParameterArr != null && httpParameterArr2 != null) {
            HttpParameter[] httpParameterArr3 = new HttpParameter[httpParameterArr.length + httpParameterArr2.length];
            System.arraycopy(httpParameterArr, 0, httpParameterArr3, 0, httpParameterArr.length);
            System.arraycopy(httpParameterArr2, 0, httpParameterArr3, httpParameterArr.length, httpParameterArr2.length);
            return httpParameterArr3;
        }
        if (httpParameterArr == null && httpParameterArr2 == null) {
            return new HttpParameter[0];
        }
        return httpParameterArr == null ? httpParameterArr2 : httpParameterArr;
    }

    private HttpParameter[] mergeParameters(HttpParameter[] httpParameterArr, HttpParameter httpParameter) {
        if (httpParameterArr != null && httpParameter != null) {
            HttpParameter[] httpParameterArr2 = new HttpParameter[httpParameterArr.length + 1];
            System.arraycopy(httpParameterArr, 0, httpParameterArr2, 0, httpParameterArr.length);
            httpParameterArr2[httpParameterArr2.length - 1] = httpParameter;
            return httpParameterArr2;
        }
        if (httpParameterArr == null && httpParameter == null) {
            return new HttpParameter[0];
        }
        return httpParameterArr == null ? new HttpParameter[]{httpParameter} : httpParameterArr;
    }

    private HttpParameter[] mergeImplicitParams(HttpParameter[] httpParameterArr) {
        return mergeParameters(httpParameterArr, this.IMPLICIT_PARAMS);
    }

    private boolean isOk(HttpResponse httpResponse) {
        return httpResponse != null && httpResponse.getStatusCode() < 300;
    }

    @Override // twitter4j.TwitterBaseImpl
    public String toString() {
        return "TwitterImpl{INCLUDE_MY_RETWEET=" + this.INCLUDE_MY_RETWEET + '}';
    }
}
