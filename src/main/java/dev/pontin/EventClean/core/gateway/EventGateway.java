package dev.pontin.EventClean.core.gateway;

import dev.pontin.EventClean.core.entities.Event;

public interface EventGateway {

    Event createEvent(Event event);
}
