package ru.vsuet.organaizer.repository;

import ru.vsuet.organaizer.domain.BirthDay;
import ru.vsuet.organaizer.domain.Event;
import ru.vsuet.organaizer.domain.EventType;
import ru.vsuet.organaizer.domain.Meeting;


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
        Event event1 = new Meeting(1L, "Встреча выпускников", "2022-12-05" );


        Event event2 = new BirthDay(2L, "День рождения Ивана Ивановича", "1999-08-04");

        events.add(event1);
        events.add(event2);
    }
}
