package Day_9.Task_1;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.printf("Этот человек с именем %s", name);
        System.out.println();
    }
}
