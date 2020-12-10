package day11.task2;

public abstract class Hero {
    private int Health;
    private double physDef;
    private double magicDef;
    private int physAtt;

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getHealth() {
        return Health;
    }
}
