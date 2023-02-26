package mypack;

public class CD extends Publication {
	
	int minutes;

	/**This method will set the CD information such as title, price, year, and the total minutes of the CD
	 */
	public CD(String title, double price, int year, int minutes) {

	super(title, price, year);

	this.minutes = minutes;

	}

	/**The print statement will find the topic number and will make sure that it skips to the corresponding section
	 */

	public void use() {

	System.out.println("Look on CD to find topic number.");

	System.out.println("Skip to corresponding section.");

	}
	
	/**The print statement will print out the number of minutes the CD is
	 */
	public void print() {

	System.out.println("CD");

	super.print();

	System.out.println("Number of minutes is " + minutes);

	}
}
