package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int numberMax = -2147483648;
        int numberMin = 2147483647;
        int countElementZero = 0;
        int sumElementZero = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        for (int element : array) {
            if (element > numberMax) {
                numberMax = element;
            }
            if (element < numberMin) {
                numberMin = element;
            }
            if (element % 10 == 0) {
                countElementZero++;
                sumElementZero += element;
            }
        }

        System.out.println("Наибольший элемент массива: " + numberMax);
        System.out.println("Наименьший элемент массива: " + numberMin);
        System.out.println("Количество элементов оканчивающихся на 0: " + countElementZero);
        System.out.println("Сумма элементов массива оканчивающихся на 0: " + sumElementZero);
    }
}
