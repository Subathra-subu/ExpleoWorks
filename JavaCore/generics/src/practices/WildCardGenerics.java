package practices;

import java.util.ArrayList;
import java.util.List;

public class WildCardGenerics {
	
	public static double sum (List<? extends Number> list) {
		
		double sum = 0;
		for(Number number : list)
			sum += number.doubleValue();
		
		return sum;
	}

	public static void main(String[] args) {
		
		List<Double> list = new ArrayList<Double>();
		
		list.add(100.0);
		list.add(2000.0);
		list.add(30000.0);
		
		double result = sum(list);
		
		System.out.print("Sum of the elements in a list: "+result);
	}

}
