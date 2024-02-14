package by.itstep.stage14.levelA.task01.util;

public class Converter {
    public static String convert(int[] number){
        StringBuilder builder = new StringBuilder();

            for (int element : number) {
                builder.append(element).append(" ");
            }
        return builder.toString();
    }
}
