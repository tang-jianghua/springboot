package com.tangjianghua.threadpool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author tangjianghua
 * @date 2020/7/10
 */
@EnableConfigurationProperties(CustomerThreadPoolInitializer.class)
@SpringBootApplication
public class ThreadPoolApplicationStart {

    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(ThreadPoolApplicationStart.class, args);
    }
}
