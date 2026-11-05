package twitter4j.api;

import java.io.InputStream;
import twitter4j.DirectMessage;
import twitter4j.Paging;
import twitter4j.ResponseList;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface DirectMessagesResources {
    DirectMessage destroyDirectMessage(long j);

    InputStream getDMImageAsStream(String str);

    ResponseList getDirectMessages();

    ResponseList getDirectMessages(Paging paging);

    ResponseList getSentDirectMessages();

    ResponseList getSentDirectMessages(Paging paging);

    DirectMessage sendDirectMessage(long j, String str);

    DirectMessage sendDirectMessage(String str, String str2);

    DirectMessage showDirectMessage(long j);
}
