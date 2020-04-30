package com.sky7th.designpattern.templatemethod.domain.motor;

import com.sky7th.designpattern.templatemethod.domain.door.Door;

public class LgMotor extends Motor {

    private static final double BOOST_MOTOR_SPEED_REDUCE_RATE = 0.2;
    private static final double BOOST_MOTOR_TEMPERATURE_REDUCE_RATE = 0.5;

    private LgMotor(Door door) {
        super(door);
    }

    public static LgMotor of(Door door) {
        return new LgMotor(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        hyundaiSecretTech();
    }

    private void hyundaiSecretTech() {
        System.out.println("엘지 모터만의 비장의 기술 발동 !");
        smoothMotor();
    }

    private void smoothMotor() {
        System.out.println("비밀 기술 smooth motor 발동");
        speedUpMotor();
        relaxMotor();
        System.out.println(String.format("속도: %s, 온도: %s", super.getSpeed(), super.getTemperature()));
    }

    private void relaxMotor() {
        System.out.println(String.format("모터의 온도가 %s배 낮아집니다.", BOOST_MOTOR_TEMPERATURE_REDUCE_RATE));
        super.setTemperature(super.getTemperature() * (1 - BOOST_MOTOR_TEMPERATURE_REDUCE_RATE));
    }

    private void speedUpMotor() {
        System.out.println(String.format("모터의 속도가 %s배 느려집니다.", BOOST_MOTOR_SPEED_REDUCE_RATE));
        super.setSpeed(super.getSpeed() * (1 - BOOST_MOTOR_SPEED_REDUCE_RATE));
    }
}
