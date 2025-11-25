package dev.pontin.EventClean.infra.dtos.response;

import dev.pontin.EventClean.core.enums.EventType;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record EventResponse(Long id,
                            String name,
                            String description,
                            Integer capacity,
                            String identifier,
                            EventType eventType,
                            String eventLocal,
                            LocalDateTime startDate,
                            LocalDateTime endDate,
                            String organizer) {
}
