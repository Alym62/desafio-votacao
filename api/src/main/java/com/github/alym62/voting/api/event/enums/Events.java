package com.github.alym62.voting.api.event.enums;

public enum Events {
    EVENT_VOTE("EVENT_VOTE");

    private String description;

    Events(String description) {
        this.description = description;
    }

    public String getValue() {
        return this.description;
    }
}
