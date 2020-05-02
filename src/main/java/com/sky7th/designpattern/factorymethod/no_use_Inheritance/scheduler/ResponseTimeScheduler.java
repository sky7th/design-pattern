package com.sky7th.designpattern.factorymethod.no_use_Inheritance.scheduler;

import com.sky7th.designpattern.factorymethod.no_use_Inheritance.elevator.Direction;
import com.sky7th.designpattern.factorymethod.no_use_Inheritance.elevator.ElevatorManager;

public class ResponseTimeScheduler implements ElevatorScheduler {
    private static final ElevatorScheduler INSTANCE = new ResponseTimeScheduler();

    private ResponseTimeScheduler() {}

    public static ElevatorScheduler getInstance() {
        return INSTANCE;
    }
    public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
        return 1; // 임의로 선택함
    }
}