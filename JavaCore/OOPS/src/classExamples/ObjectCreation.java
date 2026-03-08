package classExamples;

public class ObjectCreation {
	
	int theatre_id = 1204;
	String theatre_name = "INOX";
	String theatre_location = "Salem";
	
	void display() {
		System.out.println("Theatre Id: "+theatre_id);
		System.out.println("Theatre Name: "+theatre_name);
		System.out.println("Theatre Location: "+theatre_location);
	}

	public static void main(String[] args) {
		
		ObjectCreation object1 = new ObjectCreation();
		
		ObjectCreation object2;
		object2 = new ObjectCreation();
			
		object1.display();
		
		System.out.println();
		
		object2.display();
		
	    }

}
