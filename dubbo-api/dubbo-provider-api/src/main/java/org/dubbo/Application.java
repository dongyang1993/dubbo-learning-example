package org.dubbo;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.dubbo.service.HiService;
import org.dubbo.service.impl.HiServiceImpl;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        ServiceConfig<HiServiceImpl> serviceConfig = new ServiceConfig<>();
        ApplicationConfig applicationConfig = new ApplicationConfig("dubbo-consumer");
        applicationConfig.setQosPort(22222);
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.setRegistry(new RegistryConfig("zookeeper://172.16.52.20:2181"));
        serviceConfig.setProtocol(new ProtocolConfig("dubbo", 20881));
        serviceConfig.setInterface(HiService.class);
        serviceConfig.setRef(new HiServiceImpl());
        serviceConfig.export();

        System.in.read();
    }
}
