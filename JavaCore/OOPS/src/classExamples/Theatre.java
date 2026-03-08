/*
 * Program to understand class concept
 */

package classExamples;

class Theatre1 {
	
	int theatre_id = 1204;
	String theatre_name = "INOX";
	String theatre_location = "Salem";
	
	void display() {
		System.out.println("Theatre Id: "+theatre_id);
		System.out.println("Theatre Name: "+theatre_name);
		System.out.println("Theatre Location: "+theatre_location);
	}

	public static void main(String[] args) {
		
		Theatre1 t = new Theatre1();
		System.out.println("Theatre Id: "+t.theatre_id);
		
		t.display();
	}

}
