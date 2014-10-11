package headfirst.graphics;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutExample {
	public static void main(String[] args) {
		FlowLayoutExample gui = new FlowLayoutExample();
		gui.go();
	}
	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JButton buttonOne = new JButton("shock me");
		JButton buttonTwo = new JButton("bliss");
		JButton buttonThree = new JButton("huh?");
		
		panel.add(buttonOne);
		panel.add(buttonTwo);
		panel.add(buttonThree);
		
		//frame.getContentPane().add(panel);
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setSize(250, 200);
		frame.setVisible(true);
	}
}
