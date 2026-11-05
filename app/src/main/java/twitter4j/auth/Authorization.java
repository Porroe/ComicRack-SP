package twitter4j.auth;

import java.io.Serializable;
import twitter4j.HttpRequest;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface Authorization extends Serializable {
    String getAuthorizationHeader(HttpRequest httpRequest);

    boolean isEnabled();
}
