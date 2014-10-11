package headfirstdp.chapter6;

public class LightOnOrCreateCommandObject
	implements CommandOrOrder {
	
	LightOrCook light;
	
	LightOnOrCreateCommandObject(LightOrCook light) {
		this.light = light;
	}
	
	public void ExecuteOrOrderUp() {
		light.on();
	}
	
	public void undo() {
		light.off();
	}
}
