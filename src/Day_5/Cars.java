package Day_5;

public class Cars {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setName("Мазда");
        car1.setColor("Красная");
        car1.setYear(2010);

        System.out.println("Название: " + car1.getName() + ". Цвет: " + car1.getColor() + ". Год: " + car1.getYear());
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
}