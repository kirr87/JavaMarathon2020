package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing", 2005,137, 48);

        airplane.setLength(145);
        airplane.setWeight(52);
        airplane.setYear(2010);
        airplane.fillUp(150);
        airplane.fillUp(150);
        airplane.info();
    }
}
