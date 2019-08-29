package org.dubbo.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

// 方式一：导入dubbo基本配置的xml
@EnableDubbo(scanBasePackages = "org.dubbo")
@ImportResource(value = {"classpath:dubbo-consumer.xml"})
@ComponentScan(value = {"org.dubbo"})
@Configuration

//方式二：将配置写道dubbo.properties文件中，dubbo默认会读取这个文件里面的配置
//@EnableDubbo(scanBasePackages = "org.dubbo")
//@ComponentScan(value = {"org.dubbo"})
//@Configuration
public class Config {

}
