package mypack;

import java.util.Scanner;
public class TestPublication {
	
	/**This is the main code where the program will be executed
	*/

	public static void main(String[] args) {
		Scanner scanner = null;

		try {

		scanner = new Scanner(System.in);

		System.out.print("\t\t\tEnter number of Publications:\t");

		int noofPub = scanner.nextInt();

		scanner.nextLine();

		Publication publication[] = new Publication[noofPub];

		for (int i = 0; i < noofPub; i++) {

		System.out.print("Enter title: ");

		String title = scanner.nextLine();
		
		System.out.print("Enter price: ");

		double price = scanner.nextDouble();

		System.out.print("Enter publication year: ");

		int year = scanner.nextInt();

		System.out.print("Is publication a Book (b) or CD (c): ");

		String typeOfPub = scanner.next();

		if (typeOfPub.equalsIgnoreCase("c")) {

		System.out.print("Enter minutes: ");

		int minutes = scanner.nextInt();

		publication[i] = new CD(title, price, year, minutes);

		} else if (typeOfPub.equalsIgnoreCase("b")) {
		
			System.out.print("Enter pages: ");

			int pages = scanner.nextInt();

			publication[i] = new Book(title, price, year, pages);

			}

			scanner.nextLine();

			System.out.println();

			}

		for (int i = 0; i < noofPub; i++) {

		publication[i].raisePrice(10);

		publication[i].print();

		System.out.println();

		publication[i].use();

		System.out.println("\n");
		
		}

		} catch (Exception e) {

		e.printStackTrace();

		} finally {

		scanner.close();
		}

	}

}
