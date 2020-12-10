package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magocian = new Magician();
        Shaman shaman = new Shaman();

        warior.physicalAttack(paladin);
        System.out.println(paladin.toString());
        paladin.physicalAttack(magocian);
        System.out.println(magocian);
        shaman.healTeammate(magocian);
        System.out.println(magocian);
        magocian.magicalAttack(paladin);
        System.out.println(paladin.toString());
        shaman.physicalAttack(warior);
        System.out.println(warior.toString());
        paladin.healHimself();
        System.out.println(paladin.toString());

        for (int i = 0; i < 5; i++){
            warior.physicalAttack(magocian);
            System.out.println(magocian.toString());
        }
    }
}
