package by.itstep.stage14.levelC.controller;

import by.itstep.stage14.levelA.task01.view.Printer;
import by.itstep.stage14.levelC.model.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {12, 2, 4, 3, 43, 23, 39};
        int number = 4;

        String msg = "Arithmetic means: " + ArrayLogic.calculateValuesGreaterThanArithmeticMean(array,number);
        msg += "\nGeometric means: " + ArrayLogic.calculateValuesLessThanGeometricMean(array,number);

        Printer.print(msg);
    }
}
