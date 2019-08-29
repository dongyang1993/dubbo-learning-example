package org.dubbo;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.dubbo.service.ProviderService;
import org.dubbo.service.impl.ProviderServiceImpl;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        ServiceConfig<ProviderServiceImpl> serviceConfig = new ServiceConfig<>();
        ApplicationConfig applicationConfig = new ApplicationConfig("dubbo-consumer");
        applicationConfig.setQosPort(22222);
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.setRegistry(new RegistryConfig("zookeeper://172.16.52.20:2181"));
        serviceConfig.setInterface(ProviderService.class);
        serviceConfig.setRef(new ProviderServiceImpl());
        serviceConfig.export();

        System.in.read();
    }
}
