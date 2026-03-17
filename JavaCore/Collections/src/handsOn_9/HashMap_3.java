package handsOn_9;

import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMap_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("String text: ");
		String str = scanner.nextLine();
		
		TreeMap<Character,Integer> hashMap = new TreeMap<Character, Integer>();
		
		int len = str.length();
		
		for(int i=0;i<len;i++) {
			hashMap.put(str.charAt(i),hashMap.getOrDefault(str.charAt(i),0)+1);
		}
		
		Set<Entry<Character, Integer>> set = hashMap.entrySet();
		
		System.out.println("Character counts:");
		
		for(Entry<Character, Integer> entry : set) {
			char c = entry.getKey();
			if("acso".indexOf(c)!= -1) {
				System.out.println(c+":"+entry.getValue());
			}
		}
	
		scanner.close();
	}

}
