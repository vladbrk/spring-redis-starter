package org.biryukov.service;

public interface MessagePublisher {
    void publish(final String message);
}
