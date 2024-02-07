package lesson3.exercises.page93;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(3);
        Box box3 = new Box(2,3,4);

        System.out.println(box1.GetVolume());
        System.out.println(box2.GetVolume());
        System.out.println(box3.GetVolume());
    }
}
