package by.itstep.stage14.levelA.task01.model;

public class ValueLogic {
    public static int calcNonZeroValue(int[] number) {
        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] != 0) {
                sum++;
            }
        }
        return sum;
    }
    public static int sumNegativeValue(int[] number){
        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] < 0){
                sum++;
            }
        }
        return sum;
    }
}
