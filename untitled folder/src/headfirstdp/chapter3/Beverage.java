package headfirstdp.chapter3;

public abstract class Beverage {
	String description = "Unknown Beverage";
	int size;
	
	static final int TALL = 1;
	static final int GRANDE = 2;
	static final int VENTI = 3;
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
}
