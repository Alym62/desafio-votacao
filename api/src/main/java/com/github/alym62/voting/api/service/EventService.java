package com.github.alym62.voting.api.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.github.alym62.voting.api.event.EventVoting;
import com.github.alym62.voting.api.event.enums.Events;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventService {
    @Value("${app.exchange.fanout}")
    private String exchange;

    private final RabbitTemplate rabbitTemplate;

    public void sendEvent(EventVoting event) {
        if (event.event() == Events.EVENT_VOTE) {
            rabbitTemplate.convertAndSend(exchange, "", event);
        }
    }
}
