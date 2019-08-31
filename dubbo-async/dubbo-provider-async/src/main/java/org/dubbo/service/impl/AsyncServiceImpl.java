package org.dubbo.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.dubbo.service.AsyncService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Service
public class AsyncServiceImpl implements AsyncService {
    @Override
    public CompletableFuture<String> sayHello1(String name) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello:" + name;
        });
        return future;
    }

    @Override
    public String sayHello2(String name) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello:" + name;
    }

    @Override
    public String sayHello3(String name) {
        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String msg = "Hello:" + name;
        System.out.println(msg);
        return msg;
    }
}
