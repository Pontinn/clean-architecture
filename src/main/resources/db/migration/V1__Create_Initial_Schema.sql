CREATE TABLE tb_events(
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    capacity INTEGER NOT NULL,
    identifier VARCHAR(255) NOT NULL UNIQUE,
    event_type VARCHAR(20) NOT NULL,
    event_local VARCHAR(255) NOT NULL,
    start_date TIMESTAMP NOT NULL,
    end_date TIMESTAMP NOT NULL,
    organizer VARCHAR(255) NOT NULL
    )