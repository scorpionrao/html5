package headfirstdp.chapter6;

public class CeilingFanOff
	implements CommandOrOrder {
	
	CeilingFan ceilingFan;
	
	CeilingFanOff(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void ExecuteOrOrderUp() {
		ceilingFan.off();
	}
	
	public void undo() {
		ceilingFan.on();
	}
}
