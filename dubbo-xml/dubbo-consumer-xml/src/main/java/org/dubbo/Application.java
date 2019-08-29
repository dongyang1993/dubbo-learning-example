package org.dubbo;

import org.dubbo.service.ProviderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();

        ProviderService providerService = context.getBean("providerService", ProviderService.class);
        String pong = providerService.pong("Hi");
        System.out.println(pong);
    }
}
