package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Виктор Иванович", "История права");
        Student student = new Student("Василий", "Первая");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}
