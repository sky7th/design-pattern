package com.sky7th.designpattern.decorator.display;

public class RoadDisplay extends Display {

    @Override
    public void draw() {
        System.out.println("기본 도로 표시");
    }
}