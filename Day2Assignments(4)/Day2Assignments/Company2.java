package Day2Assignments;

import java.util.Scanner;

public class Company2 {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        // Array to store employees
        Employee[] employees = new Employee[5];
        // Array to store managers
        Manager[] managers = new Manager[2];

        // Input details for 5 employees
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Employee Number: ");
            int empNo = scanner.nextInt();
            scanner.nextLine();  // consume newline
            System.out.print("Name: ");
            String eName = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Contact Number: ");
            String contactNo = scanner.nextLine();

            employees[i] = new Employee(empNo, eName, address, contactNo);
        }

        // Input details for 2 managers
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter details for manager " + (i + 1) + ":");
            System.out.print("Employee Number: ");
            int empNo = scanner.nextInt();
            scanner.nextLine();  // consume newline
            System.out.print("Name: ");
            String eName = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Contact Number: ");
            String contactNo = scanner.nextLine();
            System.out.print("Department: ");
            String dept = scanner.nextLine();
            System.out.print("Number of Reportees: ");
            int numberOfReportees = scanner.nextInt();
            scanner.nextLine();  // consume newline

            managers[i] = new Manager(empNo, eName, address, contactNo, dept, numberOfReportees);
        }

        // Display details of all employees
        System.out.println("\nDetails of all employees:");
        for (Employee employee : employees) {
            employee.display();
            System.out.println();
        }

        // Display details of all managers
        System.out.println("Details of all managers:");
        for (Manager manager : managers) {
            manager.display();
            System.out.println();
        }

        scanner.close();
    }
}
