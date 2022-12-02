package ru.vsuet.organaizer.view;

import java.util.Arrays;

public class MenuComponent extends AbstractComponent<Void> {

    public MenuComponent() {
        super(ComponentType.MENU, null);
    }

    @Override
    public void draw() {
        drawMenu();
    }

    private void drawMenu() {
        System.out.println("**** МЕНЮ *****");
        Arrays.stream(ComponentType.values())
                .forEach(t -> System.out.println(t.getType() + "" + t.getComment()));
        System.out.println("9 - выход");
        System.out.println("---------------");
    }
}