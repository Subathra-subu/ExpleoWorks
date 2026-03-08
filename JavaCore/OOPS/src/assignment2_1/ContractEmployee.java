package assignment2_1;

public class ContractEmployee extends Employee{

	private double taxRate;
	private double serviceCharge;
	
	public ContractEmployee(String empId, String empName,double baseSalary,double taxRate, double serviceCharge) {
		super(empId,empName,baseSalary);
		this.taxRate = taxRate;
		this.serviceCharge = serviceCharge;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public double calculateSalary() {
		return getBaseSalary() - (getBaseSalary() * getTaxRate()) -getServiceCharge();
	}

	@Override
	public String toString() {
		return "ContractEmployee [taxRate=" + taxRate + ", serviceCharge=" + serviceCharge + ", empId=" + empId
				+ ", empName=" + empName + ", baseSalary=" + baseSalary + "]";
	}

	
	
	
	
	
}
