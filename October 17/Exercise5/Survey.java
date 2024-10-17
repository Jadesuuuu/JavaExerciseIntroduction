package survey;

import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Survey {
	public static void main(String[] args) {
		try {
			getResponse();
			getNumbers();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void getResponse() throws IOException {
		try (Formatter formatter1 = new Formatter("numbers.txt")) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("WELCOME TO SURVEY RESPONSES");
			while(true) {
				System.out.println("Enter survey response from 1-10: ");
				int answer = scanner.nextInt();
				if (answer < 1 || answer > 10) {
					break;
				}
				formatter1.format(answer + "\n");
			
			}
			scanner.close();
		}
	}
	
	static void getNumbers() throws IOException {
		try (Formatter formatter1 = new Formatter("output.txt")) {
			FileReader fr = new FileReader("numbers.txt");
			Scanner scanner = new Scanner(fr);
			
			while(scanner.hasNextInt()) {
				int readInt = scanner.nextInt();
				formatter1.format(readInt + "\n");
			}
			scanner.close();
		}
	}
}
