package Day3Exercise;

	import java.util.Scanner;
	import java.util.Arrays;

	public class ArrayInAscendingorder {
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
	       
	        Arrays.sort(numbers);
	       
	        System.out.print("Sorted array in ascending order: ");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print(numbers[i]);
	            if (i < numbers.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        scanner.close();
	    }
	}



