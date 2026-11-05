package twitter4j.conf;

/* compiled from: DontLook */
/* loaded from: classes.dex */
class PropertyConfigurationFactory implements ConfigurationFactory {
    private static final PropertyConfiguration ROOT_CONFIGURATION = new PropertyConfiguration();

    PropertyConfigurationFactory() {
    }

    @Override // twitter4j.conf.ConfigurationFactory
    public Configuration getInstance() {
        return ROOT_CONFIGURATION;
    }

    @Override // twitter4j.conf.ConfigurationFactory
    public Configuration getInstance(String str) throws IllegalAccessException, IllegalArgumentException {
        PropertyConfiguration propertyConfiguration = new PropertyConfiguration(str);
        propertyConfiguration.dumpConfiguration();
        return propertyConfiguration;
    }

    @Override // twitter4j.conf.ConfigurationFactory
    public void dispose() {
    }
}
