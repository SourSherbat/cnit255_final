package cnit255FinalProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import cnit255FinalProject.game.choices;


//this class is used to create the window and all the user interface elements of the game.

public class UserInterface {

	JFrame gameWindow;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choicesPanel, playerStatsPanel;
	JLabel titleNameLabel, titleSubheader, titleAuthors, hpLabel, hpNumberLabel, weaponLabel, weaponNameLabel;
	JTextArea storyText;
	
	//fonts for the text and titles in the game
	Font titleFont = new Font("Times new Roman", Font.PLAIN, 60);
	Font normalFont = new Font("Times new Roman", Font.PLAIN, 30);
	Font smallFont = new Font("Times new Roman", Font.PLAIN, 20);
	JButton startButton, choice1, choice2, choice3, choice4;
	
	public void createUI(choices choiceHandle) {
		gameWindow = new JFrame();
		gameWindow.setSize(800, 600);
		gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameWindow.getContentPane().setBackground(Color.black);
		gameWindow.setLayout(null);
		
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 300);
		titleNamePanel.setBackground(Color.black);
		
		// Game Title
		titleNameLabel = new JLabel("CNIT 255 Final Project");
		titleNameLabel.setForeground(Color.white); 
		titleNameLabel.setFont(titleFont);
		
		titleSubheader = new JLabel("Text Based Adventure Game");
		titleSubheader.setForeground(Color.white); 
		titleSubheader.setFont(normalFont);
		
		titleAuthors = new JLabel( "By Austin Fisher");
		titleAuthors.setForeground(Color.white); 
		titleAuthors.setFont(smallFont);
		
		//start button
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);

		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		
		//making the button actually work
		startButton.addActionListener(choiceHandle);
		startButton.setActionCommand("start");
		titleNamePanel.add(titleNameLabel);		
		titleNamePanel.add(titleSubheader);	
		titleNamePanel.add(titleAuthors);	
		startButtonPanel.add(startButton);
		gameWindow.add(titleNamePanel);
		gameWindow.add(startButtonPanel);	
		
		/*titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);*/
		
		//main game screen

		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 250);
		mainTextPanel.setBackground(Color.black);
		gameWindow.add(mainTextPanel);
		
		storyText = new JTextArea("This is the main area for text and story options to be shown");
		storyText.setBounds(100, 100, 600, 250);
		storyText.setBackground(Color.black);
		storyText.setForeground(Color.white);
		storyText.setFont(smallFont);
		storyText.setLineWrap(true);
		storyText.setWrapStyleWord(true);
		mainTextPanel.add(storyText);
		
		choicesPanel = new JPanel();
		choicesPanel.setBounds(250, 350, 300, 150);
		choicesPanel.setBackground(Color.black);
		choicesPanel.setLayout(new GridLayout(4,1));
		gameWindow.add(choicesPanel);
		
		choice1 = new JButton("Choice 1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(smallFont);
		choice1.setFocusPainted(false);
		choice1.addActionListener(choiceHandle);
		choice1.setActionCommand("c1");
		choicesPanel.add(choice1);
		
		choice2 = new JButton("Choice 2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(smallFont);
		choice2.setFocusPainted(false);
		choice2.addActionListener(choiceHandle);
		choice2.setActionCommand("c2");
		choicesPanel.add(choice2);
		
		choice3 = new JButton("Choice 3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(smallFont);
		choice3.setFocusPainted(false);
		choice3.addActionListener(choiceHandle);
		choice3.setActionCommand("c3");
		choicesPanel.add(choice3);
		
		choice4 = new JButton("Choice 4");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(smallFont);
		choice4.setFocusPainted(false);
		choice4.addActionListener(choiceHandle);
		choice4.setActionCommand("c4");
		choicesPanel.add(choice4);
		
		playerStatsPanel = new JPanel();
		playerStatsPanel.setBounds(100, 15, 600, 50);
		playerStatsPanel.setBackground(Color.black);
		playerStatsPanel.setLayout(new GridLayout(1,4));
		gameWindow.add(playerStatsPanel);
		
		hpLabel = new JLabel("HP:");
		hpLabel.setFont(normalFont);
		hpLabel.setForeground(Color.white);
		playerStatsPanel.add(hpLabel);
		
		hpNumberLabel = new JLabel();
		hpNumberLabel.setFont(normalFont);
		hpNumberLabel.setForeground(Color.white);
		playerStatsPanel.add(hpNumberLabel);
		
		weaponLabel = new JLabel("Weapon:");
		weaponLabel.setFont(normalFont);
		weaponLabel.setForeground(Color.white);
		playerStatsPanel.add(weaponLabel);
		
		weaponNameLabel = new JLabel();
		weaponNameLabel.setFont(normalFont);
		weaponNameLabel.setForeground(Color.white);
		playerStatsPanel.add(weaponNameLabel); 
		
		gameWindow.setVisible(true);
	}
}
