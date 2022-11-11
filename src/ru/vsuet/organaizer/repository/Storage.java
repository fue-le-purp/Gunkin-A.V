package ru.vsuet.organaizer.repository;

import ru.vsuet.organaizer.domain.Event;

import java.util.List;

public class Storage {
    private static Storage instance;
    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }
    List<Event> events;

    }
