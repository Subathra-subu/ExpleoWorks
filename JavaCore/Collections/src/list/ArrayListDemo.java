package list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		System.out.println("Size of the Array list: "+arrayList.size());
		
		arrayList.add("S");
		arrayList.add("U");
		arrayList.add("B");
		arrayList.add("A");
		arrayList.add("T");
		arrayList.add("R");
		arrayList.add("A");
		arrayList.add(5,"H");
		
		System.out.println("Size of the Array list after insertions: "+arrayList.size());
		System.out.println("Array list: "+arrayList);
		
		arrayList.remove("T");
		
		arrayList.remove(6);
		
		System.out.println("Size of the Array list after deletions: "+arrayList.size());
		
		System.out.println("Array list after deletions: "+arrayList);
		
		ArrayList<String> arrayList2 = new ArrayList<String>();
		arrayList2.addAll(arrayList);
		
		System.out.println("Array list 2 after Insertions: "+arrayList2);
	
	}

}
