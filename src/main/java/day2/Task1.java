package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int houseFloor = scanner.nextInt();

        if (houseFloor >= 1 && houseFloor < 5){
            System.out.println("Малоэтажный дом");
        }
        else if (houseFloor > 4 && houseFloor < 9){
            System.out.println("Среднеэтажный дом");
        }
        else if (houseFloor >= 9){
            System.out.println("Многоэтажный дом");
        }
        else System.out.println("Ошибка ввода");
    }
}
