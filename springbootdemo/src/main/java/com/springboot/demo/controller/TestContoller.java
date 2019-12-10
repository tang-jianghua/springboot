package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestContoller {

    @Value("${userName}")
    private String userName;

    @RequestMapping("test")
    public String test(){
        return "Hello "+userName+"!";
    }

}
