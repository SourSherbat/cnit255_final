package cnit255FinalProject;

/*this class is made for the purpose of changing content on the screen
 *
 */
public class screenChanger {
	
	UserInterface screen;

	public screenChanger(UserInterface ui) {
		screen = ui;
	}
	
	//shows the title and start button and hides main game content
	public void showTitle() {
		screen.titleNamePanel.setVisible(true);
		screen.startButtonPanel.setVisible(true);
		
		screen.mainTextPanel.setVisible(false);
		screen.choicesPanel.setVisible(false);
		screen.playerStatsPanel.setVisible(false);
		
	}
	
	//shows main game content and hides the start screen
	public void showGame() {
		screen.mainTextPanel.setVisible(true);
		screen.choicesPanel.setVisible(true);
		screen.playerStatsPanel.setVisible(true);
		
		screen.titleNamePanel.setVisible(false);
		screen.startButtonPanel.setVisible(false);
	}
}
