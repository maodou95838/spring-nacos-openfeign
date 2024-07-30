package com.jackie.nacos.test.sample.provider.serivice;

import com.jackie.nacos.test.sample.api.IHelloService;
import org.springframework.stereotype.Service;

/**
 * HelloServiceImpl
 *
 * @author Jackie Hou
 * @date 2024/7/29 18:44
 * @version 1.0
 */
@Service
public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(String name) {
        return "Hi, " + name;
    }
}
