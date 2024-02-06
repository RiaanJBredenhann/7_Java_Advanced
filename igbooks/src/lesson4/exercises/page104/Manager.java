package lesson4.exercises.page104;

public class Manager extends Employee {
    private String departmentName;

    @Override
    public String getDetails() {
        return super.getDetails() + " Department: " + departmentName;
    }
}
