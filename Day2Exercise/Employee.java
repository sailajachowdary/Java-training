package Day2Exercise;

public class Employee {
	protected String Employee_Name;
	protected String Department_of_Employee;
	protected String Designation;
	protected int Salary;
	public Employee() {
		super();
	}
	public Employee(String employee_Name, String department_of_Employee, String designation, int salary) {
		super();
		Employee_Name = employee_Name;
		Department_of_Employee = department_of_Employee;
		Designation = designation;
		Salary = salary;
	}
	public String getEmployee_Name() {
		return Employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}
	public String getDepartment_of_Employee() {
		return Department_of_Employee;
	}
	public void setDepartment_of_Employee(String department_of_Employee) {
		Department_of_Employee = department_of_Employee;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public void EmployeeDetails() {
		System.out.println("Name:"+ Employee_Name);
		System.out.println("Department:"+Department_of_Employee );
		System.out.println("Designation:"+ Designation);
	}
	

}

