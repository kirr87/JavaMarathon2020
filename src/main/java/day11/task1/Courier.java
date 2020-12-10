package day11.task1;

public class Courier implements Worker{
    private int salary = 0;
    private boolean isPayed = false;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
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
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() >= 10000 && !isPayed){
            salary += 50000;
            isPayed = true;
        }
        else if (isPayed){
            System.out.println("Бонус уже был выплачен");
    }
        else System.out.println("Бонус пока не доступен");
    }
}
