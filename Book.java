package mypack;

public class Book extends Publication {

	int numberOfPages;

	/**This method will set the book information such as title, price, year, and the number of pages of the book
	 */
	public Book(String title, double price, int year, int numberOfPages) {

	super(title, price, year);

	this.numberOfPages = numberOfPages;

	}
	/**The print statement will direct to the table of contents and will make sure that it will look up the specified topic and turn to that specific page
	 */

	public void use() {

	System.out.println("Open book to Table of Contents.");

	System.out.println("Look up topic and turn to corresponding page.");

	}
	
	/**The print statement will print out the number of pages the book has
	 */

	public void print() {

	System.out.println("Book");

	super.print();

	System.out.println("Number of pages is " + numberOfPages);

	}


}
