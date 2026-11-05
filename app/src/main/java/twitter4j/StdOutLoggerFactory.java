package twitter4j;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class StdOutLoggerFactory extends LoggerFactory {
    private static final Logger SINGLETON = new StdOutLogger();

    StdOutLoggerFactory() {
    }

    @Override // twitter4j.LoggerFactory
    public final Logger getLogger(Class cls) {
        return SINGLETON;
    }
}
