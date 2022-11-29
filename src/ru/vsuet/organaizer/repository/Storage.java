package ru.vsuet.organaizer.repository;

import ru.vsuet.organaizer.domain.Event;
import ru.vsuet.organaizer.domain.EventType;


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
        Event event1 = new Event(1L, "День рождения Ивана Ивановича", EventType.BirthDay,);


        Event event2 = new Event(2L, "Встреча выпускников", EventType.Meeting,);

        events.add(event1);
        events.add(event2);
    }
}
