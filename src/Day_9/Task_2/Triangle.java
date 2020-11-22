package Day_9.Task_2;

public class Triangle extends Figure{
    private Double[] sides = new Double[3];

    public Triangle(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sides[0] = sideA;
        this.sides[1] = sideB;
        this.sides[2] = sideC;
    }

    @Override
    public double area() {
        Double p = 0.5*(sides[0]+sides[1]+sides[2]);
        return Math.sqrt(p*(p-sides[0])*(p-sides[1])*(p-sides[2]));
    }

    @Override
    public double perimeter() {
        return sides[0]+sides[1]+sides[2];
    }

    @Override
    public void sayArea() {
        System.out.printf("Площадь треугольника %f", this.area());
        System.out.println();
    }

    @Override
    public void sayPerimeter() {
        System.out.printf("Периметр треугольника %f", this.perimeter());
        System.out.println();
    }


}
