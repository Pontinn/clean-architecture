package dev.pontin.EventClean.infra.dtos.request;

import dev.pontin.EventClean.core.enums.EventType;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record EventRequest(String name,
                           String description,
                           Integer capacity,
                           String identifier,
                           EventType eventType,
                           String eventLocal,
                           LocalDateTime startDate,
                           LocalDateTime endDate,
                           String organizer) {
}
