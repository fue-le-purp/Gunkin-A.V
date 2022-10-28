package ru.vsuet.organaizer;

import ru.vsuet.organaizer.domain.Events;
import ru.vsuet.organaizer.domain.EventType;
//import ru.vsuet.organaizer.domain.Meetings;

public class Main {
    public static void main(String[] args) {
        Events event = new Events(1L, EventType.BirthDay,"Иван");
        System.out.println(event.toString());
    }
}
