package twitter4j.management;

import java.util.Map;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface APIStatisticsMBean extends InvocationStatistics {
    Iterable getInvocationStatistics();

    Map getMethodLevelSummariesAsString();

    String getMethodLevelSummary(String str);
}
