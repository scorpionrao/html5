package headfirst.networkandthreads;

import java.io.*;
import java.net.*;
import java.util.HashSet;
import java.util.Set;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class SimpleChatClientB {
	
	JTextField outgoing;
	JTextArea incoming;
	BufferedReader reader;
	PrintWriter writer;
	Socket sock;
	String userName = "scorpionrao";
	
	public void go() {
		// make gui and register a listener with the send button
		// call the setUpNetworking() method
		JFrame frame = new JFrame(userName);
		JPanel mainPanel = new JPanel();
		incoming = new JTextArea(15, 50);
		incoming.setLineWrap(true);
		incoming.setWrapStyleWord(true);
		incoming.setEditable(false);
		incoming.setText("Welcome " + userName + "!!!\n");
		JScrollPane qScroller = new JScrollPane(incoming);
		qScroller.setVerticalScrollBarPolicy(
			ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		outgoing = new JTextField(20);
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendButtonListener());
		mainPanel.add(qScroller);
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		setUpNetworking();
		
		Thread readerThread = new Thread(new IncomingReader());
		readerThread.start();
		
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(650, 500);
		frame.setVisible(true);
	}
	
	private void setUpNetworking() {
		// make a Socket, then make a PrintWriter
		// assign the PrintWriter to writer instance variable
		try {
			sock = new Socket("127.0.0.1", 2721);
			InputStreamReader inputStreamReader = new InputStreamReader(
					sock.getInputStream());
			reader = new BufferedReader(inputStreamReader);
			writer = new PrintWriter(sock.getOutputStream());
			System.out.println("networking established");
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
	
	public class SendButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// get the text from the text field and
			// send it to the server using the writer (a PrintWriter)
			try {
				writer.println(userName + ": " + outgoing.getText());
				writer.flush();
			} catch(Exception ex) {
				ex.printStackTrace();
			}
			outgoing.setText("");
			outgoing.requestFocus();
		}
	}
	
	public class IncomingReader implements Runnable {
		public void run() {
			String message;
			try {
				while ((message = reader.readLine()) != null) {
					System.out.println(message);
					incoming.append(message + "\n"); 
				}
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new SimpleChatClientB().go();
	}

}
