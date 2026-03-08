package assignment;

public class AttendanceMain {

	public static void main(String[] args) {
		
		Employee employee = new Employee(101,"Ram");
		
		Attendance attendance = new Attendance(101);
		
		employee.markCheckIn(attendance);
		
		employee.markCheckOut(attendance);
		
		System.out.println(attendance.getAttendanceDetails());


	}

}
