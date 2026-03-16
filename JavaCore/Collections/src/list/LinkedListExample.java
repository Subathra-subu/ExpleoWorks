package list;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		System.out.print("Size of Initial Linkedlist: "+linkedList.size());
		
		linkedList.add("C++");
		linkedList.add("Java");
		linkedList.add(1,"Python");
		linkedList.add("JavaScript");
		linkedList.addFirst("Kotlin");
		linkedList.addLast("C#");

		System.out.print("\nSize of Linked list after insertion: "+linkedList.size());
		System.out.print("\nElements in the list after insertion: "+linkedList);
		
		linkedList.remove("C++");
		linkedList.remove(1);
		
		System.out.print("\nSize of Linked list after deletion: "+linkedList.size());
		System.out.print("\nElements in the list after deletion: "+linkedList);
		
		
	}

}
