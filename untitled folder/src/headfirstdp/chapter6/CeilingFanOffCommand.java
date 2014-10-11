package headfirstdp.chapter6;

public class CeilingFanOffCommand 
	implements CommandOrOrder {
	
	CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanOffCommand(CeilingFan ceilingfan) {
		this.ceilingFan = ceilingfan;
	}
	
	public void ExecuteOrOrderUp() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
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
