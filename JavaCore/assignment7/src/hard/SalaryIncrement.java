/*
 * Program to display the incremented salary
 */


package hard;

import java.util.Scanner;

public class SalaryIncrement {
	
	static double calculateSalary(double salary,float appraisal) {
		
		double increment=0;
		
		if(appraisal >= 1 && appraisal <= 4)
			increment=(salary/100)*10;
		
		else if(appraisal >= 4.1 && appraisal <= 7)
			increment=(salary/100)*25;
		
		else if(appraisal >= 7.1 && appraisal <= 10)
			increment=(salary/100)*30;
		
		return increment;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the salary:");
		double salary = scanner.nextInt();
		
		System.out.print("Enter the appraisal rating:");
		float appraisal = scanner.nextFloat();
		
		if(salary>0 || (appraisal>=1 && appraisal<=10)) {
			double increment = calculateSalary(salary,appraisal);
			System.out.println("Incremented Salary: "+(salary+increment));
		}
		else 
			System.out.println("Invalid Input");
		
		scanner.close();
		
		}

}
