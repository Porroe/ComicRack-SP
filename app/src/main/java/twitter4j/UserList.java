package twitter4j;

import java.io.Serializable;
import java.net.URI;
import java.util.Date;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface UserList extends Serializable, Comparable, TwitterResponse {
    Date getCreatedAt();

    String getDescription();

    String getFullName();

    long getId();

    int getMemberCount();

    String getName();

    String getSlug();

    int getSubscriberCount();

    URI getURI();

    User getUser();

    boolean isFollowing();

    boolean isPublic();
}
