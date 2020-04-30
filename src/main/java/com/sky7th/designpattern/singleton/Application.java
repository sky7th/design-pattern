package com.sky7th.designpattern.singleton;

import com.sky7th.designpattern.singleton.printer.Printer;
import com.sky7th.designpattern.singleton.printer.PrinterEnum;

public class Application {

    private static final String MESSAGE = "%s 의 남은 용지는 %d 장 입니다.";

    public static void main(final String... args) {
        final Printer printer1 = Printer.getInstance();
        final Printer printer2 = Printer.getInstance();

        System.out.println("---------------Printer--------------");
        System.out.println(String.format(MESSAGE, "printer1", printer1.getRemainedPaper()));
        System.out.println(String.format(MESSAGE, "printer2", printer2.getRemainedPaper()));
        printer1.print(5);
        System.out.println(String.format(MESSAGE, "printer1", printer1.getRemainedPaper()));
        System.out.println(String.format(MESSAGE, "printer2", printer2.getRemainedPaper()));

        final PrinterEnum printerEnum1 = PrinterEnum.getInstance();
        final PrinterEnum printerEnum2 = PrinterEnum.getInstance();

        System.out.println("---------------PrinterEnum--------------");
        System.out.println(String.format(MESSAGE, "printerEnum1", printerEnum1.getRemainedPaper()));
        System.out.println(String.format(MESSAGE, "printerEnum2", printerEnum2.getRemainedPaper()));
        printerEnum1.fillPaper(20);
        System.out.println(String.format(MESSAGE, "printerEnum1", printerEnum1.getRemainedPaper()));
        System.out.println(String.format(MESSAGE, "printerEnum2", printerEnum2.getRemainedPaper()));
    }
}
