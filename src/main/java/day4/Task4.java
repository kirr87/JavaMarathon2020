package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] lowArray = new int[3];
        int sumTripleOne = 0;
        int sumTripleTwo = 0;
        int index = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        /*for (int i = 1; i < array.length - 1; i++) {
            lowArray = Arrays.copyOfRange(array, i - 1, i + 2);
            for (int j = 0; j < lowArray.length; j++) {
                sumTripleOne += lowArray[j];
            }
            if (sumTripleOne > sumTripleTwo) {
                sumTripleTwo = sumTripleOne;
                index = i - 1;
            }
            sumTripleOne = 0;
        }*/

        //Вариант решения без дополнительного массива

        for (int i = 1; i < array.length - 3; i++) {
            //lowArray = Arrays.copyOfRange(array, i - 1, i + 2);
            for (int j = i; j < i + 3; j++) {
                sumTripleOne += array[j];
            }
            if (sumTripleOne > sumTripleTwo) {
                sumTripleTwo = sumTripleOne;
                index = i;
            }
            sumTripleOne = 0;


        }
        System.out.println(sumTripleTwo);
        System.out.println(index);
    }
}
