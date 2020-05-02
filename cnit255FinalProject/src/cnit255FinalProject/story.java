package cnit255FinalProject;
import enemies.SuperEnemy;
import enemies.toiletPaperHoarder;
import enemies.zombie;
import weapons.axe;
import weapons.knife;
import weapons.potatoSack;
import weapons.toyLightsaber;

public class story {

	game game;
	UserInterface ui;
	screenChanger screen;
	player user = new player();
	SuperEnemy enemy;
	
	public story(game g, UserInterface iface, screenChanger sc) {
		game = g;
		ui = iface;
		screen = sc;
	}
	
	//sets up the player's hp and weapon for the start of game
	public void setup() {
		user.hp = 10;
		ui.hpNumberLabel.setText(""+ user.hp);
		//user.currentWeapon = new knife();
		//ui.weaponNameLabel.setText(user.currentWeapon.name);
	}
	
	public void selectPosition(String nextPosition) {
		
		switch(nextPosition) {
		case "inside": storeEntrance(); break;
		case "run": leaveStore(); break;
		case "restart": screen.showTitle(); break;
		case "exit": exitGame(); break;
		case "lightsaber": lightsaberPick(); break;
		case "potatoes": potatoesPick(); break;
		case "knife": knifePick(); break;
		case "axe": axePick(); break;
		case "continue": encounter1(); break;
		case "fight": fight(); break;
		case "flee": flee(); break;
		case "attack": attack(); break;
		case "monsterAttack": monsterAttack(); break;
		case "win": winEncounter(); break;
		case "lose": loseEncounter(); break;
		case "continue1": heal(); break;
		case "continue2": encounter2(); break;
		case "win2": winEncounter2(); break;
		
			
		}
	}
	
	/*For Copy Paste Purposes:
	  ui.storyText.setText("");
	  ui.choice1.setText("");
	  ui.choice2.setText("");
	  ui.choice3.setText("");
	  ui.choice4.setText("");
	  game.nextPosition1 = "";
	  game.nextPosition2 = "";	
	  game.nextPosition3 = "";	
	  game.nextPosition4 = "";
	 */
	
	public void groceryStore() {
		ui.storyText.setText("You drive to the grocery store to get your daily case of toilet paper. There seems to be even less traffic than before. "
				+ "Actually, there is no traffic. You pull into the parking lot and nobody is in any of the cars. It is dead silent."
				+ " You do see movement as you get to the store, but it seems unnatural."
				+ " As you get closer you realize that it is full of zombies!  \n\nWhat do you do?");
		user.hp = 10;
		ui.hpNumberLabel.setText("" + user.hp);
		ui.choice1.setText("Go inside, you need that TP!");
		ui.choice2.setText("Run away");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPosition1 = "inside";
		game.nextPosition2 = "run";	
		game.nextPosition3 = "";	
		game.nextPosition4 = "";	
	}
	
	public void storeEntrance() {
		ui.storyText.setText("You carefully enter the store. None of the zombies notice you, since they're busy shambling around and eating food off the shelves."
				+ " You decide you need a weapon, so you look around you to see what's avaliable. Luckily, there are several items lying around. \n\nWhich one would you like to use?");
		ui.choice1.setText("Toy Lightsaber");
		ui.choice2.setText("Sack of Potatoes");
		ui.choice3.setText("Kitchen knife");
		ui.choice4.setText("Axe");
		
		game.nextPosition1 = "lightsaber";
		game.nextPosition2 = "potatoes";	
		game.nextPosition3 = "knife";	
		game.nextPosition4 = "axe";	
	}
	
	public void leaveStore() {
		ui.storyText.setText("You get in your car and drive away. You may perish without your dear toilet paper, but at least "
				+ "you won't get bitten by a zombie today.");
		  ui.choice1.setText("Start Over");
		  ui.choice2.setText("Exit");
		  ui.choice3.setText("");
		  ui.choice4.setText("");
		  game.nextPosition1 = "restart";
		  game.nextPosition2 = "exit";	
		  game.nextPosition3 = "";	
		  game.nextPosition4 = "";
	}
	
