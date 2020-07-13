package com.alex.springboot_lettuce.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    private static final String KEY = "userKey";

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void addUserName(String uName) {
        stringRedisTemplate.opsForValue().set(KEY, uName);
    }

    public void updateUserName(String uName) {
        stringRedisTemplate.opsForValue().set(KEY, uName);
    }

    public String getUserName() {
        return stringRedisTemplate.opsForValue().get(KEY);
    }

    public void deleteUser() {
        stringRedisTemplate.delete(KEY);
    }
}
