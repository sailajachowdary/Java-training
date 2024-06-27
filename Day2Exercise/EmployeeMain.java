package Day2Exercise;

public class EmployeeMain {
	
	public static void main(String[] args) {

		String Employee_Name = args[0];
		String Department_of_Employee = args[1];
		String Designation = args[2];
		int salary = Integer.parseInt(args[3]);
		Employee x1 = new Employee();
		x1.setEmployee_Name("Harsha");
		x1.setDepartment_of_Employee("Mgr");
		x1.setDesignation("Graduate engineer");
		x1.setSalary(45000);
		System.out.println(x1);

		if (Department_of_Employee.equals("Mgr")) {
			x1 = new Manager(Employee_Name, Department_of_Employee, Designation, salary);
		} else {
			x1 = new clerk(Employee_Name, Department_of_Employee, Designation, salary);
		}

		x1.EmployeeDetails();
		if (x1 instanceof Manager) {
			((Manager) x1).Salarycalculation();
		} else if (x1 instanceof clerk) {
			((clerk) x1).Salarycalculation();
		}
	}
}

