package com.sky7th.designpattern.factorymethod.use_Inheritance.elevator;

import com.sky7th.designpattern.factorymethod.use_Inheritance.scheduler.ElevatorScheduler_TemplateMethod;
import com.sky7th.designpattern.factorymethod.use_Inheritance.scheduler.ResponseTimeScheduler;

public class ElevatorManagerWithResponseTimeScheduling extends ElevatorManager_TemplateMethod {
    private ElevatorManagerWithResponseTimeScheduling(int controllerCount) {
        super(controllerCount); // 상위 클래스 생성자 호출
    }

    public static ElevatorManagerWithResponseTimeScheduling of(int controllerCount) {
        return new ElevatorManagerWithResponseTimeScheduling(controllerCount);
    }
    @Override
    protected ElevatorScheduler_TemplateMethod getScheduler() {
        return ResponseTimeScheduler.getInstance();
    }
}
