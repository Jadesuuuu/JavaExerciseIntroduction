package theLibrary;

public class Book {
	private String title;
	private String author;
	private int yearPublished;
	private boolean isRented;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	public boolean isRented() {
		return isRented;
	}
	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}
	
	public Book(String title, String author, int yearPublished) {
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		this.isRented = false;
	}
	
	public void rent() {
		this.isRented = true;
	}
	
	public String toString() {
	    int maxLength = 30;
	    StringBuilder sb = new StringBuilder();
	    sb.append(String.format("%-" + maxLength + "s %-" + maxLength + "s %-" + maxLength + "s%n", title, author, yearPublished));

	    return sb.toString();
	}


}
