package BattleSee;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<int[]> cordShip;               //координаты корабля
    private int countHit;                       //количество палуб(очки прочности)

    public Ship(List<int[]> cordShip) {
        this.cordShip = cordShip;
        countHit = cordShip.size();
    }

    public List<int[]> getCordShip() {
        return cordShip;
    }

    public int getCountHit() {
        return countHit;
    }

    public void setCountHit(int countHit) {
        this.countHit = this.countHit - countHit;
    }

}
