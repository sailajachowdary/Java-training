package Day3Exercise;

	import java.util.Scanner;

	public class GreatestnumberinArray1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the elements of the array (separated by spaces):");
	        String input = scanner.nextLine();
	        String[] tokens = input.split(" ");
	        int n = tokens.length;
	        int[] numbers = new int[n];
	       
	        for (int i = 0; i < n; i++) {
	            numbers[i] = Integer.parseInt(tokens[i]);
	        }
	       
	        int greatest = findGreatest(numbers);
	       
	        System.out.print("The numbers are: ");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print(numbers[i]);
	            if (i < numbers.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println();
	        System.out.println("The greatest number is: " + greatest);
	       
	        scanner.close();
	    }
	   
	    public static int findGreatest(int[] arr) {
	        int greatest = arr[0];
	        for (int num : arr) {
	            if (num > greatest) {
	                greatest = num;
	            }
	        }
	        return greatest;
	    }
	}

