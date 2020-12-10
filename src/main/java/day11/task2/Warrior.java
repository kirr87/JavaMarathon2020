package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    private double physDef;
    private int magicDef;
    private int physAtt;
    private int Health;

    public Warrior() {
        this.physDef = 0.8;
        this.magicDef = 0;
        this.physAtt = 30;
        this.Health = 100;

    }

    @Override
    public String toString() {
        return "Warrior{" +
                "Health=" + Health +
                '}';
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.getPhysDef() == 0) {
            hero.setHealth((int) (hero.getHealth() - physAtt));
        } else
            hero.setHealth((int) (hero.getHealth() - ((1 - hero.getPhysDef()) * physAtt)));
        if (hero.getHealth() < 0) {
            hero.setHealth(0);
        }
    }

    @Override
    public double getPhysDef() {
        return physDef;
    }

    @Override
    public void setHealth(int health) {
        this.Health = health;
    }

    @Override
    public int getHealth() {
        return Health;
    }
}
