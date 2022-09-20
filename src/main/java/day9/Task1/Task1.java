package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Петр", "Созвездие");
        Teacher teacher = new Teacher("Иван Иванов", "Астрология");
        student.printInfo();
        teacher.printInfo();
        student.getGroupName();
        teacher.getSubjectName();

    }
}
class Human {
    String name;
    Human(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    void printInfo() {
        System.out.println("Этот человек с именем " + name);
    }
}
class Student extends Human {
    String groupName;

    Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }
    String getGroupName() {
        return groupName;
    }
    void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + name);
    }
}
class Teacher extends Human {
    String subjectName;
    Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }
    String getSubjectName() {
        return subjectName;
    }
    void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + name);
    }
}