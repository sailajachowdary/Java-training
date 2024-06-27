package Day3Exercise;

public class Student {
	
    private int studentId;
    private String name;
    private String contactNo;
    private String course;
    private double fees;

    // Constructor to populate the objects
    public Student(int studentId, String name, String contactNo, String course, double fees) {
        this.studentId = studentId;
        this.name = name;
        this.contactNo = contactNo;
        this.course = course;
        this.fees = fees;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Contact No: " + contactNo);
        System.out.println("Course: " + course);
        System.out.println("Fees: " + fees);
        System.out.println();
    }

    // Method to return the course fees
    public double getFees() {
        return fees;
    }

    // Getter for course
    public String getCourse() {
        return course;
    }
}

