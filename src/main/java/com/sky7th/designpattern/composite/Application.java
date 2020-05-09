package com.sky7th.designpattern.composite;

import com.sky7th.designpattern.composite.computer.device.Body;
import com.sky7th.designpattern.composite.computer.Computer;
import com.sky7th.designpattern.composite.computer.device.Keyboard;
import com.sky7th.designpattern.composite.computer.device.Monitor;

public class Application {

    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard(5, 2);
        Body body = new Body(100, 70);
        Monitor monitor = new Monitor(20, 30);

        Computer computer = new Computer();
        computer.addComponent(keyboard);
        computer.addComponent(body);
        computer.addComponent(monitor);

        System.out.println("Computer Price: " + computer.getPrice() + "만원");
        System.out.println("Computer Power: " + computer.getPower() + "W");
    }
}
