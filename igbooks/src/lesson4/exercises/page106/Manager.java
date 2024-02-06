package lesson4.exercises.page106;

import lesson4.exercises.page104.Employee;

public class Manager extends Employee {
    private int employeeID;
    private String name;
    private String ssn;
    private double salary;
    private String departmentName;

    public Manager(int id, String name, String ssn, double salary, String dept) {
        this.employeeID = id;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
        this.departmentName = dept;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " Department: " + departmentName;
    }
}
