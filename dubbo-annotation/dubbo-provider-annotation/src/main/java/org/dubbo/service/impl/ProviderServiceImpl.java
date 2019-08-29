package org.dubbo.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.dubbo.service.ProviderService;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String pong(String msg) {
        return msg + ":PONG";
    }
}
