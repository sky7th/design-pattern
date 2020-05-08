package com.sky7th.designpattern.observer.custom.observable;

import com.sky7th.designpattern.observer.custom.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) { observers.add(observer);}

    public void detach(Observer observer) { observers.remove(observer);}

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
}