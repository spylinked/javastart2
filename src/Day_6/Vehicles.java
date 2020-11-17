package Day_6;

import java.util.Calendar;

public class Vehicles {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Bombardier", 2010, 67, 1700);
        plane1.info();
        plane1.fillUp(40);
        plane1.info();
        plane1.fillUp(70);
        plane1.setLength(77);
        plane1.setYear(2011);
        plane1.info();
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

    public String info() {
        return "Это мотоцикл";
    }

    public int yearDifference(int compYear){
        return compYear-year;
    }
}

class Car {
    private int year;
    private String name;
    private String color;

    public void setName(String carName) {
        if (carName.isEmpty()) {
            System.out.println("Пустое название");
        } else {
            name = carName;
        }
    }
    public void setYear(int carYear) {
        if (carYear <0) {
            System.out.println("Год меньше 0");
        } else {
            year = carYear;
        }
    }
    public void setColor(String carColor) {
        if (carColor.isEmpty()) {
            System.out.println("Пустой цвет");
        } else {
            color = carColor;
        }
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

    public String info() {
        return "Это автомобиль";
    }
}

class Airplane{
    String producer;
    int year;
    int length;
    int weight;
    int fuel;

    public  Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: "+ producer +", год выпуска: " + year + " , длина: "+ length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int fillFuel) {
        this.fuel = this.fuel + fillFuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
