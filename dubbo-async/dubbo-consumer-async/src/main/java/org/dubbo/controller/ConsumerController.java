package org.dubbo.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.dubbo.service.AsyncService;
import org.dubbo.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
public class ConsumerController {

    @Autowired
    private HiService hiService;

    @Reference
    private AsyncService asyncService;

    @GetMapping("/go")
    public void go() {
        String pong = hiService.pong("HI");
        System.out.println(pong);
    }

    @GetMapping("/sayHello1")
    public void sayHello1() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = asyncService.sayHello1("Henry");
        System.out.println(future.get());
    }

    @GetMapping("/sayHello2")
    public void sayHello2() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return asyncService.sayHello2("Henry");
        });
        System.out.println(future.get());
    }

    @GetMapping("/sayHello3")
    public void sayHello3() throws ExecutionException, InterruptedException {
        CompletableFuture.runAsync(() -> {
            String pong = asyncService.sayHello3("Henry");
            System.out.println(pong);
        });
    }
}
