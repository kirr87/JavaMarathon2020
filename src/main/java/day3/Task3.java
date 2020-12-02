package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            double dividend = scanner.nextDouble();
            double divider = scanner.nextDouble();


            if (divider == 0) {
                System.out.println("Деление на 0");
                continue;
            }

            double result = dividend / divider;

            System.out.println(result);
        }

    }
}
