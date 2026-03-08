package assignment;

public class Employee {
	
	private int empId;
	private String empName;
	
	public Employee(int empId,String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public void setId(int empId) {
		this.empId=empId;
	}
	
	public void setName(String empName) {
		this.empName=empName;
	}
	
	public int getId() {
		return this.empId;
	}
	
	public String getName() {
		return this.empName;
	}
	
	public void markCheckIn(Attendance attendance) {
		
		if(attendance.getId()!=empId) {
			System.out.print("Invalid Employee Attendance.");
			return;
		}
		
		attendance.markCheckIn();
	}
	
	public void markCheckOut(Attendance attendance) {
		
		if(attendance.getId()!=empId) {
			System.out.print("Invalid Employee Attendance.");
			return;
		}
		
		attendance.markCheckOut();
		
	}
	
	public String toString() {
		return "Employee id : "+empId+"\nEmployee name : "+empName;
	}

}
