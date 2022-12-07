package ru.vsuet.organaizer.view;

import ru.vsuet.organaizer.domain.Event;
import ru.vsuet.organaizer.service.Service;

import java.util.HashMap;
import java.util.Map;

public class ComponentFabric {

    private final Map<ComponentType, Component> components;

    public ComponentFabric() {
        this.components = new HashMap<>();
    }

    public <T> Component build(int type, Service<T> service) {
        try {
            ComponentType componentType = ComponentType.fromType(type);
            return components.computeIfAbsent(componentType, (ct) -> {
                Component component = null;
                Service<Event> Event;
                switch (componentType) {
                    case MENU -> component = new MenuComponent();
                    case LIST -> component = new ObjectsListComponent<>((Service<Event>) service);
                    case SINGLE -> component = new SingleComponent((Service< Event >) service);
                    case REMOVE -> component = new RemoveObjectById((Service< Event >) service);
                    case ADDBIRTHDAY -> component = new AddBirthday<>(service);
                    case ADDMEETING -> component = new AddMeeting<>(service);


                    default -> component = null;
                }
                return component;
            });
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}