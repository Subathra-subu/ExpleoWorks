/*
 * Program to calculate the new salary with the given hike value 
 */

package easy;

import java.util.Scanner;

public class SalaryHike {
	
	static double toCalculateNewSalary(double old_salary,int hike) {
		
		double new_salary;
		
		new_salary = old_salary+(old_salary/100)*hike;
		
		return new_salary;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the per month salary:");
		double salary = scanner.nextInt();
		
		System.out.print("Enter the Hike value:");
		int hike = scanner.nextInt();
		
		System.out.println("New Salary after applying the hike: "+toCalculateNewSalary(salary,hike));
		
		scanner.close();
	}

}
