package lesson4.exercises.JavaAccessExample;

public class Bar1 extends Foo1 {
    private int sum = 10;
    public void reportSum() {
        System.out.println(sum);
        sum += result;
        System.out.println(sum);
        //sum += value;  // compiler error
    }
}
