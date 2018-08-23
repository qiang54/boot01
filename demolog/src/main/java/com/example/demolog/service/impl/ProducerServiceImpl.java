package com.example.demolog.service.impl;

import com.example.demolog.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.Queue;
@Service
public class ProducerServiceImpl implements ProducerService {

    //注入模板对象。用来发送消息到broker
    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Queue queue;

    @Override
    public void sendMessage(Destination destination, String message) {

        jmsTemplate.convertAndSend(destination, message);
    }

    @Override
    public void sendMessage(String message) {

        jmsTemplate.convertAndSend(message);
    }
}
