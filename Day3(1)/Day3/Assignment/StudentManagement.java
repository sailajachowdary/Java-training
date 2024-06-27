package Day3.Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManagement {
    public static void main(String[] args) {
        // Creating 5 student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Harsha", "34624563", "Math", 10000.0));
        
        students.add(new Student(2, "Ashok", "357435701", "Science", 13000.0));
        
        students.add(new Student(3, "Nanda", "346873235", "Math", 12000.0));
        
        students.add(new Student(4, "Balaji", "235211453", "History", 13000.0));
        
        students.add(new Student(5, "Shashi", "5454561234", "Science", 14000.0));

        // It Display the student details course
        System.out.println("Displaying students coursewise:");
        displayStudentsCoursewise(students);

        // Display the total fees of all the students
        double totalFees = calculateTotalFees(students);
        System.out.println("Total fees of all students: " + totalFees);
    }

    // Method to display students coursewise using a Map
    public static void displayStudentsCoursewise(List<Student> students) {
        // Using a Map to group students by course
        Map<String, List<Student>> courseMap = new HashMap<>();

        for (Student student : students) {
            String course = student.getCourse();
            if (!courseMap.containsKey(course)) {
                courseMap.put(course, new ArrayList<>());
            }
            courseMap.get(course).add(student);
        }

        // Display students grouped by course
        for (Map.Entry<String, List<Student>> entry : courseMap.entrySet()) {
            System.out.println("Course: " + entry.getKey());
            for (Student student : entry.getValue()) {
                student.display();
            }
        }
    }

    // Method to calculate the total fees of all students
    public static double calculateTotalFees(List<Student> students) {
        double totalFees = 0;
        for (Student student : students) {
            totalFees += student.getFees();
        }
        return totalFees;
    }
}
