// Program using do-while loop to evaluate the series 1+2+3+…..+i

package easy;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		
		int sum = 0;
		int i= 1;
		
		do {
			sum+=i;
			i++;
		}while(i<=num);
		
		System.out.println("Evaluation of series: "+sum);
		
		sc.close();
		

	}

}
