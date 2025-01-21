package com.github.alym62.voting.api.event;

import java.time.LocalDateTime;

import com.github.alym62.voting.api.event.enums.Events;

import lombok.Builder;

@Builder
public record EventVoting(
        Events event,
        Long idCandidate,
        LocalDateTime createdAt) {
}
