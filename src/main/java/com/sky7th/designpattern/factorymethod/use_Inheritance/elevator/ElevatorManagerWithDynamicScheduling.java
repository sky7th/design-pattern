package com.sky7th.designpattern.factorymethod.use_Inheritance.elevator;

import com.sky7th.designpattern.factorymethod.use_Inheritance.scheduler.ElevatorScheduler_TemplateMethod;
import com.sky7th.designpattern.factorymethod.use_Inheritance.scheduler.ResponseTimeScheduler;
import com.sky7th.designpattern.factorymethod.use_Inheritance.scheduler.ThroughputScheduler;

import java.util.Calendar;

public class ElevatorManagerWithDynamicScheduling extends ElevatorManager_TemplateMethod {
    private ElevatorManagerWithDynamicScheduling(int controllerCount) {
        super(controllerCount);
    }

    public static ElevatorManagerWithDynamicScheduling of(int controllerCount) {
        return new ElevatorManagerWithDynamicScheduling(controllerCount);
    }

    @Override
    protected ElevatorScheduler_TemplateMethod getScheduler() {
        ElevatorScheduler_TemplateMethod scheduler;

        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if (hour < 12)
            scheduler = ResponseTimeScheduler.getInstance();
        else
            scheduler = ThroughputScheduler.getInstance();

        return scheduler;
    }
}
