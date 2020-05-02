package com.sky7th.designpattern.factorymethod.no_use_Inheritance;

import com.sky7th.designpattern.factorymethod.no_use_Inheritance.elevator.*;
import com.sky7th.designpattern.factorymethod.no_use_Inheritance.scheduler.SchedulingStrategy;

public class Application {

    public static void main(String... args) {
        System.out.println("전략 패턴 + 싱글톤 패턴을 이용하여 팩토리 메서드 패턴 적용");
        ElevatorManager emWithResponseTimeScheduler = ElevatorManager.of(2, SchedulingStrategy.RESPONSE_TIME);
        emWithResponseTimeScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithThroughputScheduler = ElevatorManager.of(2, SchedulingStrategy.THROUGHPUT);
        emWithThroughputScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithDynamicScheduler = ElevatorManager.of(2, SchedulingStrategy.DYNAMIC);
        emWithDynamicScheduler.requestElevator(10, Direction.UP);
    }
}
