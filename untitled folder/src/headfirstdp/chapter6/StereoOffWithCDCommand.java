package headfirstdp.chapter6;

public class StereoOffWithCDCommand 
	implements CommandOrOrder {
	
	Stereo stereo;
	
	public StereoOffWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	public void ExecuteOrOrderUp() {
		stereo.off();
	}
	
	public void undo() {
		stereo.on();
	}
}
