package dev.pontin.EventClean.core.usecases;

import dev.pontin.EventClean.core.entities.Event;

public interface CreateEventCase {

    Event execute(Event event);
}
