package com.sky7th.designpattern.factorymethod.use_Inheritance.elevator;

class ElevatorController {
    private int id; // 엘리베이터 ID
    private int curFloor; // 현재 층

    private ElevatorController(int id) {
        this.id = id;
        curFloor = 1;
    }

    static ElevatorController of(int id) {
        return new ElevatorController(id);
    }

    void gotoFloor(int destination) {
        System.out.print("Elevator [" + id + "] Floor: " + curFloor);
        curFloor = destination;
        System.out.println(" ==> " + curFloor);
    }
}