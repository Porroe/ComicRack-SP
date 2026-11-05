package twitter4j;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface Dispatcher {
    void invokeLater(Runnable runnable);

    void shutdown();
}
