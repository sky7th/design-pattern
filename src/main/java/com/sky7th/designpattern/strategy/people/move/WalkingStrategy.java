package com.sky7th.designpattern.strategy.people.move;

public class WalkingStrategy implements MovingStrategy {

    @Override
    public void move() {
        System.out.println("(걷는다) 뚜벅, 뚜벅, 뚜벅, 뚜벅...");
    }
}
