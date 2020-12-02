package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double dividend = scanner.nextDouble();
            double divider = scanner.nextDouble();

            if (divider == 0){
                break;
            }
            else {
                double result = dividend / divider;
                System.out.println(result);
            }
        }
    }
}
