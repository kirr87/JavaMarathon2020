package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("numbers");
        printResult(file);

    }
    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double sum = 0;
        int count = 0;

        while (scanner.hasNextLine()) {
            sum = sum + scanner.nextInt();
            count++;
        }
        scanner.close();
        String result = String.format("%.3f", (sum / count));
        System.out.print(sum / count+" --> " + result);

    }
}

