package twitter4j;

import java.lang.reflect.InvocationTargetException;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationContext;

/* compiled from: DontLook */
/* loaded from: classes.dex */
final class DispatcherFactory {
    private final Configuration conf;
    private final String dispatcherImpl;

    public DispatcherFactory(Configuration configuration) {
        this.dispatcherImpl = configuration.getDispatcherImpl();
        this.conf = configuration;
    }

    public DispatcherFactory() {
        this(ConfigurationContext.getInstance());
    }

    public final Dispatcher getInstance() {
        try {
            return (Dispatcher) Class.forName(this.dispatcherImpl).getConstructor(Configuration.class).newInstance(this.conf);
        } catch (ClassCastException e) {
            throw new AssertionError(e);
        } catch (ClassNotFoundException e2) {
            throw new AssertionError(e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        } catch (InstantiationException e4) {
            throw new AssertionError(e4);
        } catch (NoSuchMethodException e5) {
            throw new AssertionError(e5);
        } catch (InvocationTargetException e6) {
            throw new AssertionError(e6);
        }
    }
}
