package ru.vsuet.organaizer;

import ru.vsuet.organaizer.domain.Event;
import ru.vsuet.organaizer.domain.EventType;
//import ru.vsuet.organaizer.domain.Meetings;

public class Main {
    public static void main(String[] args) {
        Event event = new Event(1L, EventType.BirthDay,"Иван");
        System.out.println(event.toString());
    }
}
