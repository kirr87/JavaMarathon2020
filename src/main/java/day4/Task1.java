package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int numberMoreEight = 0;
        int numberEquallyOne = 0;
        int numberEven = 0;
        int numberOdd = 0;
        int sum = 0;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10);
            sum += array[i];
            if (array[i] > 8) {
                numberMoreEight++;
            } else if (array[i] == 1) {
                numberEquallyOne++;
            }

            if (array[i] % 2 == 0) {
                numberEven++;
            } else {
                numberOdd++;
            }
            System.out.print(array[i] + " ");
        }

        System.out.println("");
        System.out.println("Длинна массива: " + n + "\n" + "Количество чисел больше 8: " + numberMoreEight);
        System.out.println("Количество чисел равных 1: " + numberEquallyOne + "\n" + "Количество четных чисел: " + numberEven);
        System.out.println("Количество нечетных чисел: " + numberOdd + "\n" + "Сумма элементов массива: " + sum);
    }
}
