package day11.task2;

public abstract class Hero {
    private double physDef;
    private double magicDef;
    private int physAtt;
    private int magicAtt;
    private int health;

    public Hero() {
        health = 100;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    public void physicalAttack(Hero hero) {
        if (hero.getPhysDef() == 0) {
            hero.setHealth(hero.getHealth() - getPhysAtt());
        } else
            hero.setHealth((int) (hero.getHealth() - ((1 - hero.getPhysDef()) * getPhysAtt())));

        if (hero.getHealth() < 0) {
            hero.setHealth(0);
        }
    }
}
