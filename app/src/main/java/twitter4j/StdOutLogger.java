package twitter4j;

import java.util.Date;
import twitter4j.conf.ConfigurationContext;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class StdOutLogger extends Logger {
    private static final boolean DEBUG = ConfigurationContext.getInstance().isDebugEnabled();

    StdOutLogger() {
    }

    @Override // twitter4j.Logger
    public final boolean isDebugEnabled() {
        return DEBUG;
    }

    @Override // twitter4j.Logger
    public final boolean isInfoEnabled() {
        return true;
    }

    @Override // twitter4j.Logger
    public final boolean isWarnEnabled() {
        return true;
    }

    @Override // twitter4j.Logger
    public final boolean isErrorEnabled() {
        return true;
    }

    @Override // twitter4j.Logger
    public final void debug(String str) {
        if (DEBUG) {
            System.out.println("[" + new Date() + "]" + str);
        }
    }

    @Override // twitter4j.Logger
    public final void debug(String str, String str2) {
        if (DEBUG) {
            debug(str + str2);
        }
    }

    @Override // twitter4j.Logger
    public final void info(String str) {
        System.out.println("[" + new Date() + "]" + str);
    }

    @Override // twitter4j.Logger
    public final void info(String str, String str2) {
        info(str + str2);
    }

    @Override // twitter4j.Logger
    public final void warn(String str) {
        System.out.println("[" + new Date() + "]" + str);
    }

    @Override // twitter4j.Logger
    public final void warn(String str, String str2) {
        warn(str + str2);
    }

    @Override // twitter4j.Logger
    public final void error(String str) {
        System.out.println("[" + new Date() + "]" + str);
    }

    @Override // twitter4j.Logger
    public final void error(String str, Throwable th) {
        System.out.println(str);
        th.printStackTrace(System.err);
    }
}
