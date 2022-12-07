package ru.vsuet.organaizer.view;

import java.util.Arrays;

public enum ComponentType {

    MENU(0, " - меню"),
    LIST(1, " - лист объектов"),
    SINGLE(2, " - получить объект по ID"),
    REMOVE(3, " - удалить оъект по ID"),
    ADDBIRTHDAY(4, " - добавить день рождения"),
    ADDMEETING (5," - добавить встречу");



    private final int type;
    private final String comment;

    ComponentType(int type, String comment) {
        this.type = type;
        this.comment = comment;
    }

    public int getType() {
        return type;
    }

    public String getComment() {
        return comment;
    }

    public static ComponentType fromType(int type) {
        return Arrays.stream(values())
                .filter(v -> v.type == type)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Type not match: " + type));
    }
}