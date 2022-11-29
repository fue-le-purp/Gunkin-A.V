package ru.vsuet.organaizer.view;



public class SingleComponent extends AbstractComponent<Void> {

    public SingleComponent() {
        super(ComponentType.SINGLE, null);
    }

    @Override
    public void draw() {
        System.out.println("Enter object ID:");
        service.getById().


    }
}