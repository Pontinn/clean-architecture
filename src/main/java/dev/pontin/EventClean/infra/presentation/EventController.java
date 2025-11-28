package dev.pontin.EventClean.infra.presentation;

import dev.pontin.EventClean.core.entities.Event;
import dev.pontin.EventClean.core.usecases.CreateEventCase;
import dev.pontin.EventClean.core.usecases.SearchEventCase;
import dev.pontin.EventClean.infra.dtos.request.EventRequest;
import dev.pontin.EventClean.infra.dtos.response.EventResponse;
import dev.pontin.EventClean.infra.mapper.EventMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/event")
public class EventController {

    private final CreateEventCase createEventCase;
    private final SearchEventCase searchEventCase;

    @PostMapping
    public EventResponse createEvent(@RequestBody EventRequest dto) {
        Event newEvent = createEventCase.execute(EventMapper.toDomain(dto));
        return EventMapper.toResponse(newEvent);
    }

    @GetMapping
    public List<EventResponse> searchEvent() {
        List<Event> eventList = searchEventCase.execute();

        return eventList.stream()
                .map(EventMapper::toResponse)
                .toList();
    }
}
