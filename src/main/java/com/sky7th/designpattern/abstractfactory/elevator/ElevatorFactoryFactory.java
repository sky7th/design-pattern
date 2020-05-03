package com.sky7th.designpattern.abstractfactory.elevator;

public class ElevatorFactoryFactory {

    public static ElevatorFactory getFectory(Vendor vendor) {
        ElevatorFactory factory = null;

        switch (vendor) {
            case LG:
                factory = LGElevatorFactory.getInstance();
                break;
            case HYUNDAI:
                factory = HyundaiElevatorFactory.getInstance();
                break;
        }
        return factory;
    }
}
