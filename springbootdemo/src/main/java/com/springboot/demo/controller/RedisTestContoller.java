package com.springboot.demo.controller;

import com.springboot.demo.redis.RedisService;
import com.springboot.demo.redis.mapper.RedisTestMapper;
import com.springboot.demo.vo.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redis")
public class RedisTestContoller {

    private Logger Logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    RedisTestMapper redisTestMapper;
    @Autowired
    RedisService redisService;

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public void saveByUserName(@RequestBody Test test){
          Logger.info("添加test");
         redisTestMapper.saveByUserName(test);
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public Test getByUserName(String userName){
        return redisTestMapper.getByUserName(userName);
    }

    @RequestMapping(value = "/test",method = RequestMethod.DELETE)
    public void deleteByUserName(String userName){
        redisTestMapper.deleteByUserName(userName);
    }

    @PostMapping(value = "/test2")
    public void test2(@RequestBody Test test){
        Logger.info("添加test");
        redisService.set(test.getUserName(),test);

    }  @DeleteMapping(value = "/test2")
    public void test(@RequestBody Test test){
        Logger.info("删除test");
        redisService.del(test.getUserName());
    }
}
