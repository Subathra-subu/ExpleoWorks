package controlFlowStatements;

public class SwitchCase{ // Expression must be byte,short,integer,long,String,enum

	public static void main(String[] args) {
		int letter = 'A';
		switch(letter){
		case 'a':
			System.out.println("LowerCase Letter");
			break;
		case 'A':
			System.out.println("UpperCase Letter");
			break;
		}

	}

}
