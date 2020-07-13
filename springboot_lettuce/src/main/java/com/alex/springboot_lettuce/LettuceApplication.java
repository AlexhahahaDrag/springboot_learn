package com.alex.springboot_lettuce;

import com.alex.springboot_lettuce.async.AsyncTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LettuceApplication implements CommandLineRunner {

    @Autowired
    private AsyncTaskService asyncTaskService;

    public static void main(String[] args) {
        SpringApplication.run(LettuceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 10; i++) {
            asyncTaskService.executeAysncTask(i);
        }
    }
}
