package JavaExercise1;

public class GoodEmployees {
	public static void main(String[] args) {
		int[] hours = {7, 7, 8, 9, 5, 10};
		getGoodEmployees(hours);
	}
	
	private static void getGoodEmployees(int[] employees) {
		for (int i = 0; i < employees.length ; i++) {
			if(employees[i] >= 8) {
				System.out.println("Employee: " + i);
			}
		}
	}
}
