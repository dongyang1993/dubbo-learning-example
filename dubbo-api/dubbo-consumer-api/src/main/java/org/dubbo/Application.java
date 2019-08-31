package org.dubbo;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.dubbo.service.HiService;

public class Application {
    public static void main(String[] args) {
        ReferenceConfig<HiService> referenceConfig = new ReferenceConfig<>();
        ApplicationConfig applicationConfig = new ApplicationConfig("dubbo-consumer");
        applicationConfig.setQosPort(33333);
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setRegistry(new RegistryConfig("zookeeper://172.16.52.20:2181"));
        referenceConfig.setInterface(HiService.class);
        HiService hiService = referenceConfig.get();
        String pong = hiService.pong("HI");
        System.out.println(pong);
    }
}
