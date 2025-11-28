package dev.pontin.EventClean.core.gateway;

import dev.pontin.EventClean.core.entities.Event;

import java.util.List;

public interface EventGateway {

    Event createEvent(Event event);

    List<Event> searchEvent();
}
