package practices;

public class Demo<T> {
	
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	

	public static void main(String[] args) {
		
		Demo<Integer> iObj = new Demo<>();
		
		iObj.set(10);
		
		System.out.println(iObj.get());
		
		
		Demo<String> sObj = new Demo<>();
		
		sObj.set("Subu");
		
		System.out.println(sObj.get());

	}

}
