package com.github.alym62.voting.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.alym62.voting.api.event.EventVoting;
import com.github.alym62.voting.api.service.EventService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/event")
@RequiredArgsConstructor
public class EventController {
    private final EventService service;

    @PostMapping("/send")
    public ResponseEntity<Void> processEvent(@RequestBody EventVoting event) {
        service.sendEvent(event);
        return ResponseEntity.accepted().build();
    }

}
