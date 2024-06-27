package test2;

import test.Foundation;
import java.util.Scanner;

public class TestFoundation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter values for the variables
        System.out.println("Enter value for var1 (private): ");
        int var1 = scanner.nextInt();

        System.out.println("Enter value for var2 (default): ");
        int var2 = scanner.nextInt();

        System.out.println("Enter value for var3 (protected): ");
        int var3 = scanner.nextInt();

        System.out.println("Enter value for var4 (public): ");
        int var4 = scanner.nextInt();

        // Create an instance of the Foundation class
        Foundation foundation = new Foundation(var1, var2, var3, var4);

        // Try to access all the variables
        // System.out.println("Var1 (private): " + foundation.var1); // This will cause an error because var1 is private
        System.out.println("Var1 (private, accessed via getter): " + foundation.getVar1());
        //System.out.println("Var2 (default): " + foundation.var2);
        //System.out.println("Var3 (protected): " + foundation.var3);
        System.out.println("Var4 (public): " + foundation.var4);

        scanner.close();
    }
}
