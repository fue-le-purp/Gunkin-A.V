package ru.vsuet.organaizer.domain;

public class Meeting extends Event {
    public Meeting(Long id, String name,String date) {
        super(id, name, EventType.Meeting,date);
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", date=" + date +
                '}';
    }
}

