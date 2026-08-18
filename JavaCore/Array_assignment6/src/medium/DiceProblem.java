/*
 * Program to find the frequency of values when the dice throws for 100 time
 */

package medium;

public class DiceProblem {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		
		for(int i=0;i<100;i++) {
			arr[i] = (int)(Math.random()* 6) + 1;
		}
		
		int[] freq = new int[7];
		
		for(int i=0;i<100;i++) {
			freq[arr[i]]++;
		}
		
		for(int i=0;i<7;i++){
			if(i==0) continue;
			System.out.println(i+" count "+freq[i]);
		}
	}

}
