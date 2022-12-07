package ru.vsuet.organaizer.view;

import ru.vsuet.organaizer.domain.Event;
import ru.vsuet.organaizer.service.Service;

public abstract class AbstractComponent<T> implements Component {

    protected ComponentType type;
    protected final Service<T> service;

    public AbstractComponent(ComponentType type, Service<Event> service) {
        this.type = type;
        this.service = (Service<T>) service;
    }

    public ComponentType getType() {
        return type;
    }
}
