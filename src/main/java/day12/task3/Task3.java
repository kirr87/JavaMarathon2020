package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> group = new ArrayList<MusicBand>();

        for (int i = 0; i < 10; i++) {
            group.add(new MusicBand("Рок-группа" + i, (int) (Math.random() * (2020 - 1985 + 1) + 1985)));
        }

        int seedValue = 10;
        Collections.shuffle(group, new Random(seedValue));

        System.out.println(group);
        System.out.println(groupsAfter2000(group));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<MusicBand>();
        for (MusicBand after : bands) {
            if (after.getYear() >= 2000) {
                groupsAfter2000.add(after);
            }
        }
        return groupsAfter2000;
    }
}
