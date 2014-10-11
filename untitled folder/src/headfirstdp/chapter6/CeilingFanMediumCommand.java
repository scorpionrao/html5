package headfirstdp.chapter6;

public class CeilingFanMediumCommand 
	implements CommandOrOrder {
	
	CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanMediumCommand(CeilingFan ceilingfan) {
		this.ceilingFan = ceilingfan;
	}
	
	public void ExecuteOrOrderUp() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.medium();
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
