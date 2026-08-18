/*
 * Program to add even and odd number from 1 to 10
 */


package easy;

public class AdditionOfEvenAndOdd {

	public static void main(String[] args) {
		
		int odd_total=0,even_total=0,even_count=0,odd_count=0;
		
		int[] even_arr = new int[5];
		int[] odd_arr = new int[5];
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				even_arr[even_count]=i;
				even_count++;
				even_total+=i;
			}
			else {
				odd_arr[odd_count]=i;
				odd_count++;
				odd_total+=i;
			}
		}
		
		System.out.println("Even Numbers:");
		
		for(int i=0;i<even_count;i++) {
			System.out.print(even_arr[i]+" ");
		}
		
		System.out.println("\nEven Total: "+even_total);
		
		System.out.println("odd Numbers:");
		
		for(int i=0;i<odd_count;i++) {
			System.out.print(odd_arr[i]+" ");
		}
		
		System.out.println("\nOdd Total: "+odd_total);

	}

}
