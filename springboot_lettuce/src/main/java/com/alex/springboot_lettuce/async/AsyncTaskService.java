package com.alex.springboot_lettuce.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

//放在方法上表明所有的方法都是异步执行
@Async
@Service
public class AsyncTaskService {

    public void executeAysncTask(Integer i) {

    }
}
