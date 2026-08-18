// Program using for loop to print alphabets

package easy;

public class PrintAlphabets {

	public static void main(String[] args) {
		
		int c1 = 97;
		int c2 = 122;
				
		for(int i=0;i<26;i++) {
			System.out.print((char)(c1+i));
			System.out.print((char)(c2-i)+" ");
		}
	}

}
