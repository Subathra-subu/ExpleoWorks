/*
 * Program to understand the super keyword usage
 */

package classExamples;

class Project{
	String projectLead = "Ram";
	int empId = 101;
	
	void displayData() {
		System.out.println("Project lead name:"+projectLead);
		System.out.println("Employee Id:"+empId);
		
	}
}

class Programmer extends Project{
	
	String programmerName;
	int empId;
	
	void setData(String name,int id) {
		programmerName = name;
		empId = id;
	}
	
	void displayData() {
		System.out.println("Programmer name:"+programmerName);
		System.out.println("Employee Id:"+empId);
		super.displayData();
		
	}
	
}

public class SuperKeywordExample {

	public static void main(String[] args) {
		
		Programmer programmer = new Programmer();
		
		programmer.setData("Raj", 201);
		
		programmer.displayData();
		
	}

}
