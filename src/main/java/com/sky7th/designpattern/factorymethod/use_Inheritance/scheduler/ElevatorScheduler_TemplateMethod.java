package com.sky7th.designpattern.factorymethod.use_Inheritance.scheduler;

import com.sky7th.designpattern.factorymethod.use_Inheritance.elevator.Direction;
import com.sky7th.designpattern.factorymethod.use_Inheritance.elevator.ElevatorManager_TemplateMethod;

public interface ElevatorScheduler_TemplateMethod {

    int selectElevator(ElevatorManager_TemplateMethod manager, int destination, Direction direction);
}
