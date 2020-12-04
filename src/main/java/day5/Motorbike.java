package day5;

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
}
