package com.sky7th.designpattern.strategy.people.attack;

public class FireballStrategy implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("(파이어볼을 던진다) 파이어볼! 파이어볼! 파이어볼!");
    }
}
