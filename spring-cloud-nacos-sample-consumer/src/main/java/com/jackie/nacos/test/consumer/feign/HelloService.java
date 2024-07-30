package com.jackie.nacos.test.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * HelloService
 *
 * @author Jackie Hou
 * @date 2024/7/29 22:02
 * @version 1.0
 */
@FeignClient(value="nacos-sample-provider", path="/provider")
public interface HelloService {

    @GetMapping("/sayHello")
    String sayHello(@RequestParam("name")String name);
}
