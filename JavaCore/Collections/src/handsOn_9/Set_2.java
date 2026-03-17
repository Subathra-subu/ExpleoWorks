package handsOn_9;

import java.util.HashSet;
import java.util.Iterator;

public class Set_2 {

	public static void main(String[] args) {
		
		String concatenatedString = "";
		
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("Java");
		hashSet.add("Hello");
		hashSet.add("Programming");
		hashSet.add("World");
		
		Iterator<String> itr = hashSet.iterator();
		
		while(itr.hasNext()) {
			String element = itr.next();
			concatenatedString = concatenatedString.concat(element+" ");
			System.out.println("Elements in the Set : "+element);
		}
		
		System.out.println("Concatenated result: "+concatenatedString);
		
	}

}
