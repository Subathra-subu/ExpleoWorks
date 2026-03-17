package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Mobile implements Comparable<Mobile> 
{
	
	private String name;
	private int ram;
	private double price;
	
	public Mobile(String name, int ram, double price) {
		this.name = name;
		this.ram = ram;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public int getRam() {
		return ram;
	}

	public double getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}


	public int compareTo(Mobile m) {
		return this.getName().compareTo(m.getName());
	}
	
}

class ComparePrice implements Comparator<Mobile>{
	
	public int compare(Mobile m1,Mobile m2) {
		if(m1.getPrice() > m2.getPrice()) return 1;
		else if (m1.getPrice() < m2.getPrice()) return -1;
		else return 0;
	}
}

class CompareRam implements Comparator<Mobile>{
	
	public int compare(Mobile m1,Mobile m2) {
		if(m1.getRam() > m2.getRam()) return 1;
		else if (m1.getRam() < m2.getRam()) return -1;
		else return 0;
	}
}
	

public class MobileMain{

	public static void main(String[] args) {
		
		
		List<Mobile> mobileList = new ArrayList<>();
		
		mobileList.add(new Mobile("Apple  ",8,100000));
		mobileList.add(new Mobile("Samsung",16 ,50000));
		mobileList.add(new Mobile("Nothing", 4, 20000));
		
		Collections.sort(mobileList);
		
		System.out.println("After sorting based on Name:");
		
		for(Mobile m:mobileList) {
			System.out.print("\n"+m.getName()+"  "+m.getRam()+"  "+m.getPrice());
		}
		
		ComparePrice comparePrice = new ComparePrice();
		
		Collections.sort(mobileList,comparePrice);
		
		System.out.println("\n\nAfter sorting based on Price:");
		
		for(Mobile m:mobileList) {
			System.out.print("\n"+m.getName()+"  "+m.getRam()+"  "+m.getPrice());
		}
		
		CompareRam compareRam = new CompareRam();
		
		Collections.sort(mobileList,compareRam);
		
		System.out.println("\n\nAfter sorting based on Ram:");
		
		for(Mobile m:mobileList) {
			System.out.print("\n"+m.getName()+"  "+m.getRam()+"  "+m.getPrice());
		}

	}
}
