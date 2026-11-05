package twitter4j;

import org.apache.commons.logging.LogFactory;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class CommonsLoggingLoggerFactory extends LoggerFactory {
    CommonsLoggingLoggerFactory() {
    }

    @Override // twitter4j.LoggerFactory
    public final Logger getLogger(Class cls) {
        return new CommonsLoggingLogger(LogFactory.getLog(cls));
    }
}
