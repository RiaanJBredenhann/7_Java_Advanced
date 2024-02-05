package lesson3.exercises.page93;

public class Box {
    private double length, width, height;

    public Box() {
        this.length = 1;
        this.width = 1;
        this.height = 1;
    }

    public Box(double len) {
        this.width = this.height = this.length = len;
    }

    public Box(double l, double w, double h) {
    this.length = l;
    this.width = w;
    this.height = h;
    }

    public double GetVolume() {
        return this.length * this.width * this.height;
    }
}
