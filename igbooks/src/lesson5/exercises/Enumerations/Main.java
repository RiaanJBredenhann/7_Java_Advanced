package lesson5.exercises.Enumerations;

public class Main {
    public static void main(String[] args)
    {
        Computer comp = new Computer();
        comp.setState(Computer.PowerState.SUSPEND);
        System.out.println("Current state: " + comp.getState());
        System.out.println("Description: " + comp.getState().getDescription());
    }
}
