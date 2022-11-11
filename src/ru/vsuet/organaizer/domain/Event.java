package ru.vsuet.organaizer.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Event {
    private Long id;
    private String name;
    private LocalDate createdAt;
    private EventType eventType;
    private List<Event> eventsList;

    public Event(Long id, EventType type, String name) {
        this.id = id;
        this.name = name;
        this.eventType = type;
        this.createdAt = LocalDate.now();
        this.eventsList = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "BirthDay{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
