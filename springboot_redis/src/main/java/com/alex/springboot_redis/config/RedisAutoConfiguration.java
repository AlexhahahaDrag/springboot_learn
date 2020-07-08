package com.alex.springboot_redis.config;

import com.alex.springboot_redis.util.RedisUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Description: 注册配置类到容器
 * Author:      alex
 * CreateDate:  2020/7/8 15:26
 * Version:     1.0
 *
*/
@Configuration
@Import({RedisConfig.class, RedisUtils.class})
public class RedisAutoConfiguration {
}
