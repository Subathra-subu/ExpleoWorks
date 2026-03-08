package classExamples;

class Employee2{
	
	int empId;
	String empName;
	double empSalary;
	
	Employee2(int empId,String empName,double empSalary) {
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	
	Employee2(){
		this(1001,"Anu",30000);
		System.out.println("Default Constructor");
	}
	
	
	void registerEmployee() {
		System.out.print("\nRegistering....");
		this.display();
	}
	
	void display() {
		System.out.println("\nEmployee Details");
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Salary: "+empSalary);
		
	}
	
	void sendForProcessing() {
		HRDepartment hr = new HRDepartment();
		hr.processEmployee(this);
	}
	
	Employee2 updateSalary(double hikePercentage) {
		this.empSalary = empSalary+(empSalary*hikePercentage/100);
		this.display();
		return this;
	}
	
	Employee2 updateName(String newName) {
		this.empName = newName;
		this.display();
		return this;
	}
	
}

public class EmployeeThisKeywordDemo{
	
	public static void main(String[] args) {
		
		Employee2 emp = new Employee2();
		
		emp.sendForProcessing();
		emp.registerEmployee();
		emp.updateSalary(3);
		emp.updateName("Abi");
		
	}

}
