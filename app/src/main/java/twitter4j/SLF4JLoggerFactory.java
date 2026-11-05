package twitter4j;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class SLF4JLoggerFactory extends LoggerFactory {
    SLF4JLoggerFactory() {
    }

    @Override // twitter4j.LoggerFactory
    public final Logger getLogger(Class cls) {
        return new SLF4JLogger(org.slf4j.LoggerFactory.getLogger(cls));
    }
}
