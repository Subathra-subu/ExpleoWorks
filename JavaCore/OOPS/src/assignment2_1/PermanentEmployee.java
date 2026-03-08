package assignment2_1;

public class PermanentEmployee extends Employee {
	
	private double bonus;

	public PermanentEmployee(String empId, String empName, double baseSalary,double bonus) {
		super(empId, empName, baseSalary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double calculateSalary() {
		return getBaseSalary()+getBonus();
	}

	@Override
	public String toString() {
		return "PermanentEmployee [bonus=" + bonus + ", empId=" + empId + ", empName=" + empName + ", baseSalary="
				+ baseSalary + "]";
	}

	

}
