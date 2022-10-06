
public abstract class Player {

	protected String myName;
	public int myScore; // changed to public because it is not retrievable 1.
	private final int WIN_SCORE = 100;
	
	public Player(String myName){
		myScore = 0;
	}
	
	// Each player must provide logic for deciding to roll again
	public abstract boolean rollAgain(int totalSoFar);
	
	public String toString(){
		return myName+": "+myScore;
	}
	
	public boolean hasWon(){
		return myScore >= WIN_SCORE;
	}
	
	public void resetScore(){
		myScore = 0;
	}
	
	public void addToScore(int thisRound){ // possible error here 4.
		myScore += thisRound;
	}
	
	public String getName(){
		return myName;
	}
}
