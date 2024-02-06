package lesson4.exercises.page103;

public class Bar3 extends Foo3 {
    private int sum = 10;
    public void reportSum() {
        System.out.println(sum);
        sum += getResult();
        System.out.println(sum);
    }
}
