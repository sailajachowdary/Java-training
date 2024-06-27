package Day2Exercise;

public class SalariedEmployee {
	private String name;
	private double Salary;

	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(String name, double salary) {
		super();
		this.name = name;
		Salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return "Second_SalariedEmployee [name=" + name + ", Salary=" + Salary + "]";
	}
	
}

	


