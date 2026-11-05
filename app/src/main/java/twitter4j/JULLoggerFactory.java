package twitter4j;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class JULLoggerFactory extends LoggerFactory {
    JULLoggerFactory() {
    }

    @Override // twitter4j.LoggerFactory
    public final Logger getLogger(Class cls) {
        return new JULLogger(java.util.logging.Logger.getLogger(cls.getName()));
    }
}
