package typeConversions;

public class TypePromotion {	// class

	public static void main(String[] args) {
		
		byte b = 50;
		b =(byte)(b*2);	//The output is in integer type so perform explicit conversion
		System.out.println(b);

	}

}
