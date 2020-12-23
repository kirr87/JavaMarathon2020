package day18;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311, 35, 896,-8649, 1236};
        System.out.println(recursionSum(numbers, numbers.length - 1));
    }

    public static int recursionSum(int[] numbers, int count) {

        if (count == 0) {
            return numbers[0];
        }
        return numbers[count] + recursionSum(numbers, count - 1);
    }

    //решать через остаток от деления на десять. Если остаток от деления на 10 равен 7 значит увеличиваем счетчик

}

