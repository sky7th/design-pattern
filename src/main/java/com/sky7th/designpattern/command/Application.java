package com.sky7th.designpattern.command;

import com.sky7th.designpattern.command.button.Button;
import com.sky7th.designpattern.command.button.Command;
import com.sky7th.designpattern.command.button.alarm.Alarm;
import com.sky7th.designpattern.command.button.alarm.AlarmStartCommand;
import com.sky7th.designpattern.command.button.lamp.Lamp;
import com.sky7th.designpattern.command.button.lamp.LampOnCommand;

public class Application {

    public static void main(String... args) {

        Command lampOnCommand = new LampOnCommand(new Lamp());
        Command alarmStartCommand = new AlarmStartCommand(new Alarm());

        Button button1 = new Button(lampOnCommand);
        button1.pressed();

        Button button2 = new Button(alarmStartCommand);
        button2.pressed();

        button2.setCommand(lampOnCommand);
        button2.pressed();
    }
}
