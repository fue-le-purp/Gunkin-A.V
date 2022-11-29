package ru.vsuet.organaizer.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event {

    protected Long id;
    protected String name;
    protected EventType type;

    protected Date EventDate;

    public Event(Long id, String name, EventType type,Date date) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.EventDate = date;
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

    public Date getEventDate() {
        return EventDate;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", EventDate=" + EventDate +
                '}';
    }
}
