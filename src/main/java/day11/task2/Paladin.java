package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {
    private int healHimself;
    private int healTeammate;

    public Paladin() {
        super();
        setPhysDef(0.5);
        setMagicDef(0.2);
        setPhysAtt(15);
        setMagicAtt(0);
        this.healHimself = 25;
        this.healTeammate = 10;
    }

    @Override
    public void healHimself() {
        if ((getHealth() + 25) > 100) {
            setHealth(100);
        } else
            setHealth(getHealth() + 25);
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() + 10 > 100) {
            hero.setHealth(100);
        } else
            hero.setHealth(hero.getHealth() + 10);
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "Health=" + getHealth() +
                '}';
    }
}

