package by.itstep.stage14.levelC.model;

public class ArrayLogic {
    public static int calculateValuesGreaterThanArithmeticMean(int[] array) {
        int avg = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }

        avg /= array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > avg) {
                sum++;
            }
        }
        return sum;
    }

    public static int calculateValuesLessThanGeometricMean(int[] array) {
        double avg = 1;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            avg *= array[i];
        }
        double geoMean = Math.pow(avg, 1.0 / array.length);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < geoMean) {
                sum++;
            }
        }
        return sum;
    }
}
