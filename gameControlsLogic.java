package rockPaperScissor;

import java.util.Random;

public class gameControlsLogic implements gameControlsLogicInterface {
	
	int generatedNo = 0;
	int userNo = 0;
	
	private gameOption userChoice = gameOption.EMPTY;
	private gameOption machineChoice = gameOption.EMPTY;
	
	public gameControlsLogic()
	{
		
	}
	
	@Override
	public void welcomeMessage() {
		// TODO Auto-generated method stub
		
	}
	
	
	public void userSelection(int i)
	{
		userChoice = gameOption.valueOf(i);
	}

	@Override
	public void machineSelection() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		generatedNo = rand.nextInt(4);
		machineChoice = gameOption.valueOf(generatedNo);
		System.out.println("Machine choice:"+ machineChoice);
		
	}

	@Override
	public gameResults calculate() {
//		if(machineChoice == userChoice)
//		{
//			return false;
//		}
		if(userChoice == machineChoice)
		{
			System.out.println("ITS A DRAW");
			return gameResults.DRAW;
		}
		return machineChoice.calculate(userChoice);
		
	}



	
	

}
