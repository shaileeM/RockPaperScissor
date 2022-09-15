package rockPaperScissor;

public interface gameControlsLogicInterface {

	public void welcomeMessage();
	
	public void userSelection(int i);
	
	public void machineSelection();
	
	public gameResults calculate();
}
