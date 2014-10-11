package headfirstdp.chapter6;

public class GarageDoorOrCook {
	
	public String name;
	
	public GarageDoorOrCook(String name) {
		this.name = name;
	}
	
	public void up() {
		System.out.println("Garage Door is Up");
	}
	
	public void down() {
		System.out.println("Garage Door is Down");
	}
	
	public void stop() {
		System.out.println("Garage Door movement stops");
	}
	
	public void lightOn() {
		System.out.println("Garage Door light On");
	}

	public void lightOff() {
		System.out.println("Garage Door light Off");
	}
}
