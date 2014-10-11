package headfirstdp.chapter6;

public class CeilingFan {
	
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	public String name;
	public int speed;
	
	public CeilingFan(String name) {
		this.name = name;
		this.speed = OFF;
	}

	public void high() {
		speed = HIGH;
		// code to set fan to high
	}
	
	public void medium() {
		speed = MEDIUM;
		// code to set fan to medium
	}
	
	public void low() {
		speed = LOW;
		// code to set fan to low
	}
	
	public void off() {
		speed = OFF;
		// code to set fan to off
	}
	
	public void on() {
		System.out.println(name + " ceiling Fan is On");
	}
	
	public int getSpeed() {
		return speed;
	}

	
}
