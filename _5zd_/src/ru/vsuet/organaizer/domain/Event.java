package ru.vsuet.organaizer.domain;

import java.time.LocalDateTime;

public class Event {
    private String name;
    private LocalDateTime createdAt;

    public Event() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    public Event(String name) {
        this();
        this.name = name;
    }

}



