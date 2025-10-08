import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;
    String course;

    Student(String name, int marks, String course) {
        this.name = name;
        this.marks = marks;
        this.course = course;
    }
}

public class StudentStream {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Ravi", 75, "CSE"),
            new Student("Neha", 85, "IT"),
            new Student("Arjun", 65, "CSE")
        );

        students.stream()
                .filter(s -> s.marks > 70)
                .sorted((s1, s2) -> s1.name.compareTo(s2.name))
                .forEach(s -> System.out.println(s.name + " " + s.marks + " " + s.course));
    }
}
