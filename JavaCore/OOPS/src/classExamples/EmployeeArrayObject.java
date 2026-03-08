/*
 * Program to create array of objects
 */

package classExamples;

// Employee class in EmployeeMain.java program is used

public class EmployeeArrayObject {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[2];
		
		for(int i=0;i<2;i++) {
			employees[i] = new Employee();
		}
		
		employees[0].setDetails(1,"Rani");
		employees[1].setDetails(2,"Anu");
		
		for(int i=0;i<2;i++) {
			employees[i].getDetails();
			System.out.println();
		}
		
	}

}
