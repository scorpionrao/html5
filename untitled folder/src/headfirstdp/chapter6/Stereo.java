package headfirstdp.chapter6;

public class Stereo {
	
	int volume;
	String deviceType;
	String name;
	
	public Stereo(String name) {
		this.name = name;
	}
	
	public void on() {
		System.out.println(name + " stereo is On");
	}

	public void off() {
		System.out.println(name + " stereo is Off");
	}

	public void setCd() {
		deviceType = "CD";
		System.out.println(name + " stereo is set for " +
				deviceType + " input");
	}

	public void setDvd() {
		deviceType = "Dvd";
	}

	public void setRadio() {
		deviceType = "Radio";
	}

	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(name +
				" stereo volume set to " + volume);
	}


}
