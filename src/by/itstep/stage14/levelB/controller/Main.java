package by.itstep.stage14.levelB.controller;

import by.itstep.stage14.levelA.task01.util.Converter;
import by.itstep.stage14.levelA.task01.util.InitVector;
import by.itstep.stage14.levelA.task01.view.Printer;
import by.itstep.stage14.levelB.model.NumberLogic;

import java.util.Scanner;

public class Main {
    public static Scanner SCAN;

    static {
        SCAN = new Scanner(System.in);
    }

    public static final int SIZE = 5;

    public static void main(String[] args) {
        int[] array = new int[SIZE];
        InitVector.initVector(array);
        int number = SCAN.nextInt();

        String msg = "Greater values: " + NumberLogic.calculateGreaterNumbers(array, number);
        msg += "\nMultiples numbers: " + NumberLogic.calculateQuantityMultiplesNum(array, number);

        Printer.print(Converter.convert(array));
        Printer.print(msg);
    }
}
