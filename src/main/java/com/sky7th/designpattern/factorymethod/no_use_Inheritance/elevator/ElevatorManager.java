package com.sky7th.designpattern.factorymethod.no_use_Inheritance.elevator;

import com.sky7th.designpattern.factorymethod.no_use_Inheritance.scheduler.ElevatorScheduler;
import com.sky7th.designpattern.factorymethod.no_use_Inheritance.scheduler.SchedulerFactory;
import com.sky7th.designpattern.factorymethod.no_use_Inheritance.scheduler.SchedulingStrategy;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
    private List<ElevatorController> controllers;
    private SchedulingStrategy strategy;

    private ElevatorManager(int controllerCount, SchedulingStrategy strategy) {
        controllers = new ArrayList<>(controllerCount);
        for (int i = 0; i < controllerCount; i++) {
            controllers.add(ElevatorController.of(i + 1));
        }
        this.strategy = strategy;
    }

    public static ElevatorManager of(int controllerCount, SchedulingStrategy strategy) {
        return new ElevatorManager(controllerCount, strategy);
    }

    public void setStrategy(SchedulingStrategy strategy) {
        this.strategy = strategy;
    }

    public void requestElevator(int destination, Direction direction) {
        ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategy);
        System.out.println(scheduler);

        int selectedElevator = scheduler.selectElevator(this, destination, direction);

        controllers.get(selectedElevator).gotoFloor(destination);
    }
}