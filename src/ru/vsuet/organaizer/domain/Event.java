package ru.vsuet.organaizer.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Event {

    protected Long id;
    protected String name;
    protected EventType type;

    public Event(Long id, String name, EventType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public EventType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}