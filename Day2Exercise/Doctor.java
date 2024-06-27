package Day2Exercise;

public class Doctor extends SalariedEmployee {
	private String Speciality;
	private double OfficeVisit_fees;
	
	public Doctor() {
		super();
	}
	public Doctor(String name, double salary, String speciality, double officeVisit_fees) {
		super(name, salary);
		Speciality = speciality;
		OfficeVisit_fees = officeVisit_fees;
	}

	public String getSpeciality() {
		return Speciality;
	}

	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}

	public double getOfficeVisit_fees() {
		return OfficeVisit_fees;
	}

	public void setOfficeVisit_fees(double officeVisit_fees) {
		OfficeVisit_fees = officeVisit_fees;
	}

	@Override
	public String toString() {
		return "Doctor [Speciality=" + Speciality + ", OfficeVisit_fees=" + OfficeVisit_fees + "]";
	}

}
