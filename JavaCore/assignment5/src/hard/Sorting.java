/*
 * Program to sort the numbers,alphabets in upper_case and lower_case
 */


package hard;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String:");
		String str = sc.next();
		
		char c[]=str.toCharArray();
		
		int len = str.length();
		
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-i-1;j++) {
				if(c[j] > c[j+1]) {
					char temp = c[j];
					c[j] = c[j+1];
					c[j+1] = temp;
				}
			}
		}
		
		System.out.println("After Sorting:");
		
		for(int i=0;i<len;i++) {
			System.out.print(c[i]);
		}
		
		sc.close();

	}

}
