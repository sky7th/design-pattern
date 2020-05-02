package com.sky7th.designpattern.factorymethod.use_Inheritance.elevator;

import com.sky7th.designpattern.factorymethod.use_Inheritance.scheduler.ElevatorScheduler_TemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class ElevatorManager_TemplateMethod {
    private List<ElevatorController> controllers;

    ElevatorManager_TemplateMethod(int controllerCount) {
        controllers = new ArrayList<>(controllerCount);
        for (int i = 0; i < controllerCount; i++) {
            controllers.add(ElevatorController.of(i + 1));
        }
    }

    abstract ElevatorScheduler_TemplateMethod getScheduler();

    public void requestElevator(int destination, Direction direction) {
        ElevatorScheduler_TemplateMethod scheduler = getScheduler();
        System.out.println(scheduler);

        int selectedElevator = scheduler.selectElevator(this, destination, direction);

        controllers.get(selectedElevator).gotoFloor(destination);
    }
}

