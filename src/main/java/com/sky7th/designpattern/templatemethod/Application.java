package com.sky7th.designpattern.templatemethod;

import com.sky7th.designpattern.templatemethod.domain.door.Door;
import com.sky7th.designpattern.templatemethod.domain.motor.Direction;
import com.sky7th.designpattern.templatemethod.domain.motor.HyundaiMotor;
import com.sky7th.designpattern.templatemethod.domain.motor.LgMotor;

public class Application {

    public static void main(String... args) {
        System.out.println("----------------Hyundai Motor--------------");
        HyundaiMotor hyundaiMotor = HyundaiMotor.of(Door.of());
        hyundaiMotor.move(Direction.UP);

        System.out.println("---------------Lg Motor---------------");
        LgMotor lgMotor = LgMotor.of(Door.of());
        lgMotor.move(Direction.DOWN);
    }
}
