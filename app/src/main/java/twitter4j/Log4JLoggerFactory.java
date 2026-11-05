package twitter4j;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class Log4JLoggerFactory extends LoggerFactory {
    Log4JLoggerFactory() {
    }

    @Override // twitter4j.LoggerFactory
    public final Logger getLogger(Class cls) {
        return new Log4JLogger(org.apache.log4j.Logger.getLogger(cls));
    }
}
