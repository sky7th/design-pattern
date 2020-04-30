package com.sky7th.designpattern.strategy.people;

public class Warrior extends People {

    private Warrior(String name) {
        super(name);
    }

    public static Warrior of(String name) {
        return new Warrior(name);
    }
}
