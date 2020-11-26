package Day_14.Task_3;

import java.util.ArrayList;
import java.util.List;

public class People {
    private String name;
    private int age;
    private static List<People> peopleList= new ArrayList<>();

    public People(String name, int age) {
        this.name = name;
        this.age = age;
        peopleList.add(this);
    }

    public static List<People> getAllPeoples() {
        return peopleList;
    }


    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
