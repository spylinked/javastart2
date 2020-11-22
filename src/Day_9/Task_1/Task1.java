package Day_9.Task_1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Роман Пупкин", "Группа погромистов");
        Teacher teacher = new Teacher("Ирина Львовна", "Программирование");

        student.printInfo();
        teacher.printInfo();
    }
}
