package day6;

public class Car {
    private int productionYear;
    private String color;
    private String model;

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info(){
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int year){
        return Math.abs(year - productionYear);
    }
}
