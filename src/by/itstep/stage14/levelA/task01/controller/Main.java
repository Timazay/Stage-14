package by.itstep.stage14.levelA.task01.controller;

import by.itstep.stage14.levelA.task01.model.ValueLogic;
import by.itstep.stage14.levelA.task01.util.Converter;
import by.itstep.stage14.levelA.task01.util.InitVector;
import by.itstep.stage14.levelA.task01.view.Printer;


public class Main {
    public static final int SIZE = 5;
    public static void main(String[] args) {
        int[] number = new int[SIZE];
        InitVector.initVector(number);

        String msg = "The sum of non zero numbers: " + ValueLogic.calcNonZeroValue(number);
        msg += "\nThe sum of negative numbers: " + ValueLogic.sumNegativeValue(number);

        Printer.print(Converter.convert(number));
        Printer.print(msg);
    }
}
