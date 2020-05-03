package com.sky7th.designpattern.abstractfactory.elevator;

import com.sky7th.designpattern.abstractfactory.elevator.door.Door;
import com.sky7th.designpattern.abstractfactory.elevator.motor.Motor;

public abstract class ElevatorFactory {

    public abstract Motor createMotor();
    public abstract Door createDoor();
}