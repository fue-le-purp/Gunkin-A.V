package ru.vsuet.organaizer.view;

import ru.vsuet.organaizer.domain.Event;
import ru.vsuet.organaizer.service.Service;

public class ObjectsListComponent<T> extends AbstractComponent<Event> {

    public ObjectsListComponent(Service<Event> service) {
        super(ComponentType.LIST, service);
    }

    @Override
    public void draw() {
        System.out.println("Лист объектов:");
        service.getAll().forEach(System.out::println);
    }
}