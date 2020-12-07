package day8;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2005,137, 48);

        System.out.println(airplane.toString());
        airplane.info();
    }
}
