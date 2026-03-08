package classExamples;

public class StaticMethodOverloading {
	
	static int add(int a,int b) {
		return a+b;
	}
	
	static double add(double a,double b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		System.out.println("Addition of two integers: "+StaticMethodOverloading.add(7, 8));
		
		System.out.println("Addition of two double value: "+StaticMethodOverloading.add(7.0, 8.5678));

	}

}
