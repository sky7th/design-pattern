package com.sky7th.designpattern.factorymethod.use_Inheritance;

import com.sky7th.designpattern.factorymethod.use_Inheritance.elevator.*;
import com.sky7th.designpattern.factorymethod.use_Inheritance.scheduler.SchedulingStrategy;

public class Application {

    public static void main(String... args) {
        System.out.println("전략 패턴 + 싱글톤 패턴 + 템플릿 메소드 패턴을 이용하여 팩토리 메서드 패턴 적용");
        ElevatorManager_TemplateMethod emWithResponseTimeScheduler2 = ElevatorManagerWithResponseTimeScheduling.of(2);
        emWithResponseTimeScheduler2.requestElevator(10, Direction.UP);

        ElevatorManager_TemplateMethod emWithThroughputScheduler2 = ElevatorManagerWithThroughputScheduling.of(2);
        emWithThroughputScheduler2.requestElevator(10, Direction.UP);

        ElevatorManager_TemplateMethod emWithDynamicScheduler2 = ElevatorManagerWithDynamicScheduling.of(2);
        emWithDynamicScheduler2.requestElevator(10, Direction.UP);
    }
}
