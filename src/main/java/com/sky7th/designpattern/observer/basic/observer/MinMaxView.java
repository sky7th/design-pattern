package com.sky7th.designpattern.observer.basic.observer;

import com.sky7th.designpattern.observer.basic.observable.ScoreRecord;

import java.util.Collections;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class MinMaxView implements Observer {

    private ScoreRecord scoreRecord;

    public MinMaxView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    @Override
    public void update(Observable o, Object arg) {
        List<Integer> record = scoreRecord.getScoreRecord();
        displayScores(record);
    }

    private void displayScores(List<Integer> record) {
        int min = Collections.min(record, null);
        int max = Collections.max(record, null);
        System.out.println("Min: " + min + ", Max: " + max);
    }
}