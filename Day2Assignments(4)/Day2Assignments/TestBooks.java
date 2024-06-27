package Day2Assignments;

import java.util.Scanner;

//Main class to test the functionality
public class TestBooks {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Input for Magazine
     System.out.println("Enter details for Magazine:");
     System.out.print("ISBN: ");
     String magIsbn = scanner.nextLine();
     System.out.print("Title: ");
     String magTitle = scanner.nextLine();
     System.out.print("Price: "); 
     double magPrice = scanner.nextDouble();
     scanner.nextLine(); // consume newline
     System.out.print("Type: ");
     String magType = scanner.nextLine();
     Magazine magazine = new Magazine(magIsbn, magTitle, magPrice, magType);

     // Input for Novel
     System.out.println("\nEnter details for Novel:");
     System.out.print("ISBN: ");
     String novelIsbn = scanner.nextLine();
     System.out.print("Title: ");
     String novelTitle = scanner.nextLine();
     System.out.print("Price: ");
     double novelPrice = scanner.nextDouble();
     scanner.nextLine(); // consume newline
     System.out.print("Author: ");
     String novelAuthor = scanner.nextLine();
     Novel novel = new Novel(novelIsbn, novelTitle, novelPrice, novelAuthor);

     // Display details
     System.out.println("\nMagazine Details:");
     magazine.displayDetails();

     System.out.println("\nNovel Details:");
     novel.displayDetails();

     scanner.close();
 }
}