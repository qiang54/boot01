package com.example.demolog.jmsConsumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {

    @JmsListener(destination = "order.queue")
    public void receviceQueue(String msg){
        System.out.println("接收到的消息：" + msg);
    }
}
