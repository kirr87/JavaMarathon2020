package day4;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int[][] array = new int[n][m];
        int sumLineOne = 0;
        int sumLineTwo = 0;
        int index = 0;

        for (int i = 0; i < m; i++) {
            sumLineOne = 0;
            for (int j = 0; j < n; j++) {
                array[j][i] = (int) (Math.random() * 50);
                sumLineOne += array[j][i];
            }
            if (sumLineOne >= sumLineTwo) {
                sumLineTwo = sumLineOne;
                index = i;
            }
        }

        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + index);
    }
}