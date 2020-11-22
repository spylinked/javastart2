package Day_9.Task_2;

public class Circle extends Figure{
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*(Math.pow(radius,2));
    }

    @Override
    public double perimeter() {
        return radius*(Math.PI*2);
    }

    @Override
    public void sayArea() {
        System.out.printf("Площадь круга %f", this.area());
        System.out.println();
    }

    @Override
    public void sayPerimeter() {
        System.out.printf("Длина окружности %f", this.perimeter());
        System.out.println();
    }

}
