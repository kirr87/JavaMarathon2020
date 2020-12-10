package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private double physDef;
    private double magicDef;
    private int physAtt;
    private int magicAtt;
    private int Health;

    public Shaman() {
        this.physDef = 20;
        this.magicDef = 20;
        this.physAtt = 10;
        this.magicAtt = 15;
        this.Health = 100;
    }

    @Override
    public void healHimself() {
        if ((Health + 50) > 100) {
            Health = 100;
        } else
            setHealth(Health + 50);
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() + 30 > 100) {
            hero.setHealth(100);
        } else
            hero.setHealth(hero.getHealth() + 30);
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "Health=" + Health +
                '}';
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
