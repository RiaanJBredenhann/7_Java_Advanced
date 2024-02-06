package lesson4.exercises.page106;

public class Employee {
    private int employeeID;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int id, String name, String ssn, double salary) {
        this.employeeID = id;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public String getDetails() {
        return "ID: " + employeeID + " Name: " + name;
    }
}
