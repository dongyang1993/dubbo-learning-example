import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

public class DubboUtil {

    private static ReferenceConfig referenceConfig;

    static {
        referenceConfig = new ReferenceConfig();
        ApplicationConfig applicationConfig = new ApplicationConfig("dubbo-consumer");
        applicationConfig.setQosEnable(false);
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setRegistry(new RegistryConfig("zookeeper://172.16.52.20:2181"));
    }

    @SuppressWarnings("unchecked")
    public static <T> T getRef(Class<T> clazz) {
        referenceConfig.setInterface(clazz);
        return (T)referenceConfig.get();
    }
}
