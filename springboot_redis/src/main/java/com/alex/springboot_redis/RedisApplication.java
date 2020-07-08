package com.alex.springboot_redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Description: 启动服务
 * Author:      alex
 * CreateDate:  2020/7/8 15:27
 * Version:     1.0
 *
*/
@SpringBootApplication
@ComponentScan(value = {"com.alex.springboot_redis"})
public class RedisApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(RedisApplication.class, args);
        while(true) {
            int port = 8989;
            ServerSocket socket = new ServerSocket(port);
            socket.accept();
        }
    }

}
