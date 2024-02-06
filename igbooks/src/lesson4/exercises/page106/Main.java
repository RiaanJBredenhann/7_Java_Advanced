package lesson4.exercises.page106;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(101, "John Doe", "ssn101", 12000);
        Manager m = new Manager(102, "Jane Smith", "ssn102", 20000, "Accounting");

        System.out.println(e.getDetails());
        System.out.println(m.getDetails());
    }
}
