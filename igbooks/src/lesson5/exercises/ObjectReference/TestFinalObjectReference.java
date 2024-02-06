package lesson5.exercises.ObjectReference;

public class TestFinalObjectReference {
    public static void main(String[] args) {
        final Employee emp1 = new Employee(1, "Sue", "02-002-1234", 10000.00);
        Employee emp2 = new Employee(1, "Sue", "02-002-1234", 10000.00);

        System.out.println(emp1.getEmpId());
        emp1.setID(100);
        System.out.println(emp1.getEmpId());

        // emp1 = emp2 // cannot change reference to a different object because emp1 is final
    }
}
