package com.sky7th.designpattern.abstractfactory.elevator.door;

public abstract class Door {

    private DoorStatus doorStatus;

    protected Door() {
        doorStatus = DoorStatus.CLOSED;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }


    protected abstract void doClose();

    public void close() {
        if(doorStatus == DoorStatus.CLOSED)
            return;

        doClose();
        doorStatus = DoorStatus.CLOSED;
    }

    protected abstract void doOpen();

    public void open() {
        if(doorStatus == DoorStatus.OPENED)
            return;

        doOpen();
        doorStatus = DoorStatus.OPENED;
    }
}
