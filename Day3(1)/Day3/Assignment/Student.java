package Day3.Assignment;

public class Student {
	private int StudentId;
	private String Name;
	private String contactNo;
	private String course;
	private double fees;
	
	

	
public Student(int StudentId, String Name, String contactNo, String course, double fees) {
		super();
		this.StudentId = StudentId;
		this.Name = Name;
		this.contactNo = contactNo;
		this.course = course;
		this.fees = fees;
	}

public void display(){
	System.out.println("StudentId :"+StudentId);
	System.out.println("Name: " + Name);
    System.out.println("ContactNo: " + contactNo);
    System.out.println("Course: " + course);
    System.out.println("Fees: " + fees);
    //System.out.println();
}


public double getFees() {
    return fees;
}

public String getCourse() {
    return course;
}


	

}

