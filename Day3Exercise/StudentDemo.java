package Day3Exercise;


import java.util.Scanner;

public class StudentDemo {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create array to store 5 students
	        Student[] students = new Student[5];

	        // Input details for each student
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Enter details for Student " + (i+1) + ":");
	            System.out.print("Student ID: ");
	            int studentId = scanner.nextInt();
	            scanner.nextLine(); // Consume newline character
	            System.out.print("Name: ");
	            String name = scanner.nextLine();
	            System.out.print("Contact No: ");
	            String contactNo = scanner.nextLine();
	            System.out.print("Course: ");
	            String course = scanner.nextLine();
	            System.out.print("Fees: ");
	            double fees = scanner.nextDouble();

	            // Create student object and add to array
	            students[i] = new Student(studentId, name, contactNo, course, fees);
	        }

	        // Display student details coursewise
	        System.out.println("Student details coursewise:");
	        String[] uniqueCourses = getUniqueCourses(students);
	        for (String course : uniqueCourses) {
	            System.out.println(course + ":");
	            for (Student student : students) {
	                if (student.getCourse().equals(course)) {
	                    student.display();
	                }
	            }
	        }

	        // Display total fees of all students
	        double totalFees = getTotalFees(students);
	        System.out.println("Total fees of all students: " + totalFees);

	        scanner.close();
	    }

	    // Method to get unique courses from students
	    private static String[] getUniqueCourses(Student[] students) {
	        String[] uniqueCourses = new String[students.length];
	        int count = 0;
	        for (Student student : students) {
	            boolean isNewCourse = true;
	            for (String course : uniqueCourses) {
	                if (course != null && course.equals(student.getCourse())) {
	                    isNewCourse = false;
	                    break;
	                }
	            }
	            if (isNewCourse) {
	                uniqueCourses[count++] = student.getCourse();
	            }
	        }
	        return uniqueCourses;
	    }

	    // Method to calculate total fees of all students
	    private static double getTotalFees(Student[] students) {
	        double totalFees = 0;
	        for (Student student : students) {
	            totalFees += student.getFees();
	        }
	        return totalFees;
	    }
	}

