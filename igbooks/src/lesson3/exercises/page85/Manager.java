package lesson3.exercises.page85;

public class Manager extends Employee {
    private int employeeID;
    private String name;
    private String ssn;
    private double salary;
    private String departmentName;

    public Manager(int employeeID, String name, String ssn, double salary, String deptName) {
        super(employeeID, name, ssn, salary);
        this.salary = salary;
        this.departmentName = deptName;
    }

    public void SetID(int id) {
        this.employeeID = id;
    }

    public int GetID() {
        return this.employeeID;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String GetName() {
        return this.name;
    }

    public void SetSSN(String ssn) {
        this.ssn = ssn;
    }

    public String GetSSN() {
        return this.ssn;
    }

    public void SetSalary(double salary) {
        this.salary = salary;
    }

    public double GetSalary() {
        return this.salary;
    }

    public void SetDepartment(String dept) {
        this.departmentName = dept;
    }

    public String GetDepartment() {
        return this.departmentName;
    }

}
