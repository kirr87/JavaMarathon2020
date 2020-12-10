package day11.task1;

public class Picker implements Worker{
    private int salary = 0;
    private boolean isPayed = false;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
    }
    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() >= 10000 && !isPayed){
            salary += 70000;
            isPayed = true;
        }
        else if (isPayed){
            System.out.println("Бонус уже был выплачен");
        }
        else System.out.println("Бонус пока не доступен");
    }
}
