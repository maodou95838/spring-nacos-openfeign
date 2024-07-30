package com.jackie.nacos.test.consumer.controller;

import com.jackie.nacos.test.consumer.feign.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author Jackie Hou
 * @date 2024/7/29 22:27
 * @version 1.0
 */
@RestController
@Slf4j
public class HelloController {

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam("name") String name) {
        return helloService.sayHello(name);
    }



    @Autowired
    private HelloService helloService;
}
