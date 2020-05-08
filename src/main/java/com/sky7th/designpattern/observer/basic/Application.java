package com.sky7th.designpattern.observer.basic;

import com.sky7th.designpattern.observer.basic.observable.ScoreRecord;
import com.sky7th.designpattern.observer.basic.observer.DataSheetView;
import com.sky7th.designpattern.observer.basic.observer.MinMaxView;

public class Application {

    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();

        DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);
        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        scoreRecord.addObserver(dataSheetView);
        scoreRecord.addObserver(minMaxView);

        for (int index = 1; index <= 5; index++) {
            int score = index * 10;
            System.out.println("######################");
            System.out.println("Adding " + score);

            scoreRecord.addScore(score);
        }
    }
}
