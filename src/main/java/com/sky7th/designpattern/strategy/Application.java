package com.sky7th.designpattern.strategy;

import com.sky7th.designpattern.strategy.people.Warrior;
import com.sky7th.designpattern.strategy.people.Wizard;
import com.sky7th.designpattern.strategy.people.attack.FireballStrategy;
import com.sky7th.designpattern.strategy.people.attack.SwordStrategy;
import com.sky7th.designpattern.strategy.people.move.TeleportingStrategy;
import com.sky7th.designpattern.strategy.people.move.WalkingStrategy;

public class Application {

    public static void main(String... args) {
        Warrior warrior = Warrior.of("전설의소드마스터");

        warrior.setMovingStrategy(new WalkingStrategy());
        warrior.setAttackStrategy(new SwordStrategy());

        Wizard wizard = Wizard.of("vv지존법사12vv");
        wizard.setMovingStrategy(new TeleportingStrategy());
        wizard.setAttackStrategy(new FireballStrategy());

        warrior.move();
        warrior.attack();

        wizard.move();
        wizard.attack();
    }
}
