/*
 * Parameterized constructor example
 */

package classExamples;

class Theatre{
	int theatreId;
	String theatreName;
	
	Theatre(){
		
	}
	
	Theatre(int id){
		theatreId = id;
	}
	
	Theatre(int id,String name){
		theatreId = id;
		theatreName = name;
	}
	
	void display(){
		System.out.print("Theatre Id:"+theatreId);
		System.out.print("\nTheatre Name:"+theatreName);
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		
		Theatre theatre1 = new Theatre();
		
		Theatre theatre2 = new Theatre(101);
		
		Theatre theatre3 = new Theatre(103,"Ram");
		
		theatre1.display();
		
		System.out.println();
		
		theatre2.display();
		
		System.out.println();
		
		theatre3.display();

	}

}
