package BattleSee;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Player {
    private boolean isWin = false;
    Gui gui = new Gui();
    Gui battleMatrix = new Gui();
    List<Ship> ships = new ArrayList<>();
    int countShips = 10;

//Добавление корабля

    public void addShip(int desk) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (chekRegex(str, desk)) {
            addShip(desk);
        } else {
            List<int[]> cords = new ArrayList();
            String[] array = str.split(";");

            for (int i = 0; i < array.length; i++) {
                cords.add(cordShips(array[i]));
            }

            if (chekShip(cords, desk)) {
                addShip(desk);
            } else {
                for (int[] arr : cords) {
                    gui.addShipHalo(arr[0], arr[1]);
                }

                for (int[] arr : cords) {
                    gui.addShip(arr[0], arr[1]);
                }
            }
            ships.add(new Ship(cords));
        }
    }

//Проверка на победу

    public boolean isWin(Player player) {
        return player.countShips == 0;
    }

//Выстрел

    public String shot(Player player) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = "";
        if (chekRegex(str, 1)) {
            shot(player);
        } else {
            str = str.substring(0, 3);
            int[] battleCord = cordShips(str);
            int shotX = battleCord[0];
            int shotY = battleCord[1];

            String resultShot = resultShot(player, shotX, shotY);

            if (resultShot.equals("Мимо")) {
                battleMatrix.matrix[shotY][shotX] = 4;
            } else if (resultShot.equals("Сюда уже стреляли")) {

            } else battleMatrix.matrix[shotY][shotX] = 3;
            System.out.println(resultShot);
            result = resultShot;
        }
        return result;
    }

//Результаты выстрела

    public String resultShot(Player player, int x, int y) {
        String result = "Мимо";
        for (int i = 0; i < player.ships.size(); i++) {
            for (int j = 0; j < player.ships.get(i).getCordShip().size(); j++) {
                if (x == player.ships.get(i).getCordShip().get(j)[0] && y == player.ships.get(i).getCordShip().get(j)[1]) {
                    if (battleMatrix.matrix[y][x] == 3 || battleMatrix.matrix[y][x] == 4) {
                        result = "Сюда уже стреляли";
                        break;
                    } else {
                        player.ships.get(i).setCountHit(1);
                    }
                    if (player.ships.get(i).getCountHit() == 0) {
                        result = "Уничтожен";
                        player.countShips = player.countShips - 1;
                    } else result = "Подбит";

                }
            }
        }
        return result;
    }

//Разбераем строку на массив координат

    public int[] cordShips(String cord) {
        String[] res = cord.split(",");
        int[] result = new int[2];
        for (int i = 0; i < res.length; i++) {
            int a = +Integer.parseInt(res[i]);
            if (a < 0) {
                a = Math.abs(a);
            }
            result[i] = a + 1;

        }
        return result;
    }

//Проверка на количество палуб

    public boolean chekShip(List<int[]> cords, int deck) {
        boolean result = false;
        if (chekDesk(cords, deck)) {
            result = true;
        } else if (chekOrder(cords, deck)) {
            result = true;
        } else if (chekRange(cords, deck)) {
            result = true;
        } else if (chekHalo(cords, deck)) {
            result = true;
        }
        return result;
    }

//Проверяем диапазон координат

    public boolean chekRange(List<int[]> cords, int deck) {
        boolean result = false;
        for (int i = 0; i < cords.size(); i++) {
            for (int j = 0; j < cords.get(i).length; j++) {
                if (cords.get(i)[j] < 0 || cords.get(i)[j] > 10) {
                    System.out.println("Координаты введены не правильно, диапазон координат 0-9");
                    result = true;
                }
            }
        }
        return result;
    }

//Проверяем количество палуб

    public boolean chekDesk(List<int[]> cords, int deck) {
        boolean result = false;
        if (cords.size() < deck) {
            System.out.println("Координаты введены не правильно, мало палуб. Попробуйте еще раз");
            result = true;
        } else if (cords.size() > deck) {
            System.out.println("Координаты введены не правильно, много палуб. Попробуйте еще раз");
            result = true;
        }
        return result;
    }

