package Day2Exercise;

public class Manager extends Employee 
{
	public Manager(String Employee_Name, String Department_of_Employee, String Designation, int salary) 
	{
		super(Employee_Name,Department_of_Employee,Designation,salary);
	}
	 public void Salarycalculation()
	 {
		 double salary = getSalary() * 10;
		 System.out.println("Manager salary:"+ salary);
	 }

	}
