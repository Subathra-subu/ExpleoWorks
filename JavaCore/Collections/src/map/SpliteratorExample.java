package map;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		System.out.print("Size of initial array list: "+arrayList.size());
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		
		System.out.print("\nSize of array list after insertions: "+arrayList.size());
		
		System.out.print("\nContents of arraylist using tryAdvance(): ");
		
		Spliterator<Integer> spt = arrayList.spliterator();
		
		while(spt.tryAdvance((n)->System.out.print(n+" ")));
		
		System.out.print("\nSize of array list: "+arrayList.size());
		
		System.out.print("\nContents of arraylist using forEachRemaining: ");
		
		
		spt = arrayList.spliterator();
		
		spt.forEachRemaining((n)->System.out.print(n+" "));
		
		System.out.println();
		
		System.out.print("Size of array list: "+arrayList.size());
		
		}

}
