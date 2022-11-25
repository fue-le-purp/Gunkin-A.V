package ru.vsuet.organaizer.domain;

public class Meeting extends Event {
    public Meeting(Long id, String name) {
        super(id, name, EventType.Meeting);
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
