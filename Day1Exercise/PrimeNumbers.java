package Day1Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// for user input take bufferedreader
		BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
		// Enter the number
		System.out.println("Enter the number:");
		int n = Integer.parseInt(r1.readLine());
		// checking the condition if n<= 2 and n!=0 print prime

		if (n <= 2 && n != 0) {
			System.out.println("prime");
		}

		// Checking prime condition
		else if (n % 2 != 0 && n % 3 != 0) {
			System.out.println(n + " is a prime");
		} else {
			System.out.println(n + " not a prime");
		}

	}

}

