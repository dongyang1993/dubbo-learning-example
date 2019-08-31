package org.dubbo.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.dubbo.service.HiService;

@Service
public class HiServiceImpl implements HiService {
    @Override
    public String pong(String msg) {
        return msg + ":PONG";
    }
}
