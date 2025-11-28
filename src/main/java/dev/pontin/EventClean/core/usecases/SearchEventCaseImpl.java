package dev.pontin.EventClean.core.usecases;

import dev.pontin.EventClean.core.entities.Event;
import dev.pontin.EventClean.core.gateway.EventGateway;

import java.util.List;

public class SearchEventCaseImpl implements SearchEventCase {

    private final EventGateway eventGateway;

    public SearchEventCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public List<Event> execute() {
        return eventGateway.searchEvent();
    }
}
