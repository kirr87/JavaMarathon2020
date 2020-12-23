package BattleSee;

public class Gui {


    int[][] matrix = new int[][]{
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

//Отрисовка матрицы

    public void show() {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                if (matrix[i][j] == 1) {
                    System.out.print(View.SHIP);
                } else if (matrix[i][j] == 0) {
                    System.out.print(View.EMPTY);
                } else if (matrix[i][j] == 2) {
                    System.out.print(View.HALO);
                } else if (matrix[i][j] == 3) {
                    System.out.print(View.DESTROYED);
                } else if (matrix[i][j] == 4) {
                    System.out.print(View.MISSING);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

//Добавление поля в котором нельзя создавать корабли

    public void addShipHalo(int x, int y) {
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (matrix[y + i][x + j] < 1) {
                    matrix[y + i][x + j] = 2;
                }
            }
        }
    }

//Добавление корабля в матрицу

    public void addShip(int x, int y) {
        matrix[y][x] = 1;
    }
}
