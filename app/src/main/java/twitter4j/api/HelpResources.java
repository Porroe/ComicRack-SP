package twitter4j.api;

import java.util.Map;
import twitter4j.ResponseList;
import twitter4j.TwitterAPIConfiguration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface HelpResources {

    /* compiled from: DontLook */
    public interface Language {
        String getCode();

        String getName();

        String getStatus();
    }

    TwitterAPIConfiguration getAPIConfiguration();

    ResponseList getLanguages();

    String getPrivacyPolicy();

    Map getRateLimitStatus();

    Map getRateLimitStatus(String... strArr);

    String getTermsOfService();
}
