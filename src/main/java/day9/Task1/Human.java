package day9.Task1;

public class Human {
    String name;

    public Human(String name) {
        this.name = name;
    }

    public String getSubjectName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + name);
    }
}
