package BattleSee;

import java.util.ArrayList;
import java.util.List;


public class Game {
    Player playerOne = new Player();
    Player playerTwo = new Player();
    String nameOne = "Первый Игрок";
    String nameTwo = "Второй Игрок";

    public void startGame() {
        List<String> phrase = new ArrayList<>();
        phrase.add("Начинаем игру. " + nameOne + " может создать корабли.\n" +
                "Создайте один четырехпалубный корабль. Введите координаты в формате (x,y;x,y;x,y;x,y;)");
        phrase.add("Создайте два трехпалубных корабля.\n" +
                "Создайте один четырехпалубный корабль. Введите координаты в формате (x,y;x,y;x,y;x,y;)");
        phrase.add("Создайте второй трехпалубный корабль введя координаты в формате (x,y;x,y;x,y;)");
        phrase.add("Создайте три двухпалубных корабля введя координаты в формате (x,y;x,y;)\n" +
                "Создайте первый двухпалубный корабль введя координаты в формате (x,y;x,y;)");
        phrase.add("Создайте второй двухпалубный корабль введя координаты в формате (x,y;x,y;)");
        phrase.add("Создайте третий двухпалубный корабль введя координаты в формате (x,y;x,y;)");
        phrase.add("Создайте четыре однопалубных корабля. Введите координаты в формате (x,y;)\n" +
                "Создайте первый однопалубный корабль введя координаты в формате (x,y;)");
        phrase.add("Создайте второй однопалубный корабль введя координаты в формате (x,y;)");
        phrase.add("Создайте третий однопалубный корабль введя координаты в формате (x,y;)");
        phrase.add("Создайте четвертый однопалубный корабль введя координаты в формате (x,y;)");

//Запрашиваем расстановку кораблей у игрока Один

        for (int i = 0; i < phrase.size(); i++) {
            System.out.println(phrase.get(i));
            if (i == 0) {
                playerOne.addShip(4);
            } else if (i > 0 && i < 3) {
                playerOne.addShip(3);
            } else if (i > 2 && i < 6) {
                playerOne.addShip(2);
                ;
            } else {
                playerOne.addShip(1);
            }
        }
        playerOne.gui.show();

//Запрашиваем расстановку кораблей у игрока Два

        phrase.remove(0);
        phrase.add(0, "Начинаем игру. " + nameTwo + " может создать корабли.\n" +
                "Создайте один четырехпалубный корабль. Введите координаты в формате (x,y;x,y;x,y;x,y;)");
        for (int i = 0; i < phrase.size(); i++) {
            System.out.println(phrase.get(i));
            if (i == 0) {
                playerTwo.addShip(4);
            } else if (i > 0 && i < 3) {
                playerTwo.addShip(3);
            } else if (i > 2 && i < 6) {
                playerTwo.addShip(2);
                ;
            } else playerTwo.addShip(1);
            ;
        }
        playerTwo.gui.show();
    }

    //Бой

    public void Battle() {
        lebel:
        while (true) {

            for (int i = 0; i <= 100; i++) {
                System.out.println("Первый игрок делает выстрел");
                String resultShot = playerOne.shot(playerTwo);
                playerOne.battleMatrix.show();

                if (resultShot.equals("Мимо") || resultShot.equals("Сюда уже стреляли")) {
                    break;
                }

                if (playerOne.isWin(playerTwo)) {
                    System.out.println("Победа, все корабли уничтожены");
                    break lebel;
                }
            }

            for (int i = 0; i <= 100; i++) {
                System.out.println("Второй игрок делает выстрел");
                String resultShot = playerTwo.shot(playerOne);
                playerTwo.battleMatrix.show();

                if (resultShot.equals("Мимо") || resultShot.equals("Сюда уже стреляли")) {
                    break;
                }

                if (playerTwo.isWin(playerOne)) {
                    System.out.println("Победа, все корабли уничтожены");
                    break lebel;
                }
            }
        }
    }
}
