package Day_9.Task_2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle ("Red", 10.0 , 10.0 , 10.0),
                new Triangle ("Green",  10.0 , 20.0 , 30.0),
                new Triangle ("Red", 10.0 , 20.0 , 15.0),
                new Rectangle ("Red", 5.0 , 10.0),
                new Rectangle ("Orange", 40.0 , 15.0),
                new Circle ("Red", 4.0),
                new Circle ("Red", 10.0),
                new Circle ("Blue", 5.0)
        };
        System.out.println("Сумма периметров красных фигур: " + calculateRedPerimeter(figures));
        System.out.println("Сумма площадей красных фигур: " + calculateRedArea(figures));

    }
    public static double calculateRedPerimeter(Figure[] figures) {
        double redPerSumm = 0.0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor().equals("Red")) {
                figures[i].sayPerimeter();
                redPerSumm = redPerSumm + figures[i].perimeter();
            }
        }
        return redPerSumm;
    }

    public static double calculateRedArea(Figure[] figures) {
        double redAreaSumm = 0.0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor().equals("Red")) {
                figures[i].sayArea();
                redAreaSumm = redAreaSumm + figures[i].area();
            }
        }
        return redAreaSumm;
    }
}
