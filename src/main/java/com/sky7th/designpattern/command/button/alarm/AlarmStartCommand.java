package com.sky7th.designpattern.command.button.alarm;

import com.sky7th.designpattern.command.button.Command;

public class AlarmStartCommand implements Command {

    private Alarm theAlarm;

    public AlarmStartCommand(Alarm theAlarm) {
        this.theAlarm = theAlarm;
    }

    public void execute() {
        theAlarm.start();
    }
}
