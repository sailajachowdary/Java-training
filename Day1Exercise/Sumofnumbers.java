package Day1Exercise;

import java.util.Scanner;

public class Sumofnumbers {

	public static void main(String[] args) {
		// using scanner take the input from user
		Scanner sc = new Scanner(System.in);
		// Enter a number
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int sum = 0;
		// if number is less then 1000 and greater then 10000 not valid
		if (n < 1000 || n > 10000) {
			System.out.println("Number only 4 digits");
		}
		// adding the sum
		else {
			while (n != 0) {
				sum = sum + n % 10;
				n = n / 10;
			}
			// print the sum
			System.out.println(sum);
		}

	}

}
