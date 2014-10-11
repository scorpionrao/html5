package headfirstdp.chapter6;

public class CeilingFanHighCommand 
	implements CommandOrOrder {
	
	CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingfan) {
		this.ceilingFan = ceilingfan;
	}
	
	public void ExecuteOrOrderUp() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}

	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
		
	}

}
