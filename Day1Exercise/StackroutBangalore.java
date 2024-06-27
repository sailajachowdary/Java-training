package Day1Exercise;

import java.util.Scanner;

public class StackroutBangalore{

	public static void main(String[] args) {
		//Enter the two strings
		System.out.println("Enter the two strings:");
		//using the scanner to take inputs from user
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		char ch = '"';
		
		//string 3 concatinate the two strings with technologies
		
		String str3 = ch + str1.concat(" ").concat("Technologies").concat(" ").concat(str2) + ch;
		
         //compare the contents in str1 and str2 if it equals banglore print ABC Technologies Banglore
		
		if (str1.equals("ABC") && str2.equals("Banglore")) {
			System.out.println(str3);

		}
        // if it equals mumbai print ABC Technologies Mumbai
		
		else if (str1.equals("ABC") && str2.equals("Mumbai")) {
			System.out.println(str3);
		}
		//Else print invalid or not matches the input
		else {
			System.out.println("No input matches");
		}
	}

}
