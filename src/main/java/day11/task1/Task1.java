package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse w = new Warehouse();
        Worker workerCourier = new Courier(w);
        Worker workerPicker = new Picker(w);

        businessProcess(workerCourier);
        businessProcess(workerPicker);
    }
    public static void businessProcess (Worker worker){
        for (int i = 0; i < 10001; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
