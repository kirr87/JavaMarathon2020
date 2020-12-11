package day12;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> auto = new ArrayList<String>();
        auto.add("Tesla");
        auto.add("BMW");
        auto.add("Nissan");
        auto.add("Audi");
        auto.add("Ford");

        System.out.println(auto);
        auto.add(3,"Mercedes" );
        auto.remove(0);
        System.out.println(auto);
    }
}
