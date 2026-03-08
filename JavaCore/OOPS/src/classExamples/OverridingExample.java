package classExamples;

class Baseclass{
	
	int i;
	
	void display() {
		System.out.println(i);
	}
	
}

class Derived extends Baseclass{
	
	int j;
	
	void display() {
		System.out.println(j);
		super.display();
	}
	
}

public class OverridingExample {

	public static void main(String[] args) {
		
		Derived derived = new Derived();
		
		derived.i = 10;
		
		derived.j = 15;
		
		derived.display();

	}

}
