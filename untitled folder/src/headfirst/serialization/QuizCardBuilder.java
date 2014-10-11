package headfirst.serialization;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class QuizCardBuilder {
	
	private JTextArea question;
	private JTextArea answer;
	private ArrayList<QuizCard> cardList;
	private JFrame frame;
	
	public static void main(String[] args) {
		new QuizCardBuilder().go();
	}
	
	public void go() {
		
		// build and display gui
		frame = new JFrame("Quiz Card Builder");
		frame.setVisible(true);
		JPanel mainPanel = new JPanel();
		Font bigFont = new Font("sanserif", Font.BOLD, 24);
		
		question = new JTextArea(6,20);
		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		question.setFont(bigFont);
		JScrollPane qScroller = new JScrollPane(question);
		qScroller.setVerticalScrollBarPolicy(
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		answer = new JTextArea(6,20);
		answer.setLineWrap(true);
		answer.setWrapStyleWord(true);
		answer.setFont(bigFont);
		JScrollPane aScroller = new JScrollPane(answer);
		aScroller.setVerticalScrollBarPolicy(
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		aScroller.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton nextButton = new JButton("Next Card");
		
		JLabel qLabel = new JLabel("Question");
		JLabel aLabel = new JLabel("Answer");
		
		mainPanel.add(qLabel);
		mainPanel.add(qScroller);
		mainPanel.add(aLabel);
		mainPanel.add(aScroller);
		mainPanel.add(nextButton);
		
		nextButton.addActionListener(new NextCardListener());
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem newMenuItem = new JMenuItem("New");
		JMenuItem saveMenuItem = new JMenuItem("Save");
		
		newMenuItem.addActionListener(new NewMenuListener());
		saveMenuItem.addActionListener(new SaveMenuListener());
		
		fileMenu.add(newMenuItem);
		fileMenu.add(saveMenuItem);
		menuBar.add(fileMenu);
		
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(500,600);
	
		
		cardList = new ArrayList<QuizCard>();

	}
	
	public class NextCardListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// add the current card to the list
			// and clear the text areas
			QuizCard card = new QuizCard(question.getText(), answer.getText());
			cardList.add(card);
			clearCard();
		}
	}
	
	public class SaveMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// bring up a file dialog box
			// let the user name and save the set
			QuizCard card = new QuizCard(question.getText(), answer.getText());
			cardList.add(card);
			
			JFileChooser fileChooserForSave = new JFileChooser();
			fileChooserForSave.showSaveDialog(frame);
			saveFile(fileChooserForSave.getSelectedFile());
		}
	}
	
	public class NewMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// clear out the card list, and clear out
			// the text areas
			cardList.clear();
			clearCard();
		}
	}
	
	private void clearCard() {
		question.setText("");
		answer.setText("");
		question.requestFocus();
	}
	
	public void saveFile(File file) {
		// iterate through list of cards, and write each to text file
		// in a parseable way
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			for (QuizCard card : cardList) {
				writer.write(card.getQuestion() + "/");
				writer.write(card.getAnswer() + "\n");
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
