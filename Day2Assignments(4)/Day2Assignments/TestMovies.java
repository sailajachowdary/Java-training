package Day2Assignments;

import java.util.Scanner;

public class TestMovies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Action Movie
        System.out.println("Enter details for Action movie:");
        System.out.print("Title: ");
        String actionTitle = scanner.nextLine();
        System.out.print("ID Number: ");
        int actionId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("MPAA Rating: ");
        String actionRating = scanner.nextLine();
        Movie actionMovie = new Action(actionTitle, actionId, actionRating);

        // Input for Comedy Movie
        System.out.println("\nEnter details for Comedy movie:");
        System.out.print("Title: ");
        String comedyTitle = scanner.nextLine();
        System.out.print("ID Number: ");
        int comedyId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("MPAA Rating: ");
        String comedyRating = scanner.nextLine();
        Movie comedyMovie = new Comedy(comedyTitle, comedyId, comedyRating);

        // Input for Drama Movie
        System.out.println("\nEnter details for Drama movie:");
        System.out.print("Title: ");
        String dramaTitle = scanner.nextLine();
        System.out.print("ID Number: ");
        int dramaId = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("MPAA Rating: ");
        String dramaRating = scanner.nextLine();
        Movie dramaMovie = new Drama(dramaTitle, dramaId, dramaRating);

        // Input for late days
        System.out.print("\nEnter number of days late: ");
        int daysLate = scanner.nextInt();

        // Print late fees
        System.out.println("\nLate fee for action movie: $" + actionMovie.calcLateFees(daysLate));
        System.out.println("Late fee for comedy movie: $" + comedyMovie.calcLateFees(daysLate));
        System.out.println("Late fee for drama movie: $" + dramaMovie.calcLateFees(daysLate));

        // Test equals method
        Movie anotherActionMovie = new Action("Another Action Movie", actionId, "R");
        System.out.println("\nAction movie equals another action movie: " + actionMovie.equals(anotherActionMovie));

        Movie differentActionMovie = new Action("Different Action Movie", 104, "PG-13");
        System.out.println("Action movie equals different action movie: " + actionMovie.equals(differentActionMovie));

        scanner.close();
    }
}
