package by.itstep.stage14.levelB.model;

public class NumberLogic {
    public static int calculateGreaterNumbers(int[] array, int number) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                sum++;
            }
        }
        return sum;
    }

    public static int calculateQuantityMultiplesNum(int[] array, int number) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % number == 0){
                sum++;
            }
        }
        return sum;
    }
}
