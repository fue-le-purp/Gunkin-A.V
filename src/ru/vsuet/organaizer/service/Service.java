package ru.vsuet.organaizer.service;

import ru.vsuet.organaizer.domain.Event;

import java.util.List;

public interface Service<T> {

    Event getById(Long id);

    List<T> getAll();

    void removeById(Long id);
}