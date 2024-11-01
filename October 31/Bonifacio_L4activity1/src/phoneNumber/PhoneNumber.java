package phoneNumber;

import java.util.Scanner;
import exception.OutOfBoundDigitsException;

public class PhoneNumber {
    final static int ARRAY_LENGTH = 5;
    static String[] nameArray = new String[ARRAY_LENGTH];
    static int[] numberArray = new int[ARRAY_LENGTH];

    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in);
        Scanner numberScanner = new Scanner(System.in);

        setContact(nameScanner, numberScanner);
        outputArray();
        findContacts(nameScanner);

        nameScanner.close();
        numberScanner.close();
    }

    private static void setContact(Scanner nameScanner, Scanner numberScanner) {
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            int counter = i + 1;
            String name = "";
            

            boolean validNumber = false;
            while (!validNumber) {
            	System.out.print("Input name #" + counter + " here: ");
                name = nameScanner.nextLine();
                int number = 0;
                if (name.contains("n/a")) {
                    break;
                }
                nameArray[i] = name;
                System.out.print("Input number of name #" + counter + " here: ");
                String input = numberScanner.next();
                try {
                	number = Integer.parseInt(input.trim());  
                	validateDigits(number);
                    numberArray[i] = number;
                    validNumber = true;
                	} catch (NumberFormatException e) {
                	  System.out.println("Invalid input! Please enter a valid phone number (digits only).");
                	} catch (OutOfBoundDigitsException e) {
                		System.out.println(e.getMessage());
                	}
            }
            if (name.contains("n/a")) {
                break;
            }
        }
        System.out.println();
    }

    private static void validateDigits(long number) throws OutOfBoundDigitsException {
        if (String.valueOf(number).length() != 10) {
            throw new OutOfBoundDigitsException("\u001B[31mInvalid phone number! Only 10-digit number is allowed.\u001B[0m\n");
        }
    }

    private static void outputArray() {
        for (int i = 0; i < nameArray.length; i++) {
            int counter = i + 1;
            System.out.println("[" + counter + "] " + nameArray[i]);
        }
        System.out.println();
    }

    private static void findContacts(Scanner scanner) {
        System.out.print("Search a name: ");
        String name = scanner.nextLine();
        for (int i = 0; i < nameArray.length; i++) {
            if (name.equalsIgnoreCase(nameArray[i])) {
                System.out.println("Name: " + nameArray[i] + "\nPhone number: " + numberArray[i]);
            }
        }
    }
}