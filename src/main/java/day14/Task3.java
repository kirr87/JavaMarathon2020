package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObjList(file).toString());
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> nameAndAgePerson = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                int age = Integer.parseInt(str.substring(str.indexOf(" ") + 1));
                String name = str.substring(0, str.indexOf(" "));
                if (age < 0) {
                    try {
                        throw new IOException();
                    }catch (IOException e){
                        System.out.println("Некорректный входной файл");
                    }
                    break;
                } else nameAndAgePerson.add(new Person(name, age));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }
        return nameAndAgePerson;
    }
}
