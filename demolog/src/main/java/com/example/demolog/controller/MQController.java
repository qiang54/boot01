package com.example.demolog.controller;


import com.example.demolog.domain.JsonData;
import com.example.demolog.service.ProducerService;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;

@RestController
@RequestMapping("/api/mq")
public class MQController {

    @Autowired
    private ProducerService producerService;

    @GetMapping("order")
    public Object order(String msg){

        Destination destination = new ActiveMQQueue("order.queue");
        producerService.sendMessage(destination, msg);
        return JsonData.buildSuccess();
    }

    @GetMapping("common")
    public Object common(String msg){
        producerService.sendMessage(msg);
        return JsonData.buildSuccess();
    }
}
