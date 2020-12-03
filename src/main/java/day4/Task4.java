package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int[] lowArray = new int[3];
        int sumTripleOne = 0;
        int sumTripleTwo = 0;
        int index = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        for (int i = 1; i < array.length - 1; i++) {
            lowArray = Arrays.copyOfRange(array, i - 1, i + 2);
            sumTripleOne = lowArray[0] + lowArray[1] + lowArray[2];

            if (sumTripleOne > sumTripleTwo) {
                sumTripleTwo = sumTripleOne;
                index = i - 1;
            }
        }

        System.out.println(sumTripleTwo);
        System.out.println(index);
    }
}
