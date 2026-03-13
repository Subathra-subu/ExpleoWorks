package practices;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Employee implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	transient int empId;
	static int deptId;
	public String empName;
	public int empAge;
	
	public Employee(int empId, int deptId,String empName, int empAge) {
		this.empId = empId;
		Employee.deptId = deptId;
		this.empName = empName;
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + "]";
	}
	
	
	
	
	
}

public class Serialization {

	public static void main(String[] args) {
		
		Employee employee = new Employee(1,101,"Ram",23);
		
		String filename = "Employee.ser";
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(filename);
			
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(employee);
			
			objectOutputStream.close();
			
			fileOutputStream.close();
			
			System.out.println("Object has been serialized");
			System.out.println(employee.toString());
			
			employee.empId = 200;
			employee.empAge = 30;
		}
		
		catch (IOException e) {
			System.out.print(e);
		}
		
		
		Employee employee2 = null;
		
		try {
			
			FileInputStream fileInputStream = new FileInputStream(filename);
			
			ObjectInputStream objectOutputStream = new ObjectInputStream(fileInputStream);
			
			employee2 = (Employee)objectOutputStream.readObject();
			
			fileInputStream.close();
			
			objectOutputStream.close();
			
			System.out.println("Object has been Deserialized");
			System.out.println(employee2.toString());
			
		}
		
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
