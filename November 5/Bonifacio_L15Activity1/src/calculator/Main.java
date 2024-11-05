package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
           try {
        	   System.out.print("Enter the first number: ");
               double num1 = scanner.nextDouble();

               System.out.print("Enter the second number: ");
               double num2 = scanner.nextDouble();

               GenericsCalculator<Double> calculator = new GenericsCalculator<>(num1, num2);

               System.out.println("[A] Addition");
               System.out.println("[B] Subtraction");
               System.out.println("[C] Multiplication");
               System.out.println("[D] Division");
               System.out.println("[E] Exit Program");

               System.out.print("Enter the operation: ");
               char operation = scanner.next().toUpperCase().charAt(0);

               switch (operation) {
                   case 'A':
                       System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, calculator.add());
                       break;
                   case 'B':
                       System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, calculator.subtract());
                       break;
                   case 'C':
                       System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, calculator.multiply());
                       break;
                   case 'D':
                       if (num2 == 0) {
                           System.out.println("Error: Division by zero");
                       } else {
                           System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, calculator.divide());
                       }
                       break;
                   case 'E':
                       System.out.println("Exiting program...");
                       scanner.close();
                       return;
                   default:
                       System.out.println("Invalid operation");
               }
               System.out.println();
           } catch (InputMismatchException e) {
        	   System.out.println("Please insert valid format.\n");
        	   break;
           }
        }
    }
}
