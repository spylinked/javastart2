package Day_11;

import Day_10.Node;

import java.util.ArrayList;
import java.util.Random;

public class Warehouse {
    private static final int MAXCOURIERS = 3;
    private static final int MAXPICKERS = 3;
    private int countOrder;
    private int balance;
    private ArrayList<Worker> workers = new ArrayList();
    private String name;

    public Warehouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int getMAXCOURIERS() {
        return MAXCOURIERS;
    }

    public static int getMAXPICKERS() {
        return MAXPICKERS;
    }

    public int getCountOrder() {
        return this.countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
        if (this.countOrder%1500 == 0) {
            for (int i = 0; i < workers.size(); i++) {
                if(workers.get(i).getType() == "Сборщик"){
                    workers.get(i).bonus();
                }
            }
            System.out.println("Сборщики на заводе " + this.getName() + " получили бонус!");
            System.out.println();
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
        if (this.getBalance()%1000000 == 0) {
            for (int i = 0; i < workers.size(); i++) {
                if(workers.get(i).getType() == "Курьер"){
                    workers.get(i).bonus();
                }
            }
            System.out.println("Курьеры на заводе " + this.getName() + " получили бонус!");
            System.out.println();
        }
    }

    public void assignWorker(Worker worker){
        workers.add(worker);
        worker.assignToWarehouse(this);
    }

    public void showWorkers(){
        System.out.println("Список работников на заводе " + this.getName() +": ");
        for (int i = 0; i < workers.size(); i++) {
            System.out.println(workers.get(i).getName() + ", Позиция: " + workers.get(i).getType());
        }
        System.out.println();
    }
    public void showWorkersSalary(){
        System.out.println("Сотрудники на заводе " + this.getName() + " заработали: ");
        for (int i = 0; i < workers.size(); i++) {
            System.out.println(workers.get(i).getName() + ", Позиция: " + workers.get(i).getType() + " Заработал: " + workers.get(i).getSalary());
        }
        System.out.println();
    }
    public void startWork(){
        Random rnd = new Random();
        for (int i = 0; i < 2000; i++) {
            workers.get(rnd.nextInt(workers.size())).doWork();
        }
    }
    @Override
    public String toString() {
        return "Завод " + this.getName() + " Баланс: " + this.balance + ", Количество заказов: " + this.countOrder;
    }
}
