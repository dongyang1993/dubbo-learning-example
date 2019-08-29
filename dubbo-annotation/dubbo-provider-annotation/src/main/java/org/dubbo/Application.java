package org.dubbo;

import org.dubbo.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        context.start();
        System.in.read();
    }
}
