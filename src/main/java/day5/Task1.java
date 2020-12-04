package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setProductionYear(2020);
        car.setColor("Black");
        car.setModel("Tesla Model 3");

        System.out.println(car.getProductionYear());
        System.out.println(car.getColor());
        System.out.println(car.getModel());
    }
}
