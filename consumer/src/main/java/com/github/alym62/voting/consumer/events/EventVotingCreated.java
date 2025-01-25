package com.github.alym62.voting.consumer.events;

import java.time.LocalDateTime;

public record EventVotingCreated(
        String event,
        Long idCandidate,
        LocalDateTime createdAt) {

}
