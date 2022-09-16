package ru.vsuet.organaizer;

import ru.vsuet.organaizer.domain.Event;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Event event1 = new Event();
        event1.setName("BirthDay");
        event1.setCreatedAt(LocalDateTime.now());
        System.out.println(event1);
    }

}
