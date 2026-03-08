package classExamples;

//final 
class Base{
	//final 
	void display() {
		System.out.println("Base class");
	}
}

class Child extends Base{
	public void display() {
		System.out.println("child class");
	}
}

public class FinalClassExample {

	public static void main(String[] args) {
		
		Child childclass = new Child();
		childclass.display();
	}

}
