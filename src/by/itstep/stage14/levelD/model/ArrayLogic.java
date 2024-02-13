package by.itstep.stage14.levelD.model;

public class ArrayLogic {
    public static double calculateTheProductElements(double[] array) {
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        int min = Math.min(maxIndex, minIndex) + 1;
        int max = Math.max(maxIndex, minIndex) - 1;

        double sum = 1;

        for (int i = min; i <= max; i++) {
            sum *= array[i];
        }
        return sum;
    }

    public static double sumElementsAfterPositiveNum(double[] array) {
        int positiveNum = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > positiveNum) {
                positiveNum = i;
                break;
            }
        }

        double sum = 0;

        for (int i = positiveNum + 1; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
