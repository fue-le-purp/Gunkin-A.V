package ru.vsuet.organaizer.repository;

import ru.vsuet.organaizer.domain.Event;

import java.util.ArrayList;
import java.util.List;

public class InMemoryEventRepository implements Repository<Event> {

    private final List<Event> events;

    public InMemoryEventRepository() {
        this.events = Storage.getInstance().events;
    }

    @Override
    public Event find(Long id) {
        return events.stream()
                .filter(c -> id.equals(c.getId()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void add(Event source) {
        events.add(source);
    }

    @Override
    public void remove(Event target) {
        events.removeIf
                (c -> target.getId().equals(c.getId()));
    }

    @Override
    public List<Event> list() {
        return new ArrayList<>(events);
    }
}