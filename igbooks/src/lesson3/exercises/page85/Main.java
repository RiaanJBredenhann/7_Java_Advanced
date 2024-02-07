package lesson3.exercises.page85;

import lesson3.exercises.page82.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(123, "John", "ssn123", 12000.00);
        Manager manager1 = new Manager(456, "Jane", "ssn456", 30000.00, "Accounting");

        System.out.println("Before Change");
        System.out.println();

        System.out.println(employee1.GetName());
        System.out.println(employee1.GetSalary());

        System.out.println();

        System.out.println(manager1.GetName());
        System.out.println(manager1.GetSalary());

        employee1.SetName("Harry");
        employee1.RaiseSalary(10000);
        manager1.SetName("Bob");
        manager1.RaiseSalary(30000);

        System.out.println("After Change");
        System.out.println();

        System.out.println(employee1.GetName());
        System.out.println(employee1.GetSalary());

        System.out.println();

        System.out.println(manager1.GetName());
        System.out.println(manager1.GetSalary());
    }
}
