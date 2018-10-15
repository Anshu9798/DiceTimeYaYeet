
public class DiceTime {

	private int numRolls;
	
	public DiceTime() {
		numRolls= 0;
	}
	public int roll() {
		numRolls ++;
		return (int)((Math.random() * 6) + 1);
		}
	public int getNumRolls() {
		return numRolls;
	}
	
	
}
