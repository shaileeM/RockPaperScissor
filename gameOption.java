package rockPaperScissor;

public enum gameOption {
	ROCK(1,2), PAPER(2,3), SCISSOR(3,1), EMPTY(-1,-1);
	
	private int id ; 
	private int losesAgainst;
	
	gameOption(int id, int losesAgainst)
	{
		this.id = id;
		this.losesAgainst = losesAgainst;
	}
	
	
	public static gameOption valueOf(int userOption)
	{
		for(gameOption g : gameOption.values())
		{
			if(g.id == userOption)
			{
				return g;
			}
		}
		return EMPTY;
	}
	public gameResults calculate(gameOption userInput)
	{
		if(userInput.id == this.losesAgainst)
		{
			return gameResults.MACHINE;
		}
		return gameResults.USER;
	}

}
