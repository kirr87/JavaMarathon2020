package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int stamina = random.nextInt((100-90)+1);

        Player p1 = new Player(stamina);
        Player p2 = new Player(stamina);
        Player p3 = new Player(stamina);
        Player p4 = new Player(stamina);
        Player p5 = new Player(stamina);
        Player p6 = new Player(stamina);
        Player p7 = new Player(stamina);
        Player p8 = new Player(stamina);

        p1.info();



    }
}
