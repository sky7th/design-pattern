package com.sky7th.designpattern.abstractfactory.elevator;

import com.sky7th.designpattern.abstractfactory.elevator.door.Door;
import com.sky7th.designpattern.abstractfactory.elevator.door.LgDoor;
import com.sky7th.designpattern.abstractfactory.elevator.motor.LgMotor;
import com.sky7th.designpattern.abstractfactory.elevator.motor.Motor;

public class LGElevatorFactory extends ElevatorFactory {

    private static final ElevatorFactory INSTANCE = new LGElevatorFactory();

    private LGElevatorFactory() {}

    public static ElevatorFactory getInstance() {
        return INSTANCE;
    }

    public Motor createMotor() { return LgMotor.of(); }
    public Door createDoor() { return LgDoor.of(); }
}
