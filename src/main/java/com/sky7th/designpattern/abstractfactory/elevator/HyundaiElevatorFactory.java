package com.sky7th.designpattern.abstractfactory.elevator;

import com.sky7th.designpattern.abstractfactory.elevator.door.Door;
import com.sky7th.designpattern.abstractfactory.elevator.door.HyundaiDoor;
import com.sky7th.designpattern.abstractfactory.elevator.motor.HyundaiMotor;
import com.sky7th.designpattern.abstractfactory.elevator.motor.Motor;

public class HyundaiElevatorFactory extends ElevatorFactory {

    private static final HyundaiElevatorFactory INSTANCE = new HyundaiElevatorFactory();

    private HyundaiElevatorFactory() {};

    public static ElevatorFactory getInstance() {
        return INSTANCE;
    }

    public Motor createMotor() { return HyundaiMotor.of(); }
    public Door createDoor() { return HyundaiDoor.of(); }
}
