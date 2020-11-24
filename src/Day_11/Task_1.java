package Day_11;

import MyUtils.generate;

import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Worker> pickers = new ArrayList();
        ArrayList<Worker> couriers = new ArrayList();
        ArrayList<Warehouse> warehouses = new ArrayList();
        Warehouse warehouse;
        String[] fio;
        fio = generate.generateNameM();
        for (int i = 0; i < 2; i++) {
            warehouses.add(new Warehouse("Предприятие-" + (i+1)));
        }
        //for (int i = 0; i < warehouse.getMAXCOURIERS(); i++) {
        for (int i = 0; i < 10; i++) {
            fio = generate.generateName();
            couriers.add(new Courier(fio[1] + " " + fio[0]));
            System.out.println("Создали курьера " + couriers.get(i).getName());
        }

        //for (int i = 0; i < warehouse.getMAXPICKERS(); i++) {
        for (int i = 0; i < 10; i++) {
            fio = generate.generateName();
            pickers.add(new Picker(fio[1] + " " + fio[0]));
            System.out.println("Создали сборщика " + pickers.get(i).getName());
        }
        System.out.println();

        for (int i = 0; i < warehouses.size(); i++) {
            warehouse = warehouses.get(i);
            for (int j = 0; j < warehouse.getMAXCOURIERS(); j++) {
                warehouse.assignWorker(couriers.get(0));
                System.out.println("Устроили курьера " + couriers.get(0).getName() + " на завод " + warehouse.getName());
                couriers.remove(0);
            }

            for (int j = 0; j < warehouse.getMAXPICKERS(); j++) {
                warehouse.assignWorker(pickers.get(0));
                System.out.println("Устроили сборщика " + pickers.get(0).getName() + " на завод " + warehouse.getName());
                pickers.remove(0);
            }
            System.out.println();
            warehouse.showWorkers();
            System.out.println();
        }
        /*
        System.out.println("DUBUG-1");
        System.out.println(warehouses.get(0));
        System.out.println(warehouses.get(1));
        System.out.println("DUBUG-2");

         */
        for (int i = 0; i < warehouses.size(); i++) {
            warehouse = warehouses.get(i);
            warehouse.startWork();
            System.out.println(warehouse);
            System.out.println();
            warehouse.showWorkersSalary();

        }
    }
}

