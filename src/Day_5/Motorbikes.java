package Day_5;

import java.util.Calendar;

public class Motorbikes {
    public static void main(String[] args) {
        Motorbike motorBike1 = new Motorbike("Иж", "Белый", 1985);
        System.out.println("Название: " + motorBike1.getName() + ". Цвет: " + motorBike1.getColor() + ". Год: " + motorBike1.getYear() + ". Возраст: "+motorBike1.getOld());
    }
}

class Motorbike {
    private int year;
    private String name;
    private String color;

    public  Motorbike(String name, String color, int year) {
        this.name = name;
        this.color = color;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public int getOld() {
        return Calendar.getInstance().get(Calendar.YEAR)-year;
    }
}