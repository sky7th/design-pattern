package com.sky7th.designpattern.strategy.people.attack;

public class SwordStrategy implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("(칼로 벤다) 스겅! 스겅! 스겅!");
    }
}
