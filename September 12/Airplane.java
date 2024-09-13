package JavaExercise2;

import java.util.Arrays;
import java.util.Scanner;

public class Airplane {

    static boolean[] seatAvailable = new boolean[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please type 1 for First Class and Please type 2 for Economy: ");
            int classNum = scanner.nextInt();
            while(true) {
            	if (classNum == 1 || classNum == 2) {
            		break;
            	}
            	System.out.print("Enter valid class: ");
            	classNum = scanner.nextInt();
            	
            }
            systemResponse(scanner, classNum); 
            if (isThereSeatAvailable() == false) {
            	System.err.println("No more seats available. Flight leaves in 3 hours.");
                break;
            }
        }
        scanner.close();
    }

    private static boolean isThereSeatAvailable() {
        for (int i = 0; i < seatAvailable.length; i++) {
            if (seatAvailable[i] == false) {
                return true;
            }
        }
        return false;
    }

    private static int setSeat(int start, int end) {

        for (int i = start; i <= end; i++) {
            if (seatAvailable[i] == false) {
                seatAvailable[i] = true;
                return i + 1;
            }
        }
        return 0;
    }

    private static void systemResponse(Scanner scanner, int classNum) {
        String classType1, classType2;
        if (classNum == 1) {
            classType1 = "First-class";
            classType2 = "Economy";
        } else {
            classType1 = "Economy";
            classType2 = "First-class";
        }

        int setSeat = 1;
        if (classNum == 1) {
        	setSeat = setSeat(0, 4);
        } else if (classNum == 2) {
        	setSeat = setSeat(5, 9);
        }
        char answer = 'n';

        if (setSeat == 0) {
            System.err.print(classType1 + " is full. Would you like to to be placed at " + classType2 + "? Type y if yes, n if no: ");

            if (scanner.hasNext()) { 
                answer = scanner.next().charAt(0);
            }

            while (true) {
                if (Character.toLowerCase(answer) == Character.toLowerCase('y')) {
                    System.out.println("Your boarding pass: " + classType1 + ", " + "seat " + setSeat(0, 9));
                    System.out.println();
                    break;
                } else if (Character.toLowerCase(answer) == Character.toLowerCase('n')) {
                    System.err.println("Next flight leaves in 3 hours. ");
                    break;
                }
                System.out.print("Type y for yes, n for no: ");
                answer = scanner.next().charAt(0);
            }
        } else {
            System.out.println("Your boarding pass: " + classType1 + "," + "seat " + setSeat);
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println(Arrays.toString(seatAvailable));
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
    }
}