package ru.vsuet.organaizer.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Event {

    protected Long id;
    protected String name;
    protected EventType type;

    protected Date date;

    public Event(Long id, String name, EventType type, String date) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.date = parse(date);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public EventType getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", date=" + date +
                '}';
    }

    private Date parse(String date){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");


        try {
            return formatter.parse(date);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Я не могу выполнить этот запрос "+e.getMessage());
        }
    }
}