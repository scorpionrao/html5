package headfirstdp.chapter7;

import javax.media.j3d.Light;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier();
		Tuner tuner = new Tuner();
		DvdPlayer dvd = new DvdPlayer();
		CdPlayer cd = new CdPlayer();
		Projector projector = new Projector();
		Screen screen = new Screen();
		TheaterLights lights = new TheaterLights();
		PopcornPopper popper = new PopcornPopper();
		
		HomeTheatreFacade homeTheater =
			new HomeTheatreFacade(amp, tuner, dvd, cd,
				projector, screen, lights, popper);
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
						
	}

}
