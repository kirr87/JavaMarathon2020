package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {
    private double physDef;
    private double magicDef;
    private int physAtt;
    private int Health;

    public Paladin() {
        this.physDef = 0.5;
        this.magicDef = 0.2;
        this.physAtt = 15;
        this.Health = 100;
    }

    @Override
    public void healHimself() {
        if ((Health + 25) > 100) {
            Health = 100;
        } else
            setHealth(Health + 25);
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() + 10 > 100) {
            hero.setHealth(100);
        } else
            hero.setHealth(hero.getHealth() + 10);
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.getPhysDef() == 0) {
            hero.setHealth(hero.getHealth() - physAtt);
        } else
            hero.setHealth((int) (hero.getHealth() - ((1 - hero.getPhysDef()) * physAtt)));

        if (hero.getHealth() < 0) {
            hero.setHealth(0);
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "Health=" + Health +
                '}';
    }

    @Override
    public double getMagicDef() {
        return magicDef;
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

