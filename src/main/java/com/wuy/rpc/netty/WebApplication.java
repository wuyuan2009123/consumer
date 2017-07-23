package com.wuy.rpc.netty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * Created by wuy on 2017/6/30.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.wuy.rpc"})
public class WebApplication {
    public static void main(String[] args) {

        SpringApplication.run(WebApplication.class, args);


    }
}
