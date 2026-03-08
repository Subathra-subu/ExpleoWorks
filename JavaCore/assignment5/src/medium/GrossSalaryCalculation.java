/*
 * Program to calculate Gross salary by using basic salary and calculating HRA,DA values
 */

package medium;

import java.util.Scanner;

public class GrossSalaryCalculation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Basic salary:");
		double basicSalary = sc.nextInt();
		
		double grossSalary=basicSalary;
		double hra,da;
		
		if(basicSalary <= 10000) {
			hra = (basicSalary/100)*20;
			da = (basicSalary/100)*80;
			grossSalary += hra+da;
		}
		
		else if(basicSalary > 10000 && basicSalary <= 20000) {
			hra = (basicSalary/100)*25;
			da = (basicSalary/100)*90;
			grossSalary += hra+da;
		}
		else {
			hra = (basicSalary/100)*30;
			da = (basicSalary/100)*95;
			grossSalary += hra+da;
		}
		System.out.println("Gross Salary:"+grossSalary);
		
		sc.close();

	}

}
