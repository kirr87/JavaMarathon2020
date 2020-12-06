package day6;

public class Teacher {
    private String name;
    private String course;

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public void evaluate(Student student){
        String app = "";
            switch (2 + (int) ( Math.random() * 4 )){
                case 2:
                    app = "неудовлетворительно";
                    break;
                case 3:
                    app = "удовлетворительно";
                    break;
                case 4:
                    app = "хорошо";
                    break;
                case 5:
                    app = "отлично";
        }
        System.out.println("Преподаватель "+name+ " оценил студента с именем "+ student.getName()+" на оценку: "+app);
    }
}
