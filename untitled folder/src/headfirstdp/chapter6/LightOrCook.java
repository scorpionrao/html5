package headfirstdp.chapter6;

public class LightOrCook {
	
	public String name;
	
	public LightOrCook(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println(name + " light is On");
	}
	public void off() {
		System.out.println(name + " light is Off");
	}
	
}
