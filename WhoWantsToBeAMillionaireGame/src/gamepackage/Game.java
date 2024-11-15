package gamepackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	private Player player;
	private QuestionBank questions;
	private boolean easyMode;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Game() {
		this.player = new Player();
		this.questions = new QuestionBank();
		
		this.displayAndSelectMenu();
	}
	
	public void displayAndSelectMenu() {
		showGameMenu();
		getMenuOption();
	}
	
	public void showGameMenu() {
		System.out.println("-----------------------------------------------------");
		System.out.println("WELCOME TO THE GAME 'WHO WANTS TO BE A MILLIONAIRE'");
		System.out.println("-----------------------------------------------------");
		System.out.println("TO BEGIN, SELECT ONE OF THE FOLLOWING OPTIONS:");
		System.out.println("1. START THE GAME");
		System.out.println("2. VIEW THE RULES OF THE GAME");
		System.out.println("3. EXIT THE GAME");
	}
	
	public void getMenuOption() {
		System.out.print("ENTER OPTION: ");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch(option) {
			case 1:
				setupGame();
				startGame();
				break;
			case 2:
				printRules();
				break;
			case 3:
				exitGame();
				break;
			default:
				System.out.println("OPTION DOES NOT EXIST");
				exitGame();
		}
	}
	
	public void getDifficulty() {
		System.out.println("SELECT THE DIFFICULTY LEVEL : ");
		System.out.println("1. EASY");
		System.out.println("2. HARD");
		
		System.out.print("ENTER OPTION: ");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch(option) {
			case 1:
				this.easyMode = true;
				break;
			case 2:
				this.easyMode = false;
				break;
			default:
				System.out.println("OPTION DOES NOT EXIST");
				exitGame();
		}
	}
	
	public void startGame() {
		System.out.println("STARTING GAME...");
		playGame();
	}
	
	public void setupGame() {
		player.promptName();
		this.getDifficulty();
	}
	
	public void playGame() {

	}
	
	public void printRules() {
		System.out.println("rules");
		System.out.println("-----------------------------------------------------");
		System.out.print("ENTER b TO GO BACK TO THE MAIN MENU: ");
		Scanner sc = new Scanner(System.in);
		String option = sc.next();
		switch(option) {
			case "b":
				displayAndSelectMenu();
				break;
		}
	}
	
	public void exitGame() {
		System.out.println("THANK YOU FOR PLAYING THE THE GAME, EXITING...");
		System.exit(0);
	}
	
}