package headfirst.graphics;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExample {

	public static void main(String[] args) {
		BorderLayoutExample gui = new BorderLayoutExample();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JButton east = new JButton("East");
		JButton west = new JButton("West");
		JButton north = new JButton("North");
		JButton south = new JButton("South");
		JButton center = new JButton("Center");
//		button.setFont(new Font("serif", Font.BOLD, 28));
		
		frame.getContentPane().add(BorderLayout.EAST, east);
		frame.getContentPane().add(BorderLayout.WEST, west);
		frame.getContentPane().add(BorderLayout.NORTH, north);
		frame.getContentPane().add(BorderLayout.SOUTH, south);
		frame.getContentPane().add(BorderLayout.CENTER, center);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
		
	}

}
