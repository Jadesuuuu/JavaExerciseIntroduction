package theLibrary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BookRentalSystem {
	
	 private static Book[] books = {
			 new FictionBook("The Lord of the Rings", "J.R.R. Tolkien", 1954),
			 new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960),
			 new NonFictionBook("The Tipping Point", "M. Gladwell", 2000),
			 new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", 1997)
			 };
	    
	    public static void main(String[] args) {
//	    	displayBooks();
	    	rentedBooks();
	    	try {
				writeToFile();
				readFromFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	    
		static
		void rentedBooks() {
	    	for (int i = 0; i < books.length; i++) {
	    		if (books[i].getTitle().equals("The Lord of the Rings")) {
	    			books[i].rent();
	    		} 
	    		if (books[i].getTitle().equals("The Tipping Point")) {
	    			books[i].rent();
	    		}
	    	}
	    }
	    
	    static void displayBooks() {
	    	System.out.println("* * * * * * * * * * * * * L I B R A R Y * * * * * * * * * * * * * * *");
	    	for (int i = 0; i < books.length; i++) {
	    		System.out.println(books[i]);
	    	}
	    }
	    
	    static void writeToFile() throws IOException {
	    	FileWriter f = new FileWriter("output.txt");
			try (BufferedWriter fw = new BufferedWriter(f)) {
				fw.write("* * * * * * * * * * * * * L I B R A R Y * * * * * * * * * * * * * * *");
				fw.newLine();
				for (int i = 0; i < books.length; i++) {
					fw.write(books[i].toString());
				}
				fw.newLine();
				fw.write("* * * * * * * * * *BOOKS RENTED, NEVER READ * * * * * * * * * * * *");
				fw.newLine();
				for(int i = 0; i < books.length; i++) {
					if (books[i].isRented()) {
		    			fw.write(books[i].toString());
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
