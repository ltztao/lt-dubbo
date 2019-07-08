package com.lt.dubbo.customer.ltcustomer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class LtConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LtConsumerApplication.class, args);
    }

}
