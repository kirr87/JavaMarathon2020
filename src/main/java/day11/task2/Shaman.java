package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private int healHimself;
    private int healTeammate;

    public Shaman() {
        super();
        setPhysDef(0.2);
        setMagicDef(0.2);
        setPhysAtt(10);
        setMagicAtt(15);
        this.healHimself = 50;
        this.healTeammate = 30;
    }

    public void healHimself() {
        if ((getHealth() + healHimself) > 100) {
            setHealth(100);
        } else
            setHealth(getHealth() + healHimself);
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() + healTeammate > 100) {
            hero.setHealth(100);
        } else
            hero.setHealth(hero.getHealth() + healTeammate);
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "Health=" + getHealth() +
                '}';
    }

    public void magicalAttack(Hero hero) {
        if (hero.getMagicDef() == 0) {
            hero.setHealth(hero.getHealth() - getMagicAtt());
        } else hero.setHealth((int) (hero.getHealth() - ((1 - hero.getMagicDef()) * getMagicAtt())));

        if (hero.getHealth() < 0) {
            hero.setHealth(0);
        }
    }
}
