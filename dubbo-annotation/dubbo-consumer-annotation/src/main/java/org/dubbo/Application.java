package org.dubbo;

import org.dubbo.config.Config;
import org.dubbo.controller.ConsumerController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        context.start();

        ConsumerController consumerController = context.getBean(ConsumerController.class);
        consumerController.go();
    }
}
