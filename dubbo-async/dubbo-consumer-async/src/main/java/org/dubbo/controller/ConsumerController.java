package org.dubbo.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.dubbo.service.AsyncService;
import org.dubbo.service.HiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Reference
    private HiService hiService;

    @GetMapping("/go")
    public void go() {
        String pong = hiService.pong("HI");
        System.out.println(pong);
    }
}
