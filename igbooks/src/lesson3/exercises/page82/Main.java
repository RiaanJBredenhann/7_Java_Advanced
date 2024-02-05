package lesson3.exercises.page82;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(123, "John", "ssn", 12000.00);

        System.out.println("Before Change");
        System.out.println(employee1.GetName());
        System.out.println(employee1.GetSalary());

        employee1.SetName("Harry");
        employee1.RaiseSalary(10000);

        System.out.println("After Change");
        System.out.println(employee1.GetName());
        System.out.println(employee1.GetSalary());
    }
}
