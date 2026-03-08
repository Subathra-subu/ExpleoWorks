package assignment2_1;

public class Intern extends Employee{
	
	private double stipend;

	public Intern(String empId, String empName,double stipend) {
		super(empId, empName);
		this.stipend = stipend;
	}

	public double getStipend() {
		return stipend;
	}

	public void setStipend(double stipend) {
		this.stipend = stipend;
	}
	
	public double calculateSalary() {
		return getStipend();
	}

	@Override
	public String toString() {
		return "Intern [stipend=" + stipend + ", empId=" + empId + ", empName=" + empName + ", baseSalary=" + baseSalary
				+ "]";
	}

	
	
	
}
