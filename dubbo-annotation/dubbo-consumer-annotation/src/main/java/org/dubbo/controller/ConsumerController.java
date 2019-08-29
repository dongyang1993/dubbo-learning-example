package org.dubbo.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.dubbo.service.ProviderService;
import org.springframework.stereotype.Component;

@Component
public class ConsumerController {

    @Reference
    private ProviderService providerService;

    public void go() {
        String pong = providerService.pong("HI");
        System.out.println(pong);
    }
}
