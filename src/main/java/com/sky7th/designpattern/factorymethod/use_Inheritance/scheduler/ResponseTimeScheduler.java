package com.sky7th.designpattern.factorymethod.use_Inheritance.scheduler;

import com.sky7th.designpattern.factorymethod.use_Inheritance.elevator.Direction;
import com.sky7th.designpattern.factorymethod.use_Inheritance.elevator.ElevatorManager_TemplateMethod;

public class ResponseTimeScheduler implements ElevatorScheduler_TemplateMethod {
    private static final ElevatorScheduler_TemplateMethod INSTANCE = new ResponseTimeScheduler();

    private ResponseTimeScheduler() {}

    public static ElevatorScheduler_TemplateMethod getInstance() {
        return INSTANCE;
    }

    @Override
    public int selectElevator(ElevatorManager_TemplateMethod manager, int destination, Direction direction) {
        return 1; // 임의로 선택함
    }
}