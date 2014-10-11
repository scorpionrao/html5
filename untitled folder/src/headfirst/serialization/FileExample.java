package headfirst.serialization;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) {
		File f = new File("MyCode.txt");
		File dir = new File("Chapter7");
		dir.mkdir();
		System.out.println(dir.getAbsolutePath());
		try {
			System.out.println(dir.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (dir.isDirectory()) {
			String[] dirContents = dir.list();
			for (int i=0; i<dirContents.length;i++) {
				System.out.println(dirContents[i]);
			}
		}
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(f));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(f.delete());
		
	}
}
