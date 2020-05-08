package com.sky7th.designpattern.observer.basic.observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class ScoreRecord extends Observable {

    private List<Integer> scores = new ArrayList<>();

    public void addScore(int score) {
        scores.add(score);
        setChanged();
        notifyObservers();
    }
    public List<Integer> getScoreRecord() { return scores; }
}