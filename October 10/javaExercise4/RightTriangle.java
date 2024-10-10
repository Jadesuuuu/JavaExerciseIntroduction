package javaExercise4;

public class RightTriangle extends Triangle {
    private double height;

    public RightTriangle(double sides, double base, double height) {
        super(sides, base);
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return super.calculatePerimeter() + height;
    }

    @Override
    public String toString() {
        return "RightTriangle: sides is " + getSides() + "; base is " + getBase() + "; height is " + height + ".";
    }
}
