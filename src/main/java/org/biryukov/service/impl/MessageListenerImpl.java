package org.biryukov.service.impl;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

import java.util.ArrayList;
import java.util.List;

public class MessageSubscriber implements MessageListener {
    public static List<String> messageList = new ArrayList<String>();

    @Override
    public void onMessage(final Message message, final byte[] pattern) {
        messageList.add(message.toString());
        System.out.println("Message received: " + new String(message.getBody()));
    }
}
