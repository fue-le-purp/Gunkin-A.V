package ru.vsuet.organaizer.domain;

import java.time.LocalDate;

public class Meetings {
    private Long id;
    private String name;
    private LocalDate createdAt;

    public Meetings(Long id, String name) {
        this.id = id;
        this.name = name;
        this.createdAt = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Meetings{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
