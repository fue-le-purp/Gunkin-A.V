package ru.vsuet.organaizer.repository;


import ru.vsuet.organaizer.domain.Event;

import java.util.List;

public class InMemoryEventRepository implements Repository<Event> {

   private final List<Event> events;

    public InMemoryEventRepository() {
        this.events = Storage.getInstance().events;
    }

    @Override
    public Event find(Long id) {
        return events.stream().filter(e ->id.equals(e.getId()) );
    }

    @Override
    public void add(Event source) {

    }

    @Override
    public void remove(Event target) {

    }

    @Override
    public List<Event> list() {
        return null;
    }
}
