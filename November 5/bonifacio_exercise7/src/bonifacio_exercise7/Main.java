package bonifacio_exercise7;

import java.util.Scanner;

public class Main {
	enum fruit {
		APPLE, BANANA, ORANGE
	}
	
	static class NutritionValue {
		int[] calories = {95, 105, 62};
		double[] vitamin = {7.9, 9.1, 53.2};
	}
	
	public static void main(String[] args) {
		
		System.out.print("Enter a fruit name (Apple, Banana, Orange): ");
		
		Scanner scanner = new Scanner(System.in);
		
		try {		
			String fruitInput = scanner.next().toLowerCase();
			Main.NutritionValue nutValue = new Main.NutritionValue();
			
			String chosenFruit = fruit.APPLE.toString().toLowerCase();
			
			switch (fruitInput) {
			case "apple":
				chosenFruit = fruit.APPLE.toString().toLowerCase();
				System.out.println("Nutritional Information for " + chosenFruit);
				System.out.println("Calories:" + nutValue.calories[0]);
				System.out.println("Vitamin: " + nutValue.vitamin[0] + " mg");
				break;
			case "banana":
				chosenFruit = fruit.BANANA.toString().toLowerCase();
				System.out.println("Nutritional Information for " + chosenFruit);
				System.out.println("Calories:" + nutValue.calories[1]);
				System.out.println("Vitamin: " + nutValue.vitamin[1] + " mg");
				break;
			case "orange":
				chosenFruit = fruit.ORANGE.toString().toLowerCase();
				System.out.println("Nutritional Information for " + chosenFruit);
				System.out.println("Calories:" + nutValue.calories[2]);
				System.out.println("Vitamin: " + nutValue.vitamin[2] + " mg");
				break;
				default:
					System.out.println("Error: Invalid fruit name entered");
			}
		} catch (Exception e) {
			e.getMessage();
		}
		
		scanner.close();
	}
}
