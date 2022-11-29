package ru.vsuet.organaizer;

import ru.vsuet.organaizer.domain.Event;
import ru.vsuet.organaizer.service.EventService;
import ru.vsuet.organaizer.service.Service;
import ru.vsuet.organaizer.view.Component;
import ru.vsuet.organaizer.view.ComponentFabric;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service<Event> service = new EventService();
        ComponentFabric fabric = new ComponentFabric();
        System.out.println("------- 0 - menu -----------");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int command = scanner.nextInt();
            Component component = fabric.build(command, service);
            if (component == null) {
                return;
            }
            component.draw();
        }
    }
}
