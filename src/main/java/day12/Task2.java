package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<Integer>();

        for (int i = 0; i <= 350; i++) {
            if (i <= 30 && i % 2 == 0) {
                number.add(i);
            } else if (i >= 300 && i % 2 == 0) {
                number.add(i);
            }
        }

        System.out.println(number);
    }
}
