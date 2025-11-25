package dev.pontin.EventClean.infra.mapper;

import dev.pontin.EventClean.core.entities.Event;
import dev.pontin.EventClean.infra.dtos.request.EventRequest;
import dev.pontin.EventClean.infra.dtos.response.EventResponse;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {

    public static Event toEvent(EventRequest request) {
        return Event.builder()
                .name(request.name())
                .description(request.description())
                .capacity(request.capacity())
                .identifier(request.identifier())
                .eventType(request.eventType())
                .eventLocal(request.eventLocal())
                .startDate(request.startDate())
                .endDate(request.endDate())
                .organizer(request.organizer())
                .build();

    }

    public static EventResponse toResponse(Event entity) {
        return EventResponse.builder()
                .id(entity.id())
                .name(entity.name())
                .description(entity.description())
                .capacity(entity.capacity())
                .identifier(entity.identifier())
                .eventType(entity.eventType())
                .eventLocal(entity.eventLocal())
                .startDate(entity.startDate())
                .endDate(entity.endDate())
                .organizer(entity.organizer())
                .build();
    }
}
