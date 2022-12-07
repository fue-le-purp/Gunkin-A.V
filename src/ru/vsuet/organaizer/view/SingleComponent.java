package ru.vsuet.organaizer.view;


import ru.vsuet.organaizer.domain.Event;
import ru.vsuet.organaizer.service.Service;

import java.util.Scanner;

public class SingleComponent extends AbstractComponent<Void> {

    public SingleComponent(Service<Event> service) {
        super(ComponentType.SINGLE, service);
    }

    @Override
    public void draw() {

        System.out.println("Введите ID объекта:");
        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();
        Event event = service.getById(id);
        System.out.print(event);




    }
}