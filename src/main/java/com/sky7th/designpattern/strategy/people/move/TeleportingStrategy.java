package com.sky7th.designpattern.strategy.people.move;

public class TeleportingStrategy implements MovingStrategy {

    @Override
    public void move() {
        System.out.println("(텔레포트 한다) 슝! 슝! 슝!...");
    }
}
