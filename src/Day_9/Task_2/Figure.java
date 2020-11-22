package Day_9.Task_2;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimeter();
    public abstract void sayArea();
    public abstract void sayPerimeter();

}
