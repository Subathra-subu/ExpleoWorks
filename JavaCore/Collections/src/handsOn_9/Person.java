package handsOn_9;

import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person>{
	
	private String first_name;
	private String last_name;
	
	public Person(String first_name, String last_name) {
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public int compareTo(Person p) {
		return this.first_name.compareTo(p.first_name);
	}

	public static void main(String[] args) {
		
		ArrayList<Person> arrayList = new ArrayList<Person>();
		
		arrayList.add(new Person("Priscilla","Wagner"));
		arrayList.add(new Person("Tom","Parker"));
		arrayList.add(new Person("Elvis","Presley"));
		
		Collections.sort(arrayList);
		
		for(Person p:arrayList) {
			System.out.println(p.first_name+" "+p.last_name);
		}

	}

}
