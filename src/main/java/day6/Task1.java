package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setProductionYear(2020);
        car.setColor("Black");
        car.setModel("Tesla Model 3");
        Motorbike motorbike = new Motorbike(2012, "Black", "Tracer 900GT" );

        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(1980));
        System.out.println(motorbike.yearDifference(2010));
    }
}
