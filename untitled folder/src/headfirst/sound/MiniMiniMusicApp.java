package headfirst.sound;

import javax.sound.midi.*;

public class MiniMiniMusicApp {
	public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException {
		MiniMiniMusicApp musicApp = new MiniMiniMusicApp();
		musicApp.play();
	}
	
	public void play() {
		try {
			Sequence sequence = new Sequence(Sequence.PPQ, 4);
			Track track = sequence.createTrack();
			
			ShortMessage z = new ShortMessage();
			z.setMessage(192, 1, 105, 100);
			MidiEvent noteOn0 = new MidiEvent(z, 0);
			track.add(noteOn0);
			
			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, 20, 100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);
			
			ShortMessage b = new ShortMessage();
			b.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(b, 3);
			track.add(noteOff);
			
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.setSequence(sequence);
			sequencer.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
