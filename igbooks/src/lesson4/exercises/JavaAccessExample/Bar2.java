package lesson4.exercises.JavaAccessExample;

public class Bar2 extends Foo2 {
    private int sum = 10;
    private int result = 30;
    public void reportSum() {
        System.out.println(sum);
        sum += result;
        System.out.println(sum);
    }
}
