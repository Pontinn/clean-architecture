package dev.pontin.EventClean.core.usecases;

import dev.pontin.EventClean.core.entities.Event;
import dev.pontin.EventClean.core.gateway.EventGateway;

public class CreateEventCaseImpl implements CreateEventCase {

    private final EventGateway eventGateway;

    public CreateEventCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(Event event) {
        return eventGateway.createEvent(event);
    }
}
