package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1");
        File file2 = new File("file2");
        PrintWriter printWriter1 = new PrintWriter(file1);
        PrintWriter printWriter2 = new PrintWriter(file2);

        for (int i = 0; i < 1000; i++) {
            int a = (int) (Math.random() * 100);
            printWriter1.print(a);
            printWriter1.print(" ");
        }
        printWriter1.close();
        Scanner scanner = new Scanner(file1);
        String str = "";

        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
        }

        String[] array = str.split(" ");
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 20 == 0) {
                sum = sum + Double.parseDouble(array[i]);
                printWriter2.print(sum);
                printWriter2.print(" ");
                sum = 0;
            } else sum = sum + Double.parseDouble(array[i]);
        }
        printWriter2.close();
        scanner.close();
        printResult(file2);
    }


    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double sum = 0;
        String str = "";

        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
        }

        String[] array = str.split(" ");
        for (String number: array) {
            sum = sum + Double.parseDouble(number);
        }

        scanner.close();
        System.out.println((int) sum);
    }
}
