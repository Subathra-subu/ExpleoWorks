package exceptionHandling;

public class AssertionsExample {

	public static void main(String[] args) {
		
		int value = 50;
		
		assert value >= 60 : "Wrong Data";
		System.out.println("Value is "+value);

	}

}
