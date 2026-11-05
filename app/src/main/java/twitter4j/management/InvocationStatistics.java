package twitter4j.management;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface InvocationStatistics {
    long getAverageTime();

    long getCallCount();

    long getErrorCount();

    String getName();

    long getTotalTime();

    void reset();
}
