package day6;

public class Motorbike {
    private int productionYear;
    private String color;
    private String model;

    public Motorbike(int productionYear, String color, String model) {
        this.productionYear = productionYear;
        this.color = color;
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info(){
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int year){
        return Math.abs(year - productionYear);
    }
}
