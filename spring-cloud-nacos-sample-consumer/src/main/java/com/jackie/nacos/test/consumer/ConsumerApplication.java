package com.jackie.nacos.test.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ConsumerApplication
 *
 * @author Jackie Hou
 * @date 2024/7/29 19:10
 * @version 1.0
 */

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.jackie.nacos.test.consumer"})
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
        System.out.println("启动成功了");
    }
}
