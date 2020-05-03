package com.sky7th.designpattern.abstractfactory.elevator.door;

public class HyundaiDoor extends Door {

    private HyundaiDoor() {
        super();
    }

    public static HyundaiDoor of() {
        return new HyundaiDoor();
    }

    protected void doClose() {
        System.out.println("close Hyundai Door");
    }

    protected void doOpen() {
        System.out.println("open Hyundai Door");
    }
}