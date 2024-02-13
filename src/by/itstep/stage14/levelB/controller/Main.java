package by.itstep.stage14.levelB.controller;

import by.itstep.stage14.levelA.task01.view.Printer;
import by.itstep.stage14.levelB.model.NumberLogic;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {4,6,12,36,45,54,23};
        int number = 9;

        String msg = "Greater values: " + NumberLogic.calculateGreaterNumbers(array, number);
        msg += "\nMultiples numbers: " + NumberLogic.calculateQuantityMultiplesNum(array, number);

        Printer.print(msg);
    }
}
