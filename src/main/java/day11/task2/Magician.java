package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    public Magician() {
        super();
        setPhysDef(0);
        setMagicDef(0.8);
        setPhysAtt(5);
        setMagicAtt(20);
    }

    @Override
    public String toString() {
        return "Magician{" +
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
