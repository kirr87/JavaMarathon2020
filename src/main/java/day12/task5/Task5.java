package day12.task5;

import java.util.ArrayList;
import java.util.List;

import static day12.task5.MusicBand.transferMembers;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();

        members1.add(new MusicArtist("Стенли", 21));
        members1.add(new MusicArtist("Купер", 23));
        members1.add(new MusicArtist("Элис", 19));
        MusicBand RockGroup = new MusicBand("Роккеры", 2002, members1);

        List<MusicArtist> members2 = new ArrayList<>();

        members2.add(new MusicArtist("Джонни", 22));
        members2.add(new MusicArtist("Шаркин", 20));
        members2.add(new MusicArtist("Младший", 24));
        MusicBand PopGroup = new MusicBand("Поперы", 1998, members2);

        RockGroup.printMembers();
        PopGroup.printMembers();

        transferMembers(RockGroup, PopGroup);

        RockGroup.printMembers();
        PopGroup.printMembers();

    }
}
