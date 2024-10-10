package javaExercise4;

public class Main {
	public static void main(String[] args) {
        
        Triangle generalTriangle = new Triangle(5, 3);
        RightTriangle rightTriangle = new RightTriangle(4, 3, 5);
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(4, 3);

        // Calculate and print area and perimeter for each triangle
        System.out.println("General Triangle:");
        System.out.println("Area: " + generalTriangle.calculateArea());
        System.out.println("Perimeter: " + generalTriangle.calculatePerimeter());

        System.out.println("\nRight Triangle:");
        System.out.println("Area: " + rightTriangle.calculateArea());
        System.out.println("Perimeter: " + rightTriangle.calculatePerimeter());

        System.out.println("\nIsosceles Triangle:");
        System.out.println("Area: " + isoscelesTriangle.calculateArea());
        System.out.println("Perimeter: " + isoscelesTriangle.calculatePerimeter());
    }
}
