package com.sky7th.designpattern.factorymethod.use_Inheritance.elevator;

import com.sky7th.designpattern.factorymethod.use_Inheritance.scheduler.ElevatorScheduler_TemplateMethod;
import com.sky7th.designpattern.factorymethod.use_Inheritance.scheduler.ThroughputScheduler;

public class ElevatorManagerWithThroughputScheduling extends ElevatorManager_TemplateMethod {
    private ElevatorManagerWithThroughputScheduling(int controllerCount) {
        super(controllerCount); // 상위 클래스 생성자 호출
    }

    public static ElevatorManagerWithThroughputScheduling of(int controllerCount) {
        return new ElevatorManagerWithThroughputScheduling(controllerCount);
    }

    @Override
    protected ElevatorScheduler_TemplateMethod getScheduler() {
        return ThroughputScheduler.getInstance();
    }
}
