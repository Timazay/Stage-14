package by.itstep.stage14.levelA.task01.util;

import java.util.Random;

public class InitVector {
    private static final Random RND;

    static {
        RND = new Random();
    }

    public static void initVector(int[] number){
        for (int i = 0; i < number.length; i++) {
            number[i] = RND.nextInt(0,10);
        }
    }
}
