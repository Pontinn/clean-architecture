package dev.pontin.EventClean.core.usecases;

import dev.pontin.EventClean.core.entities.Event;

import java.util.List;

public interface SearchEventCase {

    List<Event> execute();
}
