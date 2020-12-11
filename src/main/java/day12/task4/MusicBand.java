package day12.task4;


import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> Members;

    public void addMembers(String member) {
        Members.add(member);
    }

    public void delMembers(String member) {
        Members.remove(member);
    }

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.Members = members;
    }

    public List<String> getMembers() {
        return Members;
    }

    public static void transferMembers(MusicBand bandOne, MusicBand bandTwo) {
        for (String band : bandOne.getMembers()) {
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
        System.out.println(Members);
    }


}
