package com.lt.dubbo.provider.ltprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class LtProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(LtProviderApplication.class, args);
    }

}
