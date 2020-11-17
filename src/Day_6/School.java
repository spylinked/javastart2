package Day_6;

import java.util.Random;

public class School {
    public static void main(String[] args) {
        Random rnd = new Random();
        String[] studNames = {"Роман", "Иван", "Олег", "Пётр", "Алексей", "Геннадий"};
        String[] studSurNames = {"Романовичч", "Иванович", "Олегович", "Петрович", "Алексейевич", "Геннадьевич"};
        String[] teachNames = {"Ирина", "Светлана", "Мария", "Кристина", "Галина", "Марфа"};
        String[] teachSurNames = {"Михаиловна", "Анатольевна", "Петровна", "Романовна", "Николаевна", "Святославна"};
        String[] subjects = {"Математика", "Русский Язык", "Физика", "Химия", "Физкультура", "Литература"};

        Student[] students = new Student[5];
        Teacher[] teachers = new Teacher[subjects.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(studNames[rnd.nextInt(6)] + " " + studSurNames[rnd.nextInt(6)]);
            students[i].info();
        }

        for (int i = 0; i < teachers.length; i++) {
            teachers[i] = new Teacher(teachNames[rnd.nextInt(teachNames.length)] + " " + teachSurNames[rnd.nextInt(teachNames.length)], subjects[i]);
            teachers[i].info();
        }
        for (int i = 0; i < 20; i++) {
            teachers[rnd.nextInt(teachers.length)].evaluate(students[rnd.nextInt(students.length)]);
        }

        for (int i = 0; i < students.length; i++) {
            students[i].getGrades();
        }
    }
}

class Teacher{
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student){
        Random rnd = new Random();
        int grade = rnd.nextInt(4)+2;
        student.addGrade(grade, this.subject);
        System.out.println("Ученик " + student.getName() + " Получил оценку " + grade + " от " + this.name + " по предмету " + this.subject);
    }
    public void info() {
        System.out.println("Преподаватель " + name + "; Предмет: " + subject);
    }
}

class Student{
    private String name;
    private String gradesList;

    public Student(String name) {
        this.name = name;
        gradesList = "";
    }

    public void addGrade(int grade, String subject) {
        this.gradesList = gradesList + subject + " - " + grade + "; ";
    }

    public void getGrades() {
        System.out.println(name + " получил следующие оценки: ");
        System.out.println(gradesList);
    }
    public void info() {
        System.out.println("Ученик " + name);
    }

    public String getName() {
        return name;
    }
}