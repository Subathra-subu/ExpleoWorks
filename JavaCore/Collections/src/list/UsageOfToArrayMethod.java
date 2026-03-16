package list;

import java.util.ArrayList;

public class UsageOfToArrayMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		System.out.println("Size of the Array list: "+arrayList.size());
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		
		System.out.println("Size of the Array list after insertions: "+arrayList.size());
		
		System.out.println("Array list after insertions: "+arrayList);
		
		Integer[] arr = new Integer[arrayList.size()];
		
		arrayList.toArray(arr);
		
		int sum=0;
		
		for(int i:arr) {
			sum+=i;
		}
		
		System.out.print("Sum of elements in the array: "+sum);
		
	}

}
