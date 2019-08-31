package org.dubbo.service.impl;

import org.dubbo.service.HiService;
import org.springframework.stereotype.Service;

@Service
public class HiServiceImpl implements HiService {

    @Override
    public String pong(String msg) {
        return msg + ":PONG";
    }
}
