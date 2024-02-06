package lesson5.exercises.Enumerations;

public class Main {
    public static void main(String[] args)
    {
        Computer comp = new Computer();
        comp.setState(Computer.PowerState.ON);
        System.out.println("Current state: " + comp.getState());
        System.out.println("Description: " + comp.getState().getDescription());
    }
}
