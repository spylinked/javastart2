package Day_11;

import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Worker> pickers = new ArrayList();
        ArrayList<Worker> couriers = new ArrayList();
        String[] fio;
        fio = MyUtils.generateName.generateNameM();
        Warehouse warehouse = new Warehouse();
        for (int i = 0; i < warehouse.getMAXCOURIERS(); i++) {
            fio = MyUtils.generateName.generateName();
            couriers.add(new Courier(fio[1] + " " + fio[0]));
            System.out.println("Устроили курьера " + couriers.get(i).getName() + " на завод.");
        }

        for (int i = 0; i < warehouse.getMAXPICKERS(); i++) {
            fio = MyUtils.generateName.generateName();
            pickers.add(new Courier(fio[1] + " " + fio[0]));
            System.out.println("Создали сборщика " + pickers.get(i).getName());
        }

        for (int i = 0; i < warehouse.getMAXCOURIERS(); i++) {
            warehouse.assignWorker(couriers.get(0));
            System.out.println("Устроили курьера " + couriers.get(0).getName() + " на завод");
            couriers.remove(0);
        }

        for (int i = 0; i < warehouse.getMAXPICKERS(); i++) {
            warehouse.assignWorker(pickers.get(0));
            System.out.println("Устроили сборщика " + pickers.get(0).getName() + " на завод.");
            pickers.remove(0);
        }
        warehouse.showWorkers();
    }
}

