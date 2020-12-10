package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private double physDef;
    private double magicDef;
    private int physAtt;
    private int magicAtt;
    private int Health;

    public Magician() {
        this.physDef = 0;
        this.magicDef = 0.8;
        this.physAtt = 5;
        this.magicAtt = 20;
        this.Health = 100;
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.getMagicDef() == 0) {
            hero.setHealth(hero.getHealth() - magicAtt);
        } else hero.setHealth((int) (hero.getHealth() - ((1 - hero.getMagicDef()) * magicAtt)));

        if (hero.getHealth() < 0) {
            hero.setHealth(0);
        }
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
        return "Magician{" +
                "Health=" + Health +
                '}';
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
