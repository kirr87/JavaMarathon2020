package day15.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File fileRead = new File("G:\\JavaProjects\\JavaMarathon2020\\src\\main\\resources\\shoes.csv");
        File fileWrite = new File("G:\\JavaProjects\\JavaMarathon2020\\src\\main\\resources\\missing_shoes");
        Scanner scanner = new Scanner(fileRead);
        PrintWriter printWriter = new PrintWriter(fileWrite);

        while (scanner.hasNextLine()){
        String [] str = scanner.nextLine().split(";");
            if (str[2].equals("0")){
                String result = str[0]+", "+str[1]+", "+str[2];
                printWriter.println(result);
            }
        }
        scanner.close();
        printWriter.close();
    }
}
