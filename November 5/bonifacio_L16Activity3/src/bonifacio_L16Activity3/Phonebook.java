package bonifacio_L16Activity3;

import java.util.HashMap;

public class Phonebook {
	HashMap<String, Integer> contactNumber;
	
	public Phonebook() {
		this.contactNumber = new HashMap<>();
	}
	
	public void addContacts(String name, int number) {
		contactNumber.put(name, number);
	}
	
	public void displayContact() {
		contactNumber.forEach((name, number) -> {
			System.out.println("+ " + name);
		});
	}
	
	public void searchContact(String name) {
		contactNumber.forEach((n, number) -> {
			if (name.equals(n)) {
				System.out.println("Name: " + n + "\nPhone Number: " + number);
			} else {
				System.out.println("No contacts found.");
			}
		});
	}
	
	
	
}
