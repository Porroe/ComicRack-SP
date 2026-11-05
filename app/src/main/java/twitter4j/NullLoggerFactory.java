package twitter4j;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class NullLoggerFactory extends LoggerFactory {
    private static final Logger SINGLETON = new NullLogger();

    NullLoggerFactory() {
    }

    @Override // twitter4j.LoggerFactory
    public final Logger getLogger(Class cls) {
        return SINGLETON;
    }
}
