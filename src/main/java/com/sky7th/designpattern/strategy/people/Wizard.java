package com.sky7th.designpattern.strategy.people;

public class Wizard extends People {

    private Wizard(String name) {
        super(name);
    }

    public static Wizard of(String name) {
        return new Wizard(name);
    }
}
