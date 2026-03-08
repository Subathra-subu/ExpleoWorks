package controlFlowStatements;

public class IfElseControlStructure {

	public static void main(String[] args) {
		boolean isMoving=false;
		int currentSpeed=10;
		if(isMoving) {
			currentSpeed--;
			System.out.println("The bicycle speed got reduced: "+currentSpeed);
		}
		else {
			System.out.println("The bicycle has already stopped");
		}
	}

}
