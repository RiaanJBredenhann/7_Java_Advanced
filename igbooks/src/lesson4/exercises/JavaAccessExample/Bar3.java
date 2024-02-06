package lesson4.exercises.JavaAccessExample;

public class Bar3 extends Foo3 {
    private int sum = 10;
    public void reportSum() {
        System.out.println(sum);
        sum += getResult();
        System.out.println(sum);
    }
}