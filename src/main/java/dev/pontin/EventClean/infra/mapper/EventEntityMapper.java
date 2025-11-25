package dev.pontin.EventClean.infra.mapper;

import dev.pontin.EventClean.core.entities.Event;
import dev.pontin.EventClean.infra.persistence.EventEntity;
import org.springframework.stereotype.Component;

@Component
public class EventEntityMapper {

    public static Event toDomain(EventEntity entity) {
        return Event.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .capacity(entity.getCapacity())
                .identifier(entity.getIdentifier())
                .eventType(entity.getEventType())
                .eventLocal(entity.getEventLocal())
                .startDate(entity.getStartDate())
                .endDate(entity.getEndDate())
                .organizer(entity.getOrganizer())
                .build();
    }

    public static EventEntity toEntity(Event domain) {
        return EventEntity.builder()
                .id(domain.id())
                .name(domain.name())
                .description(domain.description())
                .capacity(domain.capacity())
                .identifier(domain.identifier())
                .eventType(domain.eventType())
                .eventLocal(domain.eventLocal())
                .startDate(domain.startDate())
                .endDate(domain.endDate())
                .organizer(domain.organizer())
                .build();
    }
}
