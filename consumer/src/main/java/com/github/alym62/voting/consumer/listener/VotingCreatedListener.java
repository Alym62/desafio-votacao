package com.github.alym62.voting.consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.github.alym62.voting.consumer.events.EventVotingCreated;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class VotingCreatedListener {
    @RabbitListener(queues = "${app.queue}")
    public void onVotingCreatedListener(EventVotingCreated event) {
        log.info(event);
    }
}