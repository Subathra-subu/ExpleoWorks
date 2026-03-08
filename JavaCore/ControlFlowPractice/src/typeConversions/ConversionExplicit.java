package typeConversions;

public class ConversionExplicit { // class

	public static void main(String[] args) {
		
		double d = 100.04;
		long l = (long)d;	// convert double into long
		int i = (int)l;		// convert long into integer
		System.out.println("Double value:"+d);
		System.out.println("Long value:"+l);
		System.out.println("Integer value:"+i);

	}

}
