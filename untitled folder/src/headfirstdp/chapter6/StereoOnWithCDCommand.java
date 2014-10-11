package headfirstdp.chapter6;

public class StereoOnWithCDCommand implements CommandOrOrder {
	
	Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	public void ExecuteOrOrderUp() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}
	
	public void undo() {
		stereo.off();
	}
}
