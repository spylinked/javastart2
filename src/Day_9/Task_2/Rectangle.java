package Day_9.Task_2;

public class Rectangle extends Figure{
    private Double[] sides = new Double[2];

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sides[0] = sideA;
        this.sides[1] = sideB;
    }

    @Override
    public double area() {
        return sides[0]*sides[1];
    }

    @Override
    public double perimeter() {
        return 2*(sides[0]+sides[1]);
    }

    @Override
    public void sayArea() {
        System.out.printf("Площадь прямоугольника %f", this.area());
        System.out.println();
    }

    @Override
    public void sayPerimeter() {
        System.out.printf("Периметр прямоугольника %f", this.perimeter());
        System.out.println();
    }


}
