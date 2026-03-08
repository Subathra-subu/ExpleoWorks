/*
 * Understanding the usage of class,object and dot operator
 */


package classExamples;

class Employee{
	
	int emp_id;
	String emp_name;
	
	void setDetails(int id,String name){
		emp_id = id;
		emp_name = name;
	}
	
	void getDetails() {
		System.out.println("Employee Id:"+emp_id);
		System.out.println("Employee Name:"+emp_name);
	}
	
}

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		Employee emp2 = new Employee();
		
		emp1.setDetails(101,"Ram");
		
		emp2.setDetails(102,"Sita");
		
		emp1.getDetails();
		
		System.out.println();
		
		emp2.getDetails();
		

	}

}
