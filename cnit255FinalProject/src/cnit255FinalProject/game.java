package cnit255FinalProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*This is my cnit255 Final project
 * Austin Fisher
 * 
 */

//this is the main class for the project.
public class game {

	choices choiceHandle = new choices();
	UserInterface ui = new UserInterface();
	screenChanger sc = new screenChanger(ui);
	story Story = new story(this, ui, sc);
	
	String nextPosition1, nextPosition2, nextPosition3, nextPosition4;
	
	public static void main(String[] args) {
		new game();
	}

	//method for running the game
	public game() {

		ui.createUI(choiceHandle);
		Story.setup();
		sc.showTitle();
	}

	public class choices implements ActionListener {

		public void actionPerformed(ActionEvent event) {
					
			/*in our game, after the player presses start, they will have up to 4 options/choices for each interaction.
			 * this means that there are 5 total buttons in our game, so a switch statement can be used in this method for
			 * handling each of the player's inputs.
			 */
			String playerChoice = event.getActionCommand();
			
			switch(playerChoice) {
			case "start": sc.showGame(); Story.groceryStore(); break; 
			case "c1": Story.selectPosition(nextPosition1); break;
			case "c2": Story.selectPosition(nextPosition2); break;
			case "c3": Story.selectPosition(nextPosition3);break;
			case "c4": Story.selectPosition(nextPosition4);break;
			}
			
		}

	}
}
