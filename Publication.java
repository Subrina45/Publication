package mypack;

public abstract class Publication {
	
	String title;

	double price;

	int year;
	
	/**This method will set the title, price, and the year of the publication
	*/
	
	public Publication(String title, double price, int year) {

		this.title = title;

		this.price = price;

		this.year = year;

		}
	
	/**This method is setting the calculation to find the calculation of percentage of the price
	*/

	public void raisePrice(int percent) {

	price = price + (price * ((double) percent / 100.00));

	}

	/**This method is used to print out the publication object
	*/
	public void print() {

		System.out.printf("Title is %s\nPrice is %.2f\nPublication Year is %d\n", title, price, year);

		}
	public abstract void use();

}
