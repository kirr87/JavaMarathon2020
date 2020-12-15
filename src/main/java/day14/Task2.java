package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> nameAndAge = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                int number = Integer.parseInt(str.substring(str.indexOf(" ") + 1));
                if (number < 0) {
                    try {
                        throw new IOException();
                    }catch (IOException e){
                        System.out.println("Некорректный входной файл");
                    }
                    break;
                } else nameAndAge.add(str);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }
        return nameAndAge;
    }
}
