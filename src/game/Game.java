package game;

import java.util.Random;
import java.util.Scanner;

public class Game {
	private String[] objects = {"ROCK", "PAPER", "SCISSORS"};
	private Random random = new Random();
	private int[][] comparisonTable = {
			{0, -1, 1}, {1, 0, -1}, {-1, 1, 0}
	};
	Scanner scanner = new Scanner(System.in);
	
	public void run() {
		String[] status = {"lose", "draw", "win"};
		

		
		int wins = 0;
		
		for(int i=0; i<3; i++) {
			String obj1 = obj1();
			int compIndex = computerPicks(obj1);

			displayPrompt();

			String obj2 = obj2();

			int userIndex = userPicks(obj2);
			
			displayRoundResults(obj2, obj1);
			
			int comparison = comparisonTable[userIndex][compIndex];
			System.out.println(status[comparison + 1]);
			
			wins += comparison;
			
			System.out.println("\n");
		}
		
		scanner.close();
		System.out.println();
		
		if(wins > 0) {
			System.out.println("You have won!");
		} else if(wins < 0) {
			System.out.println("You have lost!");
		} else {
			System.out.println("It's a draw!");
		}
	}
	
	private String obj1() {
		return objects[random.nextInt(objects.length)];
	}
	
	private int computerPicks(String obj1) {
		GameObjects compObj = GameObjects.valueOf(obj1);
		return compObj.getId();
	}
	
	private String obj2() {
		int objectIndex = scanner.nextInt();
		return objects[objectIndex -1];
	}
	
	private int userPicks(String obj2) {
		GameObjects userObj = GameObjects.valueOf(obj2);
		return userObj.getId();
	}
	
	public void displayPrompt() {
		System.out.println("Choose an object.");
		System.out.println("1. Rock");
		System.out.println("2. Paper");
		System.out.println("3. Scissors");
		System.out.print("> ");
	}
	
	public void displayRoundResults(String obj2, String obj1) {
		System.out.println("You chose: " + obj2);
		System.out.println("The computer chose: " + obj1);
	}
}
