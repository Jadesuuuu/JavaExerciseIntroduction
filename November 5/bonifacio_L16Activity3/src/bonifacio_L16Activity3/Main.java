package bonifacio_L16Activity3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Phonebook phonebook = new Phonebook();
		while (true) {	
			Scanner scanner = new Scanner(System.in);
			System.out.println("[1] Add Contacts\n[2] Display Contacts\n[3] Search Contact\n[4] Close\n\n");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1: 
				System.out.print("Enter name here: ");
				String name = scanner.next();
				scanner.nextLine();
				System.out.print("Enter number here: ");
				int number = Integer.parseInt(scanner.nextLine());
				phonebook.addContacts(name, number);
				break;
			case 2: 
				phonebook.displayContact();
				break;
			case 3: 
				System.out.print("Search a name: ");
				String name1 = scanner.nextLine();
				phonebook.searchContact(name1);
				break;
			case 4: 
				System.out.println("Exiting phone"
						+ "book.");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
