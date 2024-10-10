package javaExercise4;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double sides, double base) {
        super(sides, base);
    }

    @Override
    public double calculateArea() {
        return Math.sqrt(Math.pow(sides, 2) - Math.pow(base / 2, 2)) * base;
    }

    @Override
    public double calculatePerimeter() {
        return base + 2 * sides;
    }

    @Override
    public String toString() {
        return "IsoscelesTriangle: sides is " + getSides() + " and base is " + getBase() + ".";
    }
}
