package javaExercise4;

public class Triangle {
    protected double sides;
    protected double base;

    public Triangle(double sides, double base) {
        this.sides = sides;
        this.base = base;
    }

    public double getSides() {
        return sides;
    }

    public double getBase() {
        return base;
    }

    public double calculateArea() {
    	double semiperimeter = (sides + sides + base) / 2.0;
        double area = Math.sqrt(semiperimeter * (semiperimeter - sides) * (semiperimeter - sides) * (semiperimeter - base));
        return area;
    }

    public double calculatePerimeter() {
    	return sides + sides + base;
    }
}
	
