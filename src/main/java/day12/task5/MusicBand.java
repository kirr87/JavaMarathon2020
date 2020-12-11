package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> Members;

    public void addMembers(MusicArtist member) {
        Members.add(member);
    }

    public void delMembers(String member) {
        Members.remove(member);
    }

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.Members = members;
    }

    public List<MusicArtist> getMembers() {
        return Members;
    }

    public static void transferMembers(MusicBand bandOne, MusicBand bandTwo) {
        for (MusicArtist band : bandOne.getMembers()) {
            bandTwo.addMembers(band);
        }
        bandOne.Members.clear();
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public void printMembers() {

        for (MusicArtist artist: Members){
            System.out.print(artist.getName()+" ");
        }
        System.out.println("");
    }


}
