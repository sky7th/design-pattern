package com.sky7th.designpattern.command.button.lamp;

import com.sky7th.designpattern.command.button.Command;

public class LampOnCommand implements Command {

    private Lamp theLamp;

    public LampOnCommand(Lamp theLamp) {
        this.theLamp = theLamp;
    }

    public void execute() {
        theLamp.turnOn();
    }
}
