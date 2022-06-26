package day6;

import java.util.Random;

class Teacher {
    private String nameT;
    private String subject;

    public Teacher(String nameT, String subject) {
        this.nameT = nameT;
        this.subject = subject;
    }

    public void evaluate(Student s) {
        Random ran = new Random();
        int digit = ran.nextInt(5) + 2;
        String mark;
        if (digit == 2) {
            mark = "неудовлетворительно";
        } else if (digit == 3) {
            mark = "удовлетворительно";
        } else if (digit == 4) {
            mark = "хорошо";
        } else {
            mark = "отлично";
        }
        System.out.println("Преподаватель, " + nameT + ", оценил студента с именем " + s.nameS + ", по предмету " +
                subject + ", на оценку " + mark);

    }

}

class Student {
    String nameS;

    public Student(String nameS) {
        this.nameS = nameS;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Иван Иванович", "история");
        Teacher teacher2 = new Teacher("Петр Петрович", "математика");

        Student student1 = new Student("Максим");
        Student student2 = new Student("Роман");

        teacher1.evaluate(student1);

    }
}
