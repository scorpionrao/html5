package headfirst.serialization;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("Foo.txt");
			writer.write("hello!");
			writer.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
