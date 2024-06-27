package Day3Exercise;
import java.util.Scanner;

public class BookStore {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input book details
	        System.out.print("Enter ISBN: ");
	        String isbn = scanner.nextLine();
	        System.out.print("Enter Title: ");
	        String title = scanner.nextLine();
	        System.out.print("Enter Author: ");
	        String author = scanner.nextLine();
	        System.out.print("Enter Price: ");
	        double price = scanner.nextDouble();

	        // Create book object
	        Book book = new Book(isbn, title, author, price);

	        // Display book details
	        System.out.println("Book Details:");
	        book.displayDetails();

	        // Input discount percent
	        System.out.print("Enter Discount Percent: ");
	        double discountPercent = scanner.nextDouble();

	        // Calculate discounted price and display
	        double discountedPrice = book.discountedPrice(discountPercent);
	        System.out.println("Price after " + discountPercent + "% discount: " + discountedPrice);


	        scanner.close();
	    }
	}


