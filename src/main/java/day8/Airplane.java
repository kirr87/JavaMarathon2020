package day8;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public int getFuel() {
        return fuel;
    }

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
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
        this.fuel += fuel;
    }

    public static void compareAirplanes(Airplane airplaneOne, Airplane airplaneTwo){
        if(airplaneOne.length > airplaneTwo.length){
            System.out.println("Первый самолет длиннее");
        }
        else if (airplaneOne.length < airplaneTwo.length){
            System.out.println("Второй самолет длиннее");
        }
        else System.out.println("Длины самолетов равны");
    }

    @Override
    public String toString() {
        return "Изготовитель: " + manufacturer +
                ", год выпуска: " + year +
                ", длина: " + length +
                ", вес: " + weight +
                ", количество топлива в баке: " + fuel;
    }
}