	public void lightsaberPick() {
		user.currentWeapon = new toyLightsaber();
		ui.weaponNameLabel.setText(user.currentWeapon.name);
		ui.storyText.setText("You pick up a lightsaber from the kid's toy section near the front of the store."
				+ " It probably won't do much damage, but it's better than nothing. \n\n 2 Max Damage.");
		  ui.choice1.setText("Continue for the toilet paper");
		  ui.choice2.setText("Go back and pick a new weapon");
		  ui.choice3.setText("");
		  ui.choice4.setText("");
		  game.nextPosition1 = "continue";
		  game.nextPosition2 = "inside";	
		  game.nextPosition3 = "";	
		  game.nextPosition4 = "";
	}
	public void potatoesPick() {
		user.currentWeapon = new potatoSack();
		ui.weaponNameLabel.setText(user.currentWeapon.name);
		ui.storyText.setText("You pick up a big sack of potatoes from the produce area. This thing looks like it has some weight. \n\n 4 Max Damage.");
		  ui.choice1.setText("Continue for the toilet paper");
		  ui.choice2.setText("Go back and pick a new weapon");
		  ui.choice3.setText("");
		  ui.choice4.setText("");
		  game.nextPosition1 = "continue";
		  game.nextPosition2 = "inside";	
		  game.nextPosition3 = "";	
		  game.nextPosition4 = "";
	}
	public void knifePick() {
		user.currentWeapon = new knife();
		ui.weaponNameLabel.setText(user.currentWeapon.name);
		ui.storyText.setText("You pick up a knife from the kitchen supplies. This looks sharp! \n\n 6 Max Damage.");
		  ui.choice1.setText("Continue for the toilet paper");
		  ui.choice2.setText("Go back and pick a new weapon");
		  ui.choice3.setText("");
		  ui.choice4.setText("");
		  game.nextPosition1 = "continue";
		  game.nextPosition2 = "inside";	
		  game.nextPosition3 = "";	
		  game.nextPosition4 = "";
	}
	public void axePick() {
		user.currentWeapon = new axe();
		ui.weaponNameLabel.setText(user.currentWeapon.name);
		ui.storyText.setText("You pick up an axe from the home improvement section. This looks like it could do some real work. \n\n 8 Max Damage.");
		  ui.choice1.setText("Continue for the toilet paper");
		  ui.choice2.setText("Go back and pick a new weapon");
		  ui.choice3.setText("");
		  ui.choice4.setText("");
		  game.nextPosition1 = "continue";
		  game.nextPosition2 = "inside";	
		  game.nextPosition3 = "";	
		  game.nextPosition4 = "";
	}
	
	public void encounter1() {
		enemy = new zombie();
		
		 ui.storyText.setText("You begin sneaking towards the bathroom supplies section to get your coveted toilet paper."
		 		+ " Luckily, most of the zombies are distracted by the food in other areas of the store, but you stay careful."
		 		+ " You get about halfway there when all of a sudden you round a corner and find yourself face to face with one of the undead!"
		 		+ "\n\n What do you do? ");
		  ui.choice1.setText("Fight");
		  ui.choice2.setText("Run back Home");
		  ui.choice3.setText("");
		  ui.choice4.setText("");
		  game.nextPosition1 = "fight";
		  game.nextPosition2 = "flee";	
		  game.nextPosition3 = "";	
		  game.nextPosition4 = "";
	}
	
	public void fight() {
		ui.storyText.setText("You square up for a fight, and ready up your " + user.currentWeapon.name + " for battle. \n\nThe enemy "
				+ enemy.name + " has " + enemy.hp + " hp.");
		  ui.choice1.setText("Hit");
		  ui.choice2.setText("");
		  ui.choice3.setText("");
		  ui.choice4.setText("");
		  game.nextPosition1 = "attack";
		  game.nextPosition2 = "";	
		  game.nextPosition3 = "";	
		  game.nextPosition4 = "";
	}
	
	public void flee() {
		ui.storyText.setText("This encounter was too much for you. You shriek and turn around, hightailing for the exit. "
				+ "You get in your car and drive home as fast as you can.");
		  ui.choice1.setText("Try Again");
		  ui.choice2.setText("Exit");
		  ui.choice3.setText("");
		  ui.choice4.setText("");
		  game.nextPosition1 = "restart";
		  game.nextPosition2 = "exit";	
		  game.nextPosition3 = "";	
		  game.nextPosition4 = "";
	}
	
