import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Sachin", 50000),
            new Employee(2, "Aman", 40000),
            new Employee(3, "Riya", 60000)
        );

        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
        employees.forEach(e -> System.out.println(e.id + " " + e.name + " " + e.salary));
    }
}
