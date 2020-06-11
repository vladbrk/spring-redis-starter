package org.biryukov.service.impl;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

import java.util.ArrayList;
import java.util.List;

public class MessageListenerImpl implements MessageListener {
    public static List<String> messageList = new ArrayList<>();

    @Override
    public void onMessage(final Message message, final byte[] pattern) {
        messageList.add(message.toString());
        String channel = new String(message.getChannel());
        String body = new String(message.getBody());
        System.out.println(String.format("Message received. Channel: %s, body: %s", channel, body));
    }
}
