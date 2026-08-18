


package hard;

import java.util.Scanner;

public class FinalGradeCalculation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		int sum=0;
		
		while(true) {
			System.out.print("Enter the exercise grade:");
			int exer_grade = sc.nextInt();
			
			System.out.print("Enter the exam grade:");
			int exam_grade = sc.nextInt();
			
			if(exer_grade < 0 || exam_grade < 0)
				break;
				
			int final_grade;
			
			if(exer_grade>=5 && exam_grade>=5) {
				final_grade = (exer_grade/100)*30+(exam_grade/100)*70;
			}
			else {
				final_grade = Math.min(exam_grade,exer_grade);
			}
			
			sum+=final_grade;
			
			count++;
		 }
		
		System.out.print("The average of grades:"+(sum/count));
		
		sc.close();
		
		

	}

}
