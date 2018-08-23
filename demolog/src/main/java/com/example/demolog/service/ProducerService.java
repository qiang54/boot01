package com.example.demolog.service;

import javax.jms.Destination;

public interface ProducerService {

    public void sendMessage(Destination destination, final String message);
    public void sendMessage(final String message);
}
