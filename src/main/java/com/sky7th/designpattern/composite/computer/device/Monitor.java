package com.sky7th.designpattern.composite.computer.device;

import com.sky7th.designpattern.composite.computer.ComputerDevice;

public class Monitor extends ComputerDevice {

    private int price;
    private int power;

    public Monitor(int power, int price) {
        this.power = power;
        this.price = price;
    }

    public int getPrice() { return price; }
    public int getPower() { return power; }
}
