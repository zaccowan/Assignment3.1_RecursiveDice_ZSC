
/**
 * Driver class to test RecDieRoller
 * @author Zachary Cowan
 * @version 10/6/2022
 * Fall/2022
 */
public class RecDieRollerDriver {
	public static void main(String [] args) {
		RecDieRoller roller = new RecDieRoller();
		//System.out.println("Returned " + roller.roll(2));
		
		System.out.println("\nFinding the average number of rolls over a number of trials.");
		int sumOfRollsUsed = 0;
		int averageNumRolls = 0;
		final int NUMBER_OF_TRIALS = 1000;
		for( int roundNum = 0 ; roundNum < NUMBER_OF_TRIALS ; roundNum++ ) {
			roller.resetNumOfRolls();
			roller.roll(2, false);
			sumOfRollsUsed += roller.getNumOfRolls();
		}
		averageNumRolls = sumOfRollsUsed / NUMBER_OF_TRIALS;
		System.out.println("Average number of rolls:\t" + averageNumRolls);
	}
}
