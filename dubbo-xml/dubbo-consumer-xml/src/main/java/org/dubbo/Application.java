package org.dubbo;

import org.dubbo.service.HiService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();

        HiService hiService = context.getBean("hiService", HiService.class);
        String pong = hiService.pong("Hi");
        System.out.println(pong);
    }
}
