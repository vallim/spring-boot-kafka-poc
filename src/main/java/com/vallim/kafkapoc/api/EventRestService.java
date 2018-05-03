package com.vallim.kafkapoc.api;

import com.vallim.kafkapoc.model.EventDto;
import com.vallim.kafkapoc.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/event")
@AllArgsConstructor
public class EventRestService {

    private EventService eventService;

    @PostMapping
    public ResponseEntity save(@RequestBody EventDto eventDto) {
        eventService.save(eventDto);

        return ResponseEntity.accepted().build();
    }
}
