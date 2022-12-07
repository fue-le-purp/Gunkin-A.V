package ru.vsuet.organaizer.domain;

public class BirthDay extends Event {
    public BirthDay(Long id, String name, String date) {
        super(id, name, EventType.BirthDay, date);
    }

    @Override
    public String toString() {
        return "BirthDay{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", date=" + date +
                '}';
    }
}

