package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            int count = 0;
            int sum = 0;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                sum = sum + scanner.nextInt();
                count++;
            }
            if (count != 10) {
                System.out.println("Некорректный входной файл");
            } else System.out.println(sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }


    }
}
