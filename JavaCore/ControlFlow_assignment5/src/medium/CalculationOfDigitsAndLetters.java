/*
 * Program to calculate the number of digits,letters and symbols in the entered string
 */

package medium;

import java.util.Scanner;

public class CalculationOfDigitsAndLetters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String:");
		String str = sc.nextLine();
		
		int len = str.length();
		
		int letters=0,digits=0,symbols=0;
		
		for(int i=0;i<len;i++) {
			char c = str.charAt(i);
			if((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z'))
				letters++;
			else if(c >= '0' && c <= '9')
				digits++;
			else
				symbols++;
		}
		
		System.out.print("Letters: "+letters+",Digits: "+digits+",Symbols: "+symbols);
		
		sc.close();
	}

}
