package Day_11;

import Day_10.Node;

import java.util.ArrayList;

public class Warehouse {
    private static final int MAXCOURIERS = 3;
    private static final int MAXPICKERS = 3;
    private int countOrder;
    private int balance;
    private ArrayList<Worker> workers = new ArrayList();

    public static int getMAXCOURIERS() {
        return MAXCOURIERS;
    }

    public static int getMAXPICKERS() {
        return MAXPICKERS;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void assignWorker(Worker worker){
        workers.add(worker);
    }

    public void showWorkers(){
        System.out.println("Список работников:");
        for (int i = 0; i < workers.size(); i++) {
            System.out.println(workers.get(i).getName() + ", Позиция: " + workers.get(i).getType());
        }
    }
    @Override
    public String toString() {
        return "Баланс: " + balance + ", Количество заказов: " + countOrder;
    }
}
