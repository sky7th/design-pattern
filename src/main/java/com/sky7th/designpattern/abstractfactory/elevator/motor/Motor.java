package com.sky7th.designpattern.abstractfactory.elevator.motor;

import com.sky7th.designpattern.abstractfactory.elevator.door.Door;
import com.sky7th.designpattern.abstractfactory.elevator.door.DoorStatus;

public abstract class Motor {

    private Door door;
    private MotorStatus motorStatus;
    private double speed;
    private double temperature;

    Motor() {
        stop();
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public MotorStatus getMotorStatus() {
        return this.motorStatus;
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    double getSpeed() {
        return this.speed;
    }

    void setSpeed(double speed) {
        this.speed = speed;
    }

    double getTemperature() {
        return this.temperature;
    }

    void setTemperature(double amount) {
        this.temperature = amount;
    }

    public void move(Direction direction) {
        if (this.motorStatus == MotorStatus.MOVING)
            return;

        if (this.door.getDoorStatus() == DoorStatus.OPENED)
            this.door.close();

        start();

        moveMotor(direction);

        setMotorStatus(MotorStatus.MOVING);
    }

    private void start() {
        System.out.println("시동 걸기");
        setSpeed(50.0);
        setTemperature(30.0);
        System.out.println(String.format("속도: %s, 온도: %s", this.speed, this.temperature));
    }

    private void stop() {
        System.out.println("멈추기");
        setSpeed(0.0);
        setTemperature(0.0);
        motorStatus = MotorStatus.STOPPED;
        System.out.println(String.format("속도: %s, 온도: %s", this.speed, this.temperature));
    }

    abstract void moveMotor(Direction direction);
}
