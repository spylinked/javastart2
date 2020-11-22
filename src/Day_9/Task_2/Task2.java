package Day_9.Task_2;

public class Task2 {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 5.0);
        circle.sayArea();
        circle.sayPerimeter();
        Rectangle rectangle = new Rectangle("green", 5.0, 6.0);
        rectangle.sayArea();
        rectangle.sayPerimeter();
        Triangle triangle = new Triangle("blue", 5.0, 6.0, 7.0);
        triangle.sayArea();
        triangle.sayPerimeter();

    }
}
