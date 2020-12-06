package day6;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;
    private final int fuelTank;

    public int getFuel() {
        return fuel;
    }

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
        this.fuelTank = 350;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, "
                + "количество топлива в баке: %d\n", manufacturer, year, length, weight, fuel);
    }

    public void fillUp(int fuel) {
        if (this.fuel > 0) {
            this.fuel += fuel;
            if (this.fuel > fuelTank) {
                System.out.println("Дозаправленно: " + (Math.abs((this.fuel - fuelTank) - fuel)) + ". Бак полностью заправлен.");
                this.fuel = fuelTank;
            } else if (this.fuel == fuelTank) {
                System.out.println("Дозаправленно: " + fuelTank + ". Бак полностью заправлен.");
            } else System.out.println("Дозаправленно: " + fuel);
        } else this.fuel = fuel;
    }
}
