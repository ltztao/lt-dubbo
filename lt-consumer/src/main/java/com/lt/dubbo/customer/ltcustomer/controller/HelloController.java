package com.lt.dubbo.customer.ltcustomer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lt.dubbo.api.ltapi.common.ResultMsg;
import com.lt.dubbo.api.ltapi.service.SayHello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Reference
    private SayHello sayHello;

    @GetMapping(value = "/hello")
    public ResultMsg say(String name){
        return ResultMsg.SUCCESS(sayHello.sayHello(name));
    }
}
