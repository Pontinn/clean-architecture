package dev.pontin.EventClean.infra.gateway;

import dev.pontin.EventClean.core.entities.Event;
import dev.pontin.EventClean.core.gateway.EventGateway;
import dev.pontin.EventClean.infra.mapper.EventEntityMapper;
import dev.pontin.EventClean.infra.persistence.EventEntity;
import dev.pontin.EventClean.infra.persistence.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EventRepositoryGateway implements EventGateway {

    private final EventRepository eventRepository;

    @Override
    public Event createEvent(Event event) {
        EventEntity entity = EventEntityMapper.toEntity(event);
        EventEntity saved = eventRepository.save(entity);
        return EventEntityMapper.toDomain(saved);
    }

    @Override
    public List<Event> searchEvent() {
        List<EventEntity> entityList = eventRepository.findAll();

        return entityList.stream()
                .map(EventEntityMapper::toDomain)
                .toList();
    }
}