//Проверяем идут ли клетки подряд

    public boolean chekOrder(List<int[]> cords, int deck) {
        boolean result = false;
        if (deck == 2) {
            if (cords.get(0)[0] == cords.get(1)[0]) {
                if (cords.get(0)[1] != cords.get(1)[1] - 1) {
                    System.out.println("Клетки корабля идут не подряд");
                    result = true;
                }
            } else if (cords.get(0)[1] == cords.get(1)[1]) {
                if (cords.get(0)[0] != cords.get(1)[0] - 1) {
                    System.out.println("Клетки корабля идут не подряд");
                    result = true;
                }
            }
        } else if (deck == 3) {
            if (cords.get(0)[0] == cords.get(1)[0] && cords.get(1)[0] == cords.get(2)[0]) {
                if (cords.get(0)[1] != cords.get(1)[1] - 1 || cords.get(1)[1] != cords.get(2)[1] - 1) {
                    System.out.println("Клетки корабля идут не подряд");
                    result = true;
                }
            } else if (cords.get(0)[1] == cords.get(1)[1] && cords.get(1)[1] == cords.get(2)[1]) {
                if (cords.get(0)[0] != cords.get(1)[0] - 1 || cords.get(1)[0] != cords.get(2)[0] - 1) {
                    System.out.println("Клетки корабля идут не подряд");
                    result = true;
                }
            }
        } else if (deck == 4) {
            if (cords.get(0)[0] == cords.get(1)[0] && cords.get(1)[0] == cords.get(2)[0] && cords.get(2)[0] == cords.get(3)[0]) {
                if (cords.get(0)[1] != cords.get(1)[1] - 1 || cords.get(1)[1] != cords.get(2)[1] - 1 || cords.get(2)[1] != cords.get(3)[1] - 1) {
                    System.out.println("Клетки корабля идут не подряд");
                    result = true;
                }
            } else if (cords.get(0)[1] == cords.get(1)[1] && cords.get(1)[1] == cords.get(2)[1] && cords.get(2)[1] == cords.get(3)[1]) {
                if (cords.get(0)[0] != cords.get(1)[0] - 1 || cords.get(1)[0] != cords.get(2)[0] - 1 || cords.get(2)[0] != cords.get(3)[0] - 1) {
                    System.out.println("Клетки корабля идут не подряд");
                    result = true;
                }
            }
        }
        return result;
    }

//Проверка возможности размещения корабля

    public boolean chekHalo(List<int[]> cords, int deck) {
        boolean result = false;
        for (int i = 0; i < cords.size(); i++) {
            int cordX = cords.get(i)[0];
            int cordY = cords.get(i)[1];
            if (gui.matrix[cordY][cordX] > 0) {
                System.out.println("В этом месте размещать корабль нельзя. Соседний корабль слишком близко");
                result = true;
            }
        }
        return result;
    }

//Проверяем формат ввода

    public boolean chekRegex(String str, int desk) {

        boolean result = false;
        if (desk == 4) {
            Pattern pattern = Pattern.compile("\\d[,]\\d[;]\\d[,]\\d[;]\\d[,]\\d[;]\\d[,]\\d[;]");
            Matcher matcher = pattern.matcher(str);
            if (!matcher.find()) {
                System.out.println("Строка не соответствует формату");
                result = true;
            }
        } else if (desk == 3) {
            Pattern pattern = Pattern.compile("\\d[,]\\d[;]\\d[,]\\d[;]\\d[,]\\d[;]");
            Matcher matcher = pattern.matcher(str);
            if (!matcher.find()) {
                System.out.println("Строка не соответствует формату");
                result = true;
            }
        } else if (desk == 2) {
            Pattern pattern = Pattern.compile("\\d[,]\\d[;]\\d[,]\\d[;]");
            Matcher matcher = pattern.matcher(str);
            if (!matcher.find()) {
                System.out.println("Строка не соответствует формату");
                result = true;
            }
        } else if (desk == 1) {
            Pattern pattern = Pattern.compile("\\d[,]\\d[;]");
            Matcher matcher = pattern.matcher(str);
            if (!matcher.find()) {
                System.out.println("Строка не соответствует формату");

                result = true;
            }
        }
        return result;

    }
}
