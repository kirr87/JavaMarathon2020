package day9.Task1;

public class Teacher extends Human {
    String subjectName;

    public Teacher(String name, String courseName) {
        super(name);
        this.subjectName = courseName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + this.name);
    }
}
