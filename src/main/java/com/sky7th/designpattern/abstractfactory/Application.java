package com.sky7th.designpattern.abstractfactory;

import com.sky7th.designpattern.abstractfactory.elevator.*;
import com.sky7th.designpattern.abstractfactory.elevator.door.Door;
import com.sky7th.designpattern.abstractfactory.elevator.motor.Direction;
import com.sky7th.designpattern.abstractfactory.elevator.motor.Motor;

public class Application {

    public static void main(String... args) {
        String vendorName = args[0];
        Vendor vendor;

        if(vendorName.equalsIgnoreCase("LG"))
            vendor = Vendor.LG;
        else
            vendor = Vendor.HYUNDAI;

        ElevatorFactory factory = ElevatorFactoryFactory.getFectory(vendor);

        Door door = factory.createDoor();
        Motor motor = factory.createMotor();
        motor.setDoor(door);

        door.open();
        motor.move(Direction.UP);
    }
}
