package day12.task4;

import java.util.ArrayList;
import java.util.List;

import static day12.task4.MusicBand.transferMembers;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();

        members1.add("Стенли");
        members1.add("Купер");
        members1.add("Элис");
        MusicBand RockGroup = new MusicBand("Роккеры", 2002, members1);

        List<String> members2 = new ArrayList<>();

        members2.add("Дэнни");
        members2.add("Шаркин");
        members2.add("Младший");
        MusicBand PopGroup = new MusicBand("Поперы", 1998, members2);

        RockGroup.printMembers();
        PopGroup.printMembers();

        transferMembers(RockGroup, PopGroup);

        RockGroup.printMembers();
        PopGroup.printMembers();

    }


}
