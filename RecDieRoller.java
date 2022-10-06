
/**
 * Recursive Dice game.
 * @author Zachary Cowan
 * @version 10/6/2022
 * Fall/2022
 */
public class RecDieRoller {
	private int lastRoll = -1;
	private final int NUM_FACES = 6;
	private int numOfRolls = 0;	
	
	
	/**
	 * Roll the dice a single time.
	 * @return the roll.
	 */
	public int roll() {
		int numRolled = (int) ((Math.random() * 6) +1);
		setLastRoll(numRolled);
		return numRolled;
	}
	
	
	/**
	 * Roll the dice until target number is rolled face up.
	 * @param numToRollTill Target number.
	 * @return the last roll, aka the target number.
	 */
	public int roll(int numToRollTill) {
		setLastRoll(roll());
		incrementNumRolls();
		System.out.println("Roll " + getNumOfRolls() + ":\t" + getLastRoll());
		if( getLastRoll() != numToRollTill ) {
			roll(numToRollTill);
		}
		else if( getLastRoll() == numToRollTill) {
			System.out.println("Rolled a " + numToRollTill + " in " + getNumOfRolls() + " rolls.");
		}
		return getLastRoll();
	}
	/**
	 * Roll the dice until target number is rolled face up.
	 * Has option to remove print statements.
	 * @param numToRollTill Target number.
	 * @param doPrint True if you want to print each roll and number of rolls taken.
	 * @return the last roll, aka the target number.
	 */
	public int roll(int numToRollTill, boolean doPrint) {
		setLastRoll(roll());
		incrementNumRolls();
		if( doPrint ) {
			System.out.println("Roll " + getNumOfRolls() + ":\t" + getLastRoll());
		}
		if( getLastRoll() != numToRollTill ) {
			roll(numToRollTill, doPrint);
		}
		else if( getLastRoll() == numToRollTill) {
			if( doPrint ) {
				System.out.println("Rolled a " + numToRollTill + " in " + getNumOfRolls() + " rolls.");
			}
		}
		return getLastRoll();
	}

	
	/**
	 * Gets the most recent roll in a trial.
	 * @return The latest roll in a trial.
	 */
	public int getLastRoll() {
		return lastRoll;
	}

	
	/**
	 * Used to set the last roll as the random value created in one call of the roll method.
	 * @param lastRoll Value to set as last roll.
	 */
	private void setLastRoll(int lastRoll) {
		this.lastRoll = lastRoll;
	}

	/**
	 * Gets the number of faces on the die.
	 * @return The number of faces on the die.
	 */
	public int getNumFaces() {
		return NUM_FACES;
	}
	
	/**
	 * Gets the number of rolls made to reach the target number.
	 * @return The number of rolls.
	 */
	public int getNumOfRolls() {
		return numOfRolls;
	}
	
	/**
	 * Resets the number of rolls made to reach the target number.
	 */
	public void resetNumOfRolls() {
		numOfRolls = 0;
	}
	
	/**
	 * Increases the number of rolls made.
	 * Represents a single roll being made in a trial.
	 */
	private void incrementNumRolls() {
		numOfRolls += 1;
	}
	
	
}
