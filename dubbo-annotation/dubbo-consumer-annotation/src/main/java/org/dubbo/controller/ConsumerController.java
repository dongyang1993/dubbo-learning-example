package org.dubbo.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.dubbo.service.HiService;
import org.springframework.stereotype.Component;

@Component
public class ConsumerController {

    @Reference
    private HiService hiService;

    public void go() {
        String pong = hiService.pong("HI");
        System.out.println(pong);
    }
}
