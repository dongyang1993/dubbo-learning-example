package org.dubbo.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@EnableDubbo(scanBasePackages = "org.dubbo")

@PropertySource("classpath:dubbo-consumer.properties")
@ComponentScan(value = {"org.dubbo"})
@Configuration
public class Config {

}
