package TheLibrary;

public class BookRentalSystem {
	
	 private static Book[] books = {
			 new FictionBook("The Lord of the Rings", "J.R.R. Tolkien", 1954),
			 new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960),
			 new NonFictionBook("The Tipping Point", "M. Gladwell", 2000),
			 new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", 1997)
			 };
	    
	    public static void main(String[] args) {
	    	displayBooks();
	    	rentedBooks();
		}
	    
		static
		void rentedBooks() {
			System.out.println("* * * * * * * * * *BOOKS RENTED, NEVER READ * * * * * * * * * * * *");
	    	for (int i = 0; i < books.length; i++) {
	    		if (books[i].getTitle().equals("The Lord of the Rings")) {
	    			books[i].rent();
	    		} 
	    		if (books[i].getTitle().equals("The Tipping Point")) {
	    			books[i].rent();
	    		}
	    		if (books[i].isRented()) {
	    			System.out.println(books[i].toString());
	    		}
	    	}
	    }
	    
	    static void displayBooks() {
	    	System.out.println("* * * * * * * * * * * * * L I B R A R Y * * * * * * * * * * * * * * *");
	    	for (int i = 0; i < books.length; i++) {
	    		System.out.println(books[i]);
	    	}
	    }

}
