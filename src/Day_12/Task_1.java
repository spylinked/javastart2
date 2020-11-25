package Day_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {
        List<String> carsList = new ArrayList<>(Arrays.asList("Audi", "BMW", "Mercedes", "Toyota", "Nissan"));
        /*
        List<String> carsList = new ArrayList<>();

        carsList.add("Audi");
        carsList.add("BMW");
        carsList.add("Mercedes");
        carsList.add("Toyota");
        carsList.add("Nissan");
         */
        System.out.println("Create");
        System.out.println(carsList);

        carsList.add(Math.round(carsList.size()/2), "KIA");

        System.out.println("Add to middle");
        System.out.println(carsList);

        carsList.remove(0);

        System.out.println("Remove first");
        System.out.println(carsList);


    }
}
