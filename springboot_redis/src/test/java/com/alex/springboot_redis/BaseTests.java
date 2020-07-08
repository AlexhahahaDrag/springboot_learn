package com.alex.springboot_redis;

import com.alex.springboot_redis.util.RedisUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description: 测试类
 * Author:      alex
 * CreateDate:  2020/7/8 15:33
 * Version:     1.0
 *
*/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RedisApplication.class)
class BaseTests {

    @Test
    void contextLoads() {
        RedisUtils.hashSet("test", "ymq", "www");
        System.out.println(RedisUtils.hashGet("test", "ymq"));
    }

}
