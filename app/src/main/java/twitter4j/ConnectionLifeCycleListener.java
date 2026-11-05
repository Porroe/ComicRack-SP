package twitter4j;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public interface ConnectionLifeCycleListener {
    void onCleanUp();

    void onConnect();

    void onDisconnect();
}
