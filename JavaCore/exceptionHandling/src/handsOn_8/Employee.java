package handsOn_8;

import java.util.Scanner;
import java.time.Year;

class InvalidEmpNumberException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidEmpNumberException(String s){
		super(s);
	}
}

class InvalidDateOfJoinException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidDateOfJoinException(String s){
		super(s);
	}
}

public class Employee {
	
	private int code;
	private String name;
	private int dob;
	private int doj;
	
	public Employee(int code, String name, int dob, int doj) {
		this.code = code;
		this.name = name;
		this.dob = dob;
		this.doj = doj;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}

	public int getDob() {
		return dob;
	}

	public int getDoj() {
		return doj;
	}

	void displayDetails() {
		
		System.out.print("Employee Code: "+getCode());
		
		System.out.print("Employee Name: "+getName());
		
		System.out.print("Year of Birth: "+getDob());
		
		System.out.print("Year of Appointment: "+getDoj());
		
		int experience = Year.now().getValue()-getDoj();
		
		System.out.print("Years of Experience: "+experience);
		
	}

	public static void main(String[] args) throws InvalidEmpNumberException{
		
		Scanner sc = new Scanner(System.in);
		
		try {
			 	System.out.print("Enter Employee Code: ");
	            int code = sc.nextInt();

	            System.out.print("Enter Employee Name: ");
	            String name = sc.next();

	            System.out.print("Enter Year of Birth: ");
	            int dob = sc.nextInt();

	            System.out.print("Enter Year of Appointment: ");
	            int doj = sc.nextInt();
	            
	            sc.close();
	            
	            if(code < 0) 
	            	throw new InvalidEmpNumberException("Invalid Employee code");
	            
	            if(dob > doj) 
	            	throw new InvalidDateOfJoinException("Invalid year of appointment");
	            
	            else {
					Employee employee = new Employee(code,name,dob,doj);
					
					employee.displayDetails();
				}

		}
		
		catch(Exception m) {
			
			System.out.println("Exception occured: "+m);
		
		}
		
		sc.close();

	}

}
