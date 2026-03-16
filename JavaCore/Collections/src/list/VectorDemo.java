package list;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Double> vector = new Vector<Double>(3);
		
		System.out.print("Size of Initial Vector: "+vector.size());
		System.out.print("\nCapacity of Initial Vector: "+vector.capacity());
		
		vector.add(1.0);
		vector.add(2.0);
		vector.add(3.0);
		vector.add(4.0);
		
		System.out.print("\nCapacity of Vector: "+vector.capacity());
		
		vector.add(5.0);
		vector.add(6.0);
		
		System.out.print("\nCapacity of Vector: "+vector.capacity());
		
		vector.add(7.0);
		vector.add(8.0);
		
		System.out.print("\nSize of Vector: "+vector.size());
		
		System.out.print("\nCapacity of Initial Vector: "+vector.capacity());
		
		System.out.print("\nVector elements: "+vector);
	}

}
