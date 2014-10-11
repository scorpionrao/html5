package headfirstdp.chapter6;

public class CeilingFanOn
	implements CommandOrOrder {
	
	CeilingFan ceilingFan;
	
	CeilingFanOn(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void ExecuteOrOrderUp() {
		ceilingFan.on();
	}
	
	public void undo() {
		ceilingFan.off();
	}
}
