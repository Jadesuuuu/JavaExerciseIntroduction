package JavaExercise2;

import java.util.Arrays;

public class exer2 {
	public static void main(String[] args) {
		
		int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] finalArr = findTarget(array, 17);
		
		if (finalArr == null) {
			System.out.println("No match found");
		} else {
			System.out.println(Arrays.toString(finalArr));
		}
		
	}
	
	public static int[] findTarget(int[] array, int target) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == target) {
					return new int[] {i, j};
				} 
			}
		}
		return null;
	}
}


