package headfirst.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameSaverTest {
	public static void main(String[] args) {
		GameCharacter one = new GameCharacter(50, "Elf",
				new String[] {"bow", "sword", "dust"});
		GameCharacter two = new GameCharacter(200, "Troll",
				new String[] {"bare hands", "big ax"});
		GameCharacter three = new GameCharacter(120, "Magician",
				new String[] {"spells", "invisibility"});
		
		// code to change state values
		
		try {
			ObjectOutputStream os = new ObjectOutputStream(
					new FileOutputStream("gamefile.ser"));
			os.writeObject(one);
			os.writeObject(two);
			os.writeObject(three);
			os.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		one = null;
		two = null;
		three = null;
		
		try {
			ObjectInputStream in = new ObjectInputStream(
					new FileInputStream("gamefile.ser"));
			GameCharacter oneRestore = (GameCharacter) in.readObject();
			GameCharacter twoRestore = (GameCharacter) in.readObject();
			GameCharacter threeRestore = (GameCharacter) in.readObject();
			
			System.out.println("One's type: " + oneRestore.getType());
			System.out.println("Two's type: " + twoRestore.getType());
			System.out.println("Three's type: " + threeRestore.getType());
			in.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
