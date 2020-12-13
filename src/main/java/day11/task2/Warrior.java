package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        super();
        setPhysDef(0.8);
        setMagicDef(0);
        setPhysAtt(30);
        setMagicAtt(0);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "Health=" + getHealth() +
                '}';
    }
}
