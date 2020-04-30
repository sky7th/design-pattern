package com.sky7th.designpattern.strategy.people;

import com.sky7th.designpattern.strategy.people.attack.AttackStrategy;
import com.sky7th.designpattern.strategy.people.move.MovingStrategy;

public abstract class People {

    private String name;
    private AttackStrategy attackStrategy;
    private MovingStrategy movingStrategy;

    People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attack() {
        System.out.println(String.format("%s 님이 공격합니다.", this.name));
        attackStrategy.attack();
    }

    public void move() {
        System.out.println(String.format("%s 님이 움직입니다.", this.name));
        movingStrategy.move();
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }
}
