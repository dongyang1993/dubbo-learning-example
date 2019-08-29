package org.dubbo.config;

import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@EnableDubbo(scanBasePackages = "org.dubbo")
@PropertySource("classpath:dubbo-provider.properties")
@ComponentScan(value = {"org.dubbo"})
@Configuration
public class Config {

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://192.168.254.128:2181");
        return registryConfig;
    }

}
