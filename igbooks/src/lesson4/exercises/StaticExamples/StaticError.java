package lesson4.exercises.StaticExamples;


public class StaticError {
    
    private int x;
    
    public static void staticMethod() {
    /*  
        x = 1; // compile error
        instanceMethod(); // compile error
    */
    }
    
    public void instanceMethod() {
        x = 2;
    }
}