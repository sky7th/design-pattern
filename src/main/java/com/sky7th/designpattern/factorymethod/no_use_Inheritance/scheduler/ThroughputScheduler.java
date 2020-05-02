package com.sky7th.designpattern.factorymethod.no_use_Inheritance.scheduler;

import com.sky7th.designpattern.factorymethod.no_use_Inheritance.elevator.Direction;
import com.sky7th.designpattern.factorymethod.no_use_Inheritance.elevator.ElevatorManager;

public class ThroughputScheduler implements ElevatorScheduler {
    private static ElevatorScheduler INSTANCE = new ThroughputScheduler();

    private ThroughputScheduler() {}

    public static ElevatorScheduler getInstance() {
        return INSTANCE;
    }
    public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
        return 0; // 임의로 선택함
    }
}