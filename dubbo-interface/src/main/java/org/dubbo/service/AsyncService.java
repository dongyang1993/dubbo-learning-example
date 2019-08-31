package org.dubbo.service;

import java.util.concurrent.CompletableFuture;

public interface AsyncService {

    CompletableFuture<String> sayHello1(String name);

    String sayHello2(String name);

    String sayHello3(String name);
}
