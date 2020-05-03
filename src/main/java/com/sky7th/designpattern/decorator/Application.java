package com.sky7th.designpattern.decorator;

import com.sky7th.designpattern.decorator.display.Display;
import com.sky7th.designpattern.decorator.display.LaneDecorator;
import com.sky7th.designpattern.decorator.display.RoadDisplay;
import com.sky7th.designpattern.decorator.display.TrafficDecorator;

public class Application {

    public static void main(String[] args) {
        Display road = new RoadDisplay();
        road.draw();
        Display roadWithLane = new LaneDecorator(new RoadDisplay());
        roadWithLane.draw();
        Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
        roadWithTraffic.draw();

        Display roadWithLaneAndTraffic =
                new TrafficDecorator(
                        new LaneDecorator(
                                new RoadDisplay()));
        roadWithLaneAndTraffic.draw();
    }
}
