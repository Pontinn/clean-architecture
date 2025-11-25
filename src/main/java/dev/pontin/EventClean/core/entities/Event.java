package dev.pontin.EventClean.core.entities;

import dev.pontin.EventClean.core.enums.EventType;

import java.time.LocalDateTime;

public record Event(Long id,
                    String name,
                    String description,
                    Integer capacity,
                    String identifier,
                    EventType eventType,
                    String eventLocal,
                    LocalDateTime startDate,
                    LocalDateTime endDate,
                    String organizer) {

    public static EventBuilder builder() {
        return new EventBuilder();
    }

    public static class EventBuilder {
        private Long id;
        private String name;
        private String description;
        private Integer capacity;
        private String identifier;
        private EventType eventType;
        private String eventLocal;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
        private String organizer;

        public EventBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public EventBuilder name(String name) {
            this.name = name;
            return this;
        }

        public EventBuilder description(String description) {
            this.description = description;
            return this;
        }

        public EventBuilder capacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public EventBuilder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        public EventBuilder eventType(EventType eventType) {
            this.eventType = eventType;
            return this;
        }

        public EventBuilder eventLocal(String eventLocal) {
            this.eventLocal = eventLocal;
            return this;
        }

        public EventBuilder startDate(LocalDateTime startDate) {
            this.startDate = startDate;
            return this;
        }

        public EventBuilder endDate(LocalDateTime endDate) {
            this.endDate = endDate;
            return this;
        }

        public EventBuilder organizer(String organizer) {
            this.organizer = organizer;
            return this;
        }

        public Event build() {
            return new Event(id, name, description, capacity, identifier, eventType, eventLocal, startDate, endDate, organizer);
        }
    }
}
