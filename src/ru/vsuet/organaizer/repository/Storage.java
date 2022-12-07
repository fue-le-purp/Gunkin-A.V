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

        Event event3 = new Meeting(3L, "Подписание договоров", "2022-12-12" );

        Event event4 = new BirthDay(4L, "День рождения Василия Василиевича", "1988-04-09");

        Event event5 = new Meeting(5L, "Собрание директоров", "2022-02-01" );

        Event event6 = new BirthDay(6L, "День рождения Михаила Михайловича", "1975-09-03");

        Event event7 = new Meeting(7L, "Школьное собрание ", "2022-01-01" );

        Event event8 = new BirthDay(8L, "День рождения Степана Степановича", "1995-01-01");

        Event event9 = new Meeting(9L, "Благотворительная встреча", "2022-12-08" );

        Event event10 = new BirthDay(10L, "День рождения Анатолия Анатолиевича", "1980-03-08");

        events.add(event1);
        events.add(event2);
        events.add(event3);
        events.add(event4);
        events.add(event5);
        events.add(event6);
        events.add(event7);
        events.add(event8);
        events.add(event9);
        events.add(event10);
    }
}
