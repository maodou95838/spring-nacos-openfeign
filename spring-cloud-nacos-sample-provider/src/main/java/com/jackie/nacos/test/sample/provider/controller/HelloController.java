package com.jackie.nacos.test.sample.provider.controller;

import com.jackie.nacos.test.sample.api.IHelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author Jackie Hou
 * @date 2024/7/29 18:43
 * @version 1.0
 */
@RestController
@RequestMapping("/provider")
@Slf4j
public class HelloController {

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam("name") String name) {
        return service.sayHello("--------" + name);
    }

    @Autowired
    IHelloService service;
}
