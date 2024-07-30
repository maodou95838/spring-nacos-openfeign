package com.jackie.nacos.test.consumer.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * Configuration
 *
 * @author Jackie Hou
 * @date 2024/7/30 15:22
 * @version 1.0
 */
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    Logger.Level feignLogger() {
        return Logger.Level.FULL;
    }
}
