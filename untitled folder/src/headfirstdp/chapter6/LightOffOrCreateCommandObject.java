package headfirstdp.chapter6;

public class LightOffOrCreateCommandObject
	implements CommandOrOrder {
	
	LightOrCook light;
	
	LightOffOrCreateCommandObject(LightOrCook light) {
		this.light = light;
	}
	
	public void ExecuteOrOrderUp() {
		light.off();
	}
	
	public void undo() {
		light.on();
	}
}
