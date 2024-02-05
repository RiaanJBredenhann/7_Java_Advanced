package lesson3.practices.practice3_1;

public class EmployeeTest {
    public static void main(String[] args) {

        Engineer engineer = new Engineer(123, "John Doe", "ssn123", 100000);
        Manager manager = new Manager(456, "Harry Smith", "ssn456", 120000, "Marketing");
        Admin admin = new Admin(789, "Jane Connors", "ssn789", 140000);
        Director director = new Director(427, "Maggie Nolan", "ssn427", 200000, "Global Marketing", 1_000_000.00);

        engineer.printEmployee();
        admin.printEmployee();
        manager.printEmployee();
        director.printEmployee();

        System.out.println();

        System.out.println("Modifying Data:");
        manager.setName("Barbara Johnson-Smythe");
        manager.raiseSalary(10_000.00);
        manager.printEmployee();
    }
}
