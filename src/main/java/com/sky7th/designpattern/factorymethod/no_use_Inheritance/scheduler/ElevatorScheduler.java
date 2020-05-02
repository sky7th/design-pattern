package com.sky7th.designpattern.factorymethod.no_use_Inheritance.scheduler;

import com.sky7th.designpattern.factorymethod.no_use_Inheritance.elevator.Direction;
import com.sky7th.designpattern.factorymethod.no_use_Inheritance.elevator.ElevatorManager;

public interface ElevatorScheduler {

    int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
