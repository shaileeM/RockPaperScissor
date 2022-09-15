package rockPaperScissor;

import java.util.Scanner;

public class rockPaperScissor {
	
	public static void main(String[] args)
	{
		gameControlsLogic gc = new gameControlsLogic();
		
		
		gc.welcomeMessage();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice");
		int userChoice = s.nextInt();
		
		gc.userSelection(userChoice);
		gc.machineSelection();
		
		gameResults r = gc.calculate();
		System.out.println(r + " Won");
		
	}

}
