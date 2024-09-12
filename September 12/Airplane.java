package JavaExercise2;

import java.util.Arrays;
import java.util.Scanner;

public class Airplane {
	
	static boolean[] seatAvailable = new boolean[10];
	
	public static void main(String[] args) {
		Arrays.fill(seatAvailable, false);	
		Scanner scanner = new Scanner(System.in);
		int classNum;
		int seatNumber;
		String classType = "";
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print("Please type 1 for First Class and Please type 2 for Economy: ");
			classNum = scanner.nextInt();
			seatNumber = setSeat(classNum);
			
			if (seatNumber < 6) {
				classType = " First Class";
			} else classType = " Economy";
			
			if (classNum == 1) {
				classType = " First Class";
			} else classType = " Economy";
			
			
			
			System.out.println("Your seat number is " + seatNumber + classType);
			System.out.println(Arrays.toString(seatAvailable));
		}
		scanner.close();

	}
	
	private static int setSeat(int classNum) {

		int counter = 0;
		int seatNumber = 0;
		for (int i = 0; i < seatAvailable.length; i++) {
			if (seatAvailable[i] == false) {
				counter = i;
				break;
			}
		}
		
		if (classNum == 1) {
			seatAvailable[counter] = true;
			seatNumber = counter;
			counter = 0;
		} else if (classNum == 2){
			seatAvailable[counter + 4] = true;
			seatNumber = counter;
			counter = 0;
		}
		return seatNumber + 1;
	}

}