	public void attack() {
		int playerDamage = new java.util.Random().nextInt(user.currentWeapon.damage);
		enemy.hp = enemy.hp - playerDamage;
		ui.storyText.setText("You attacked the " + enemy.name + " and gave " + playerDamage + " damage! \n\nThe enemy "
				+ enemy.name + " now has " + enemy.hp + " health.");
		  ui.choice1.setText(">");
		  ui.choice2.setText("");
		  ui.choice3.setText("");
		  ui.choice4.setText("");
		
		if(enemy.hp > 0) {
			game.nextPosition1 = "monsterAttack";
		}else if(enemy.hp<1) {
			game.nextPosition1 = "win";
		}

	}
	public void monsterAttack() {
		int monsterDamage = new java.util.Random().nextInt(enemy.attack);
		user.hp = user.hp - monsterDamage;
		ui.storyText.setText("The " + enemy.name + " hits you back, and deals " + monsterDamage + " damage back to you!");
		ui.hpNumberLabel.setText("" + user.hp);
		 ui.choice1.setText("Hit Again");
		  ui.choice2.setText("");
		  ui.choice3.setText("");
		  ui.choice4.setText("");
		  if(user.hp > 0) {
				game.nextPosition1 = "attack";
		  }else if(user.hp<1) {
				game.nextPosition1 = "lose";
		  }
	}
	public void winEncounter() {
		ui.storyText.setText("You defeated the "+ enemy.name + " Great Work. Now you can continue on for your toilet paper.");
		  ui.choice1.setText(">");
		  ui.choice2.setText("");
		  ui.choice3.setText("");
		  ui.choice4.setText("");
		  if(enemy.name == "zombie") {
		  game.nextPosition1 = "continue1";
		  }else {
		  game.nextPosition1 = "win2";
		  }
	}
	
	public void loseEncounter() {
		ui.storyText.setText("Sadly you were slain. Game Over!");
		  ui.choice1.setText("Try Again");
		  ui.choice2.setText("Exit");
		  ui.choice3.setText("");
		  ui.choice4.setText("");
		  game.nextPosition1 = "restart";
		  game.nextPosition2 = "exit";	
		  game.nextPosition3 = "";	
		  game.nextPosition4 = "";
	}
	
	public void heal() {
		ui.storyText.setText("You continue sneaking through the store towards your toilet paper. On the way, you find a package of oreos! Lucky you..."
				+ "\n\n+8 HP.");
		user.hp = user.hp + 8;
		ui.hpNumberLabel.setText("" + user.hp);
		  ui.choice1.setText(">");
		  ui.choice2.setText("");
		  ui.choice3.setText("");
		  ui.choice4.setText("");
		  game.nextPosition1 = "continue2";
		  game.nextPosition2 = "";	
		  game.nextPosition3 = "";	
		  game.nextPosition4 = "";
	}
	
	public void encounter2() {
		enemy = new toiletPaperHoarder();
		ui.storyText.setText("Finally you make it to the bathroom supplies section. It looks dangerously empty, but after searching for"
				+ " a minute you finally spot a single 16-roll package in the entire section. As you reach out for it, you hear a deep voice behind you:"
				+ "\n\n'Are you trying to take my toilet paper!?'\n\nYou whirl around to face a large man standing behind you. Behind him is a shopping cart "
				+ "full to the brim with packages of toilet paper. It seems you've run into a toilet paper hoarder. \n\nWhat will you do?");
		  ui.choice1.setText("Fight");
		  ui.choice2.setText("Run Back Home");
		  ui.choice3.setText("");
		  ui.choice4.setText("");
		  game.nextPosition1 = "fight";
		  game.nextPosition2 = "flee";	
		  game.nextPosition3 = "";	
		  game.nextPosition4 = "";
	}
	
	public void winEncounter2() {
		ui.storyText.setText("VICTORY!\n\n"
				+ "You defeated the toilet paper hoarder! Great Work. You grab the last package of toilet paper you came for, and his entire stash."
				+ "Then you make a run for the door, ignoring the rest of the zombies in the store. You get in your car, finally relieved that your adventure is over.");
		  ui.choice1.setText("Play Again");
		  ui.choice2.setText("Exit");
		  ui.choice3.setText("");
		  ui.choice4.setText("");
		  game.nextPosition1 = "restart";
		  game.nextPosition2 = "exit";	
		  game.nextPosition3 = "";	
		  game.nextPosition4 = "";
	}
	
	public void exitGame() {
		System.exit(0);
	}
}
