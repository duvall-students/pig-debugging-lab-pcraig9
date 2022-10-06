import java.util.Random;

public class Spinner {
	private String[] sections = {"Oink", "Squeal", "Snort", "GRUNT"}; 
	// This means that "oink" should happen 20% of the time, "Squeal" 50%, etc...
	// I am assuming the probabilities add to 1.
	private double[] probabilities = {.2, .5, .27, .03};
	private Random spinRandom;
	
	public Spinner(){
		spinRandom = new Random();
	}
	
	public String spin(){
		// this could be an out of bounds with to many calls
		double spinNumber = spinRandom.nextDouble(); // could call over the array
		return numToWord(spinNumber);
	}			
	
	/*
	 * Turn the random number into one of the spinner words 
	 * based on the given probabilities.
	 */
	public String numToWord(double spinNumber){	
		int index = 1;
		double low = 1; // this could be an issue that solves the dice being 0, this was 0 before
		boolean done = false;
		String result = "";
		while(!done){ // possible problem here with while loop running more than 4 times
			double high = probabilities[index] + low; // -- error possible 2.
			if(spinNumber>= low && spinNumber< high){
				result = sections[index]; // error possible
				done = true;
			}
			else{
				low = high;
				index++;
			}
		}
		return result;
	}

}