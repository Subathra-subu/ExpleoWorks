/* Program to get employee details, wages and number of days worked from user 
 * and find total salary
 */
package easy;

import java.util.Scanner;

public class FindTotalSalary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee id: ");
		int empId = input.nextInt();
		
		System.out.print("Enter employee name: ");
		String empName = input.next();
		
		System.out.print("Enter employee wage: ");
		int wages = input.nextInt();
		
		System.out.print("Enter the number of days worked by the Employee: ");
		int no_of_days = input.nextInt();
		
		int totalSalary = wages*no_of_days;
		
		System.out.println("Employee Details");
		
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Total Salary: "+totalSalary);
		
		input.close();
		}

}
