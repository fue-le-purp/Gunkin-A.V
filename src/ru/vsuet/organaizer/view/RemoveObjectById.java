package ru.vsuet.organaizer.view;

import ru.vsuet.organaizer.domain.Event;
import ru.vsuet.organaizer.service.Service;

import java.util.Scanner;

public class RemoveObjectById extends AbstractComponent<Event> {
    public RemoveObjectById( Service<Event> service) {
        super(ComponentType.REMOVE, service);
    }

    @Override
    public void draw() {
        System.out.println("Введите ID объекта:");
        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();
        service.removeById(id);;
        System.out.println( id + " Удалено успешно");
    }
}
