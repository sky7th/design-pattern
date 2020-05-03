package com.sky7th.designpattern.abstractfactory.elevator.door;

public class LgDoor extends Door {

    private LgDoor() {
        super();
    }

    public static LgDoor of() {
        return new LgDoor();
    }

    protected void doClose() {
        System.out.println("close LG Door");
    }

    protected void doOpen() {
        System.out.println("open LG Door");
    }
}