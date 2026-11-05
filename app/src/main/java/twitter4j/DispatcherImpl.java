package twitter4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import twitter4j.conf.Configuration;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class DispatcherImpl implements Dispatcher {
    private final ExecutorService executorService;

    static /* synthetic */ ExecutorService access$000(DispatcherImpl dispatcherImpl) {
        return dispatcherImpl.executorService;
    }

    public DispatcherImpl(Configuration configuration) {
        this.executorService = Executors.newFixedThreadPool(configuration.getAsyncNumThreads(), new ThreadFactoryC11761(configuration));
        Runtime.getRuntime().addShutdownHook(new C11772());
    }

    /* compiled from: DontLook */
    /* renamed from: twitter4j.DispatcherImpl$1 */
    class ThreadFactoryC11761 implements ThreadFactory {
        int count = 0;
        final /* synthetic */ Configuration val$conf;

        ThreadFactoryC11761(Configuration configuration) {
            this.val$conf = configuration;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            int i = this.count;
            this.count = i + 1;
            thread.setName(String.format("Twitter4J Async Dispatcher[%d]", Integer.valueOf(i)));
            thread.setDaemon(this.val$conf.isDaemonEnabled());
            return thread;
        }
    }

    /* compiled from: DontLook */
    /* renamed from: twitter4j.DispatcherImpl$2 */
    class C11772 extends Thread {
        C11772() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            DispatcherImpl.access$000(DispatcherImpl.this).shutdown();
        }
    }

    @Override // twitter4j.Dispatcher
    public final synchronized void invokeLater(Runnable runnable) {
        this.executorService.execute(runnable);
    }

    @Override // twitter4j.Dispatcher
    public final synchronized void shutdown() {
        this.executorService.shutdown();
    }
}
