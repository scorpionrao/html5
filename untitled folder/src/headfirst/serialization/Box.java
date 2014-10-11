package headfirst.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Box implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3211535716987830246L;
	transient private Duck duck = new Duck(1);
	private int width;
	private int height;
	private int depth;
	private int duckSize;
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public void setDuckSize() {
		this.duckSize = duck.duckSize;
	}
	public static void main(String[] args) {
		Box myBox = new Box();
		myBox.setWidth(50);
		myBox.setHeight(20);
		myBox.setDepth(100);
		try {
			FileOutputStream fileStream = new FileOutputStream("myfile.ser");
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			os.writeObject(myBox);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
