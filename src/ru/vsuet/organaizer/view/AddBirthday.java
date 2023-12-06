package ru.vsuet.organaizer.view;

import ru.vsuet.organaizer.domain.BirthDay;
import ru.vsuet.organaizer.domain.Event;
import ru.vsuet.organaizer.domain.Meeting;
import ru.vsuet.organaizer.service.Service;

import java.util.Scanner;

public class AddBirthday<T> extends AbstractComponent<T> {
    public AddBirthday(Service<T> service) {
        super(ComponentType.ADDBIRTHDAY, (Service<Event>) service);
    }

    @Override
    public void draw() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ID: ");
        Long id = scanner.nextLong();
        System.out.println("Название события: ");
        String name = scanner.nextLine();
        name = scanner.nextLine();
        Scanner in = new Scanner(System.in);
        System.out.print("Веедите дату в данном формате(гггг-мм-дд): ");
        String date = in.nextLine();

        Event event = new BirthDay(id, name , date );
        System.out.println(event);
        service.addEvent(event);
        System.out.println("Событе было успешно добавлено");


    }
}