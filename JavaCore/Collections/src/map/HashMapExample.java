package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, Double> map = new HashMap<String, Double>();
		
		System.out.println("Initial size of Map: "+map.size());
		
		map.put("John Doe", 9000.89);
		map.put("Tom Smith", 89678.09);
		map.put("Jane Baker", 34567.098);
		map.put("Ralph Smith", 789.987);
		
		System.out.println("Size of Map: "+map.size());
		
		System.out.println("Elements in the HashMap: "+map);
		
		Set<Map.Entry<String, Double>> set = map.entrySet();
		
		for(Map.Entry<String,Double> m : set) {
			System.out.println("Key: "+m.getKey());
			System.out.println("Value: "+m.getValue());
		}
	}

}
