package practices;

public class StringExamples {
	
	
	public static String concat1(String s1) {
		return s1= s1+" Ram";
	}
	
	public static void concat2(StringBuilder s2) {
		s2.append(" Raj");
	}
	
	public static void concat3(StringBuffer s2) {
		s2.append(" Ravi");
	}
	

	public static void main(String[] args) {
		
		String s1 = "Sri";
		s1 = concat1(s1);
		System.out.println("String: "+ s1);
		
		StringBuilder s2 = new StringBuilder("Hello,");
		concat2(s2);
		System.out.println("String Buider: "+ s2);
		
		StringBuffer s3 = new StringBuffer("Hello,");
		concat3(s3);
		System.out.println("String Buffer: "+ s3);
	}

}
