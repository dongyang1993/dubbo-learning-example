package org.dubbo.service.impl;

import org.dubbo.service.AsyncService;

import java.util.concurrent.CompletableFuture;

public class AsyncServiceImpl implements AsyncService {
    @Override
    public CompletableFuture<String> sayHello(String name) {
//        CompletableFuture<Object> future = CompletableFuture.supplyAsync(()->{
//
//        });
        return null;
    }
}
