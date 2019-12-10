package com.springboot.demo.redis.mapper;

import com.springboot.demo.vo.Test;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
@Cacheable
public class RedisTestMapper {

    @Cacheable(key = "#userName")
    public Test getByUserName(String userName){ return null;}

    @CachePut(key = "#test.userName")
    public void saveByUserName(Test test){}

    @CacheEvict(key = "#p0")
    public void deleteByUserName(String userName){}
}
