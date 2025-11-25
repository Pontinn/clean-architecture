package dev.pontin.EventClean.infra.presentation;

import dev.pontin.EventClean.core.entities.Event;
import dev.pontin.EventClean.core.usecases.CreateEventCase;
import dev.pontin.EventClean.infra.dtos.request.EventRequest;
import dev.pontin.EventClean.infra.dtos.response.EventResponse;
import dev.pontin.EventClean.infra.mapper.EventMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/event")
public class EventController {

    private final CreateEventCase createEventCase;

    public EventController(CreateEventCase createEventCase) {
        this.createEventCase = createEventCase;
    }

    @PostMapping
    public EventResponse createEvent(EventRequest dto) {
        Event newEvent = createEventCase.execute(EventMapper.toEvent(dto));

        return EventMapper.toResponse(newEvent);
    }
}
