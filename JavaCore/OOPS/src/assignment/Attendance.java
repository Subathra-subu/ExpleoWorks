package assignment;

import java.time.LocalTime;

public class Attendance {
	
	private int empId;
	private LocalTime checkInTime;
	private LocalTime checkOutTime;
	private boolean isCheckedIn;
	private boolean isCheckedOut;
	
	public Attendance(int empId){
		this.empId=empId;
	}
	
	public int getId() {
		return this.empId;
	}
	
	public LocalTime getCheckInTime() {
		return this.checkInTime;
	}
	
	public LocalTime getCheckOutTime() {
		return this.checkOutTime;
	}
	
	public boolean getIsCheckedIn() {
		return this.isCheckedIn;
	}
	
	public boolean getIsCheckedOut() {
		return this.isCheckedOut;
	}
	
	public void markCheckIn() {
		if(isCheckedIn) {
			System.out.print("Already checkedin");
			return;
		}
		
		LocalTime time=LocalTime.now();
		this.checkInTime=time;
		
		isCheckedIn=true;
	}
	
	public void markCheckOut() {
		if(!isCheckedIn) {
			System.out.print("Without checkin checkout is not possible");
			return;
		}
		
		if(isCheckedOut) {
			System.out.print("Already checkedout");
			return;
		}
		
		LocalTime time=LocalTime.now();
		this.checkOutTime=time;
		
		isCheckedOut=true;
		
	}
	
	public String getAttendanceDetails() {
		return "Employee ID: " + empId +"\nCheck in Time: " 
	    + (checkInTime!=null ? checkInTime : "Not Checked In") +"\nCheck out Time: " 
        + (checkOutTime!=null ? checkOutTime : "Not Checked Out");
		
	}
	

}
