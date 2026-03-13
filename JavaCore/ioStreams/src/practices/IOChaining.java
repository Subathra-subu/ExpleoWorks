package practices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOChaining {

	public static void main(String[] args) {
		
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]))){
			
			String line = " ";
			
			while((line = bufferedReader.readLine())!=null) {
				bufferedWriter.write(line);
				bufferedWriter.newLine();
			}
			
		}
		
		catch (FileNotFoundException e) {
			System.out.print(e);
		}
		
		catch (IOException e) {
			System.out.print(e);
		}
	}

}
