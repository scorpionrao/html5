package headfirst.serialization;

import java.awt.event.*;
import java.awt.*;
import java.util.*;

import javax.swing.*;

import java.io.*;

public class QuizCardPlayer {
	
	private JTextArea display;
	private JTextArea answer;
	private ArrayList<QuizCard> cardList;
	private QuizCard currentCard;
	private int currentCardIndex;
	private JFrame frame;
	private JButton nextButton;
	private boolean isShowAnswer;
	
	public static void main(String[] args) {
		new QuizCardPlayer().go();
	}
	
	public void go() {
		// build and display gui
		frame = new JFrame("Quiz Card Player");
		JPanel mainPanel = new JPanel();
		Font bigFont = new Font("sanserif", Font.BOLD, 24);
		
		display = new JTextArea(10,20);
		display.setFont(bigFont);
		display.setLineWrap(true);
		display.setEditable(false);

		JScrollPane qScroller = new JScrollPane(display);
		qScroller.setVerticalScrollBarPolicy(
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		nextButton = new JButton("Show Question");
		mainPanel.add(qScroller);
		mainPanel.add(nextButton);
		nextButton.addActionListener(new NextCardListener());
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem loadMenuItem = new JMenuItem("Load card set");
		loadMenuItem.addActionListener(new OpenMenuListener());
		
		fileMenu.add(loadMenuItem);
		menuBar.add(fileMenu);
		
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(640,500);
		frame.setVisible(true);
		
	}

	public class NextCardListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// if question, show answer, else next question
			if (isShowAnswer) {
				display.setText(currentCard.getAnswer());
				nextButton.setText("Next Card");
				isShowAnswer = false;
			} else {
				// show the next question
				if(currentCardIndex < cardList.size()) {
					showNextCard();
				} else {
					// there are no more cards!
					display.setText("That was the last card");
					nextButton.setEnabled(false);
				}
			}
		}
	}
	
	public class OpenMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// bring up a file dialog box
			// let the user navigate to and choose a card set to open
			JFileChooser fileOpen = new JFileChooser();
			fileOpen.showOpenDialog(frame);
			loadFile(fileOpen.getSelectedFile());
		}
	}
	
	private void loadFile(File file) {
		// must build an ArrayList of cards, by reading them froma text file
		// called from OpenMenuListener event handler, reading one file a time
		// and tells the makeCard() method to make a new card of the line
		// (one line in the file holds both the question and answer and "/"
		cardList = new ArrayList<QuizCard>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				makeCard(line);
			}
			reader.close();
		} catch (IOException ex) {
			System.out.println("Could not read file");
			ex.printStackTrace();
		}
		
		// now time to start by showing the first card
		showNextCard();
		
	}
	
	private void makeCard(String lineToParse) {
		// called by the loadFile method, takes a line from the text file
		// and parses into two pieces-question and answer and creates
		// a new QuizCard and adds it to the ArrayList called CardList
		String result[] = lineToParse.split("/");
		QuizCard card = new QuizCard(result[0], result[1]);
		cardList.add(card);
		System.out.println("Made a card");
	}
	
	private void showNextCard() {
		currentCard = cardList.get(currentCardIndex);
		currentCardIndex++;
		display.setText(currentCard.getQuestion());
		nextButton.setText("Show Answer");
		isShowAnswer = true;
	}

}