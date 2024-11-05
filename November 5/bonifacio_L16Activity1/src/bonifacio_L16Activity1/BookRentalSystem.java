package bonifacio_L16Activity1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class BookRentalSystem {
	private static ArrayList<Object> library = new ArrayList<>();
	   
	public static void addBooks() {
		library.add(new FictionBook("The Lord of the Rings", "J.R.R. Tolkien", 1954));
		library.add(new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960));
		library.add(new NonFictionBook("The Tipping Point", "M. Gladwell", 2000));
		library.add(new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", 1997));
	}
	
	
	public static void main(String[] args) {
		addBooks();
	    rentedBooks();
	    try {
			writeToFile();
			readFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	    
	static void rentedBooks() {
		LocalDate localDate = LocalDate.now();
		for (int i = 0; i < library.size(); i++) {
			if (((Book) library.get(i)).getTitle().equals("The Lord of the Rings")) {
				((Book) library.get(i)).rent();
				((Book) library.get(i)).setDate(localDate);
				((Book) library.get(i)).setReturnedDate(localDate.plusDays(3));
				((Book) library.get(i)).setFine(30.0);
			}
			if (((Book) library.get(i)).getTitle().equals("The Tipping Point")) {
				((Book) library.get(i)).rent();
				((Book) library.get(i)).setDate(localDate);
				((Book) library.get(i)).setReturnedDate(localDate.plusDays(3));
				((Book) library.get(i)).setFine(15.0);
			}
		}
		
	}
	    
	static void displayBooks() {
	    System.out.println("* * * * * * * * * * * * * L I B R A R Y * * * * * * * * * * * * * * *");
	    library.forEach(s -> {
	    	System.out.println(s);
	    });
	}
	    
	static void writeToFile() throws IOException {
	    FileWriter f = new FileWriter("output.txt");
		try (BufferedWriter fw = new BufferedWriter(f)) {
			fw.write("* * * * * * * * * * * * * L I B R A R Y * * * * * * * * * * * * * * *");
			fw.newLine();
			for (int i = 0; i < library.size(); i++) {

				fw.write(((Book) library.get(i)).toString());
			}
			fw.newLine();
			fw.write("* * * * * * * * * *BOOKS RENTED, NEVER READ * * * * * * * * * * * *");
			fw.newLine();
			for(int i = 0; i < library.size(); i++) {

				if (((Book) library.get(i)).isRented()) {
					fw.write(((Book) library.get(i)).toString()
							+ "Due Date: " + ((Book) library.get(i)).getDate() + "      "
							+ "Returned Date: " + ((Book) library.get(i)).getReturnedDate() + "      "
							+ "Fine: " + ((Book) library.get(i)).getFine() + "      "
							+ "\n\n");
				}
			}
		}
	}
	    
	static void readFromFile() throws FileNotFoundException {
	    BufferedReader reader;
	    try {
	    	reader = new BufferedReader(new FileReader("Output.txt"));
			String line = reader.readLine();
				
			while(line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
