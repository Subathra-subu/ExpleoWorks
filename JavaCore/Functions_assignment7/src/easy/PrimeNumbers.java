/*
 * Program to find the prime numbers between 1 to 100
 */


package easy;

public class PrimeNumbers {
	
	boolean isPrime(int n) {
		
		if(n==1) return false;
		
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) {
				
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		System.out.println("Prime numbers between 1 to 100:");
		
		PrimeNumbers  prime = new PrimeNumbers();
		
		for(int i=1;i<=100;i++) {
			if(prime.isPrime(i)) System.out.print(i+" ");
		}
	}

}
