package dev.pontin.EventClean.infra.beans;
// Em um projeto Spring, seria algo assim:

import dev.pontin.EventClean.core.gateway.EventGateway;
import dev.pontin.EventClean.core.usecases.CreateEventCase;
import dev.pontin.EventClean.core.usecases.CreateEventCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventBeanConfiguration {

    @Bean
    public CreateEventCase createEventCase(EventGateway eventGateway) {
        return new CreateEventCaseImpl(eventGateway);
    }
}
