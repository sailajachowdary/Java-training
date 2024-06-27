package Day1Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stringpolindrome {

	public static void main(String[] args) throws IOException {
		// For user input take bufferedraeader
		BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String : ");

		String str = r1.readLine();
		// Take an empty string
		String str2 = "";

		// take a for loop to add the reversed characters from str to str2
		for (int i = str.length() - 1; i >= 0; i--) {
			str2 = str2 + str.charAt(i);
		}
		// compare contents in str and str2 if equal if block execute else else block
		// execute
		if (str.equals(str2)) {
			System.out.println("Polindrome");
		} else {
			System.out.println("Not a polindrome");
		}
	}

}
