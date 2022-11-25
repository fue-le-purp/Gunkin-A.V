package ru.vsuet.organaizer.repository;

import ru.vsuet.organaizer.domain.Event;
import ru.vsuet.organaizer.domain.Item;

import java.util.ArrayList;
import java.util.List;

class Storage {

    private static Storage instance;

    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    List<Event> events;

    private Storage() {
        this.events = new ArrayList<>();
        init();
    }

    private void init() {
        Event event1 = new Event(1L, "event 1");
        Item item1 = new Item(1L, "Item 1");
        event1.addItem(item1);

        Event event2 = new Event(2L, "event 2");

        events.add(event1);
        events.add(event2);
    }
}
