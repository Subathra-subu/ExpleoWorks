package practices;

public class BoundedType {// With restrictions
	
	static <T extends Number> void genericDisplay(T element) {
		System.out.println(element);
		System.out.println(element.getClass().getName()+" = "+element);
	}

	public static void main(String[] args) {
		
		genericDisplay(11);
		
		//genericDisplay("Subu");
		
		genericDisplay(1.0f);

	}

}
