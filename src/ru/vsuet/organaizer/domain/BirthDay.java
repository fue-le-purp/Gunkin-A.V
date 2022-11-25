package ru.vsuet.organaizer.domain;

public class BirthDay extends Event {
    public BirthDay(Long id, String name) {
        super(id, name, EventType.BirthDay);
    }

    @Override
    public String toString() {
        return "BirthDay{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
