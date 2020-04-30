package com.sky7th.designpattern.templatemethod.domain.motor;

import com.sky7th.designpattern.templatemethod.domain.door.Door;

public class HyundaiMotor extends Motor {

    private static final double BOOST_MOTOR_SPEED_ASCENT_RATE = 3.0;
    private static final double BOOST_MOTOR_TEMPERATURE_ASCENT_RATE = 3.0;

    private HyundaiMotor(Door door) {
        super(door);
    }

    public static HyundaiMotor of(Door door) {
        return new HyundaiMotor(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        hyundaiSecretTech();
    }

    private void hyundaiSecretTech() {
        System.out.println("현대 모터만의 비장의 기술 발동 !");
        boostMotor();
    }

    private void boostMotor() {
        System.out.println("비밀 기술 boost motor 발동");
        speedUpMotor();
        hotMotor();
        System.out.println(String.format("속도: %s, 온도: %s", super.getSpeed(), super.getTemperature()));
    }

    private void hotMotor() {
        System.out.println(String.format("모터의 온도가 %s배 뜨거워집니다.", BOOST_MOTOR_TEMPERATURE_ASCENT_RATE));
        super.setTemperature(super.getTemperature() * BOOST_MOTOR_TEMPERATURE_ASCENT_RATE);
    }

    private void speedUpMotor() {
        System.out.println(String.format("모터의 속도가 %s배 빨라집니다.", BOOST_MOTOR_SPEED_ASCENT_RATE));
        super.setSpeed(super.getSpeed() * BOOST_MOTOR_SPEED_ASCENT_RATE);
    }
}
