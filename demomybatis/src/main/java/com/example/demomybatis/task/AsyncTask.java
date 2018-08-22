package com.example.demomybatis.task;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Async // 加在此处，表示此类中的所有方法都为异步任务
public class AsyncTask {

    public void taskAsync1(){
        long begin = System.currentTimeMillis();
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

     public void taskAsync2(){
        long begin = System.currentTimeMillis();
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
         System.out.println(end - begin);
    }

    public void taskAsync3(){
        long begin = System.currentTimeMillis();
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }



}
