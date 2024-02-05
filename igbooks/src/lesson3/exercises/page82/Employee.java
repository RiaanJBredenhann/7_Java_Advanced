package lesson3.exercises.page82;

public class Employee {
    private int employeeID;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empID, String name, String ssn, double salary) {
        this.employeeID = empID;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public String GetName() {
        return this.name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public double GetSalary() {
        return this.salary;
    }

    public void RaiseSalary(double increase) {
        this.salary += increase;
    }
}
