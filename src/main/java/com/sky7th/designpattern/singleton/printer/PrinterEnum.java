package com.sky7th.designpattern.singleton.printer;

public enum PrinterEnum {

    INSTANCE(PrinterEnum.DEFAULT_PAPER_SIZE);

    private static final int DEFAULT_PAPER_SIZE = 2;

    private int remainedPaper;

    PrinterEnum(final int paperSize) {
        this.remainedPaper = paperSize;
    }

    public static PrinterEnum getInstance() {
        return INSTANCE;
    }

    public void fillPaper(final int amount) {
        System.out.println(String.format("%d 장의 용지를 채워넣습니다.", amount));
        this.remainedPaper += amount;
    }

    public void print(final int amount) {
        System.out.println("프린트를 시작합니다.");
        usePaper(amount);
    }

    private void usePaper(final int amount) {
        System.out.println(String.format("%d 장의 용지를 사용합니다.", amount));
        remainedPaper -= amount;
    }

    public int getRemainedPaper() {
        return this.remainedPaper;
    }
}
