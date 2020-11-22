package Day_9.Task_1;

public class Student extends Human{
    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void printInfo() {
        super.printInfo();
        System.out.printf("Этот студент с именем %s из группы %s", super.getName(), groupName);
        System.out.println();
    }
}
