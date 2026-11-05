package twitter4j;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class NullLogger extends Logger {
    NullLogger() {
    }

    @Override // twitter4j.Logger
    public final boolean isDebugEnabled() {
        return false;
    }

    @Override // twitter4j.Logger
    public final boolean isInfoEnabled() {
        return false;
    }

    @Override // twitter4j.Logger
    public final boolean isWarnEnabled() {
        return false;
    }

    @Override // twitter4j.Logger
    public final boolean isErrorEnabled() {
        return false;
    }

    @Override // twitter4j.Logger
    public final void debug(String str) {
    }

    @Override // twitter4j.Logger
    public final void debug(String str, String str2) {
    }

    @Override // twitter4j.Logger
    public final void info(String str) {
    }

    @Override // twitter4j.Logger
    public final void info(String str, String str2) {
    }

    @Override // twitter4j.Logger
    public final void warn(String str) {
    }

    @Override // twitter4j.Logger
    public final void warn(String str, String str2) {
    }

    @Override // twitter4j.Logger
    public final void error(String str) {
    }

    @Override // twitter4j.Logger
    public final void error(String str, Throwable th) {
    }
}
