package Day3Exercise;
import java.util.Scanner;


public class Employeedemo {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee age: ");
        int age = scanner.nextInt();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        // Create employee object
        Employee employee = new Employee(name, age, salary);

        // Display employee details
        System.out.println("Employee Details:");
        employee.displayDetails();

        // Increase employee salary
        System.out.print("Enter percentage increase in salary: ");
        double increasePercent = scanner.nextDouble();
        employee.increaseSalary(increasePercent);


        scanner.close();
    }
}


