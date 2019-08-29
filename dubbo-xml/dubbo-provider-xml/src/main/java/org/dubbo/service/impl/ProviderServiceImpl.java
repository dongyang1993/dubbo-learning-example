package org.dubbo.service.impl;

import org.dubbo.service.ProviderService;
import org.springframework.stereotype.Service;

@Service
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String pong(String msg) {
        return msg + ":PONG";
    }
}
