package Day2Assignments;

import java.util.Scanner;

  public class BankAccount {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        // Input details for first account holder
        System.out.println("Enter details for first account holder:");
        System.out.print("Account Number: ");
        String acNo1 = scanner.nextLine();
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Contact Number: ");
        String contactNo1 = scanner.nextLine();
        System.out.print("Account Type (SB, FD, CR): ");
        String acType1 = scanner.nextLine();
        System.out.print("Balance: ");
        double bal1 = scanner.nextDouble();
        scanner.nextLine();  // consume newline

        // Input details for second account holder
        System.out.println("Enter details for second account holder:");
        System.out.print("Account Number: ");
        String acNo2 = scanner.nextLine();
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Contact Number: ");
        String contactNo2 = scanner.nextLine();
        System.out.print("Account Type (SB, FD, CR): ");
        String acType2 = scanner.nextLine();
        System.out.print("Balance: ");
        double bal2 = scanner.nextDouble();
        scanner.nextLine();  // consume newline

        // Creating account holders with provided details
        
        AccountDetails a1 = new AccountDetails(acNo1, name1, contactNo1, acType1, bal1);
        AccountDetails a2 = new AccountDetails(acNo2, name2, contactNo2, acType2, bal2);

        // Displaying account holder details
        
        System.out.println("\nDetails of first account holder:");
        a1.display();
        
        System.out.println("\nDetails of second account holder:");
        a2.display();

        scanner.close();
    }
}