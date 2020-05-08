package com.sky7th.designpattern.observer.custom.observer;

import com.sky7th.designpattern.observer.custom.observable.ScoreRecord;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer {

    private ScoreRecord scoreRecord;

    public MinMaxView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();
        displayScores(record);
    }

    private void displayScores(List<Integer> record) {
        int min = Collections.min(record, null);
        int max = Collections.max(record, null);
        System.out.println("Min: " + min + ", Max: " + max);
    }
}