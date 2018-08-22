package com.example.demomybatis.task;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @EnableScheduling加在程序入口类上
 *
 */

@Component
public class TestTask {

    @Scheduled(fixedRate = 2000)
    public void test(){
        System.out.println("当前时间："+ new Date());
    }
}
