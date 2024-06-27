package Day3Exercise;

public class Employee {
	
	    private String name;
	    private int age;
	    private double salary;

	    // Parameterized constructor
	    public Employee(String name, int age, double salary) {
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }

	    // Method to display employee details
	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Salary: " + salary);
	    }

	    // Method to increase salary
	    public void increaseSalary(double percent) {
	        salary += (percent / 100) * salary;
	        System.out.println(name + "'s salary after increase: " + salary);
	    }
	}


