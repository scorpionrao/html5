package headfirst.serialization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {
	
	public static void main(String[] args) {
		
		try {
			
			File myFile = new File("MyText.txt");
			
			BufferedReader reader = new BufferedReader(new FileReader(myFile));
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				
				System.out.println(line);
				
			}
			
			reader.close();
			
		} catch (IOException ex) {
			
			ex.printStackTrace();
			
		}
	}

}
