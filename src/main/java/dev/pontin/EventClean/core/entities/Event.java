package dev.pontin.EventClean.core.entities;

import dev.pontin.EventClean.core.enums.EventType;

import java.time.LocalDateTime;

public record Event(Long id,
                    String name,
                    String description,
                    Integer capacity,
                    String identifier,
                    EventType eventType,
                    String local,
                    LocalDateTime startDate,
                    LocalDateTime endDate,
                    String organizer) {
}
