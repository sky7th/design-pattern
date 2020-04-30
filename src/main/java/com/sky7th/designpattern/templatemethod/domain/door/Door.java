package com.sky7th.designpattern.templatemethod.domain.door;

public class Door {

    private DoorStatus doorStatus;

    private Door() { doorStatus = DoorStatus.CLOSED; }

    public static Door of() {
        return new Door();
    }

    public DoorStatus getDoorStatus() { return doorStatus; }

    public void close() { doorStatus = DoorStatus.CLOSED; }

    public void open() { doorStatus = DoorStatus.OPENED; }
}
