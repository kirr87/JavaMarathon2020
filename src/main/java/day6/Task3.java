package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Василий Иванович", "Информатика");
        Student student = new Student("Инокентий");

        teacher.evaluate(student);
    }
}
