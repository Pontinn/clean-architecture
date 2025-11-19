package dev.pontin.EventClean.core.usecases;

import dev.pontin.EventClean.core.entities.Event;

public interface CreateEventCase {

    public Event execute(Event event);
}
