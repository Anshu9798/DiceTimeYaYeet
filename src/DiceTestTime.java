import java.util.Scanner;

public class DiceTestTime {

	public static void main(String[] args) {
	
		DiceTime dice1 = new DiceTime();
		DiceTime dice2 = new DiceTime();
		DiceTime diceA = new DiceTime();
		DiceTime diceB = new DiceTime();
		boolean isDouble =false;
		
		while (isDouble == false);
		{
			int roll1 = dice1.roll();
			int roll2 = dice2.roll();
			System.out.println(roll1);
			System.out.println(roll2);
			System.out.println(roll1 + roll2);
			 if (roll1==roll2) {
				 isDouble = true;
				 System.out.println(dice1.getNumRolls());
			 }
		}
		Scanner in = new Scanner (System.in);
	    System.out.print("Enter a value between 2 and 12: ");
	    int inValue = in.nextInt();
	    while (inValue < 2 || inValue > 12)
	    	
	    {
	        System.out.print("Enter a value between 2 and 12: ");
	        inValue = in.nextInt();
	    }
	    int rollvalue = 0;
	    while (rollvalue != inValue)
	    {
	        int rollA = diceA.roll();
	        
	        int rollB = diceB.roll();
	        
	        System.out.println(rollA);
	        
	        System.out.println(rollB);
	        
	        System.out.println(rollA + rollB);
	        
	        rollvalue = rollA + rollB;
	        
	        if (rollvalue == inValue)
	        {
	            System.out.println(diceA.getNumRolls());
	        }
	} 
	
}
}
