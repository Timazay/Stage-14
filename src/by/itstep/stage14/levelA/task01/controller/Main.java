package by.itstep.stage14.levelA.task01.controller;

import by.itstep.stage14.levelA.task01.model.ValueLogic;
import by.itstep.stage14.levelA.task01.view.Printer;


public class Main {
    public static void main(String[] args) {
        int[] number = new int[]{2, 0, 3, 4, 0, 6, -4, -8, 3};
        String msg = "The sum of non zero numbers: " + ValueLogic.calcNonZeroValue(number);
        msg += "\nThe sum of negative numbers: " + ValueLogic.sumNegativeValue(number);

        Printer.print(msg);
    }
}
