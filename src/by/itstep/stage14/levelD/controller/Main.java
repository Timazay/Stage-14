package by.itstep.stage14.levelD.controller;

import by.itstep.stage14.levelA.task01.view.Printer;
import by.itstep.stage14.levelD.model.ArrayLogic;

public class Main {
    public static void main(String[] args) {

        String msg = "Product elements: " + ArrayLogic.calculateTheProductElements(new double[] {12.3, 2.5, 4.7, 3.9, 43.1, 23.7, 39});
        double positive = ArrayLogic.sumElementsAfterPositiveNum(new double[] {-12.3, -2.5, -4.7, 3.9, 43.1, 23.7, 39});
        msg += "\nAfter first positive number: " + positive;

        Printer.print(msg);
    }
}
