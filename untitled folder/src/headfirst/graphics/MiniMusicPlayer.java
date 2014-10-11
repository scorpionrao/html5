package headfirst.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MiniMusicPlayer {
	
	static JFrame frame = new JFrame("My First Music Video");
	static MyPanel myPanel;

	public static void main(String[] args) {
		MiniMusicPlayer player = new MiniMusicPlayer();
		player.go();
	}
	
	public void setUpGui() {
		myPanel = new MyPanel();
		frame.setContentPane(myPanel);
		frame.setBounds(30, 30, 300, 300);
		frame.setVisible(true);
	}
	
	public void go() {
		setUpGui();
		
		try {
			Sequence sequence = new Sequence(Sequence.PPQ, 4);
			Track track = sequence.createTrack();
			
			int r = 0;
			for(int i=0; i<160; i+=1) {
				r = (int) ((Math.random() * 50) + 1);
				track.add(makeEvent(144,1,r,100,i));
				track.add(makeEvent(176,1,127,0,i));
				track.add(makeEvent(128,1,r,100,i+2));
			}
			
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			
			int[] eventIWant = {127};
			sequencer.addControllerEventListener(myPanel, eventIWant);
			sequencer.setSequence(sequence);
			sequencer.setTempoInBPM(120);
			sequencer.start();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
	
	public static MidiEvent makeEvent(int command, int channel,
			int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage message = new ShortMessage();
			message.setMessage(command, channel, one, two);
			event = new MidiEvent(message, tick);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return event;
	}

	class MyPanel extends JPanel implements ControllerEventListener {
		
		boolean msg = false;
		
		public void controlChange(ShortMessage event) {
			msg = true;
			repaint();
		}
		
		public void paintComponent(Graphics g) {
			if (msg) {
				
				Graphics2D g2 = (Graphics2D) g;
				
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				g.setColor(new Color(red, green, blue));
				
				int height = (int) ((Math.random() * 120) + 10);
				int width = (int) ((Math.random() * 120) + 10);
				int x = (int) ((Math.random() * 40) + 10);
				int y = (int) ((Math.random() * 40) + 10);
				g.fillRect(x, y, width, height);
				msg = false;
			}
		}
	}

}
