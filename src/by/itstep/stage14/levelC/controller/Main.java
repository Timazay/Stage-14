package by.itstep.stage14.levelC.controller;

import by.itstep.stage14.levelA.task01.util.Converter;
import by.itstep.stage14.levelA.task01.util.InitVector;
import by.itstep.stage14.levelA.task01.view.Printer;
import by.itstep.stage14.levelC.model.ArrayLogic;

public class Main {
    public static final int SIZE = 5;
    public static void main(String[] args) {
        int[] array = new int[SIZE];
        InitVector.initVector(array);

        String msg = "Greater arithmetic means: " + ArrayLogic.calculateValuesGreaterThanArithmeticMean(array);
        msg += "\nLess geometric means: " + ArrayLogic.calculateValuesLessThanGeometricMean(array);

        Printer.print(Converter.convert(array));
        Printer.print(msg);
    }
}
