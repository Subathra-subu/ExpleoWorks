package handsOn_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class HashMapAndStack_4 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		hashMap.put("Mano", 85);
		hashMap.put("Shan",85);
		hashMap.put("John",55);
		hashMap.put("Anu",60);
		hashMap.put("Aju",90);
		hashMap.put("Frank",80);
		
		System.out.println("Student Marks in the HashMap: "+hashMap);
		
		Stack<String> nameStack = new Stack<String>();
		
		for(Map.Entry<String,Integer> mapEntry : hashMap.entrySet()) {
			if(mapEntry.getValue() > 75) {
				nameStack.push(mapEntry.getKey());
			}
		}
		
		System.out.println("\nStudent Marks above 75 in the stack:");
		
		while(!nameStack.isEmpty()) {
			System.out.println(nameStack.pop());
		}

	}

}
