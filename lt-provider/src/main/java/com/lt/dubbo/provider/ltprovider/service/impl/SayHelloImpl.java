package com.lt.dubbo.provider.ltprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lt.dubbo.api.ltapi.service.SayHello;

@Service
public class SayHelloImpl implements SayHello {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
