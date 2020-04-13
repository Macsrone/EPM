package day34_contructors_passingObjectToMethod;

public class DiceTest {

	public static void main(String[] args) {

		final int SIX_SIDES = 6;
		final int TWENTY_SIDES = 20;
		
		Dice sixDice = new Dice(SIX_SIDES);
		Dice twentyDice = new Dice(TWENTY_SIDES);
		
		rollDice(sixDice);
		rollDice(twentyDice);
	}

	public static void rollDice(Dice d) {
		
		
		//rolling a 6 sided dice
		// The dice's values = 5
		System.out.println("Rolling a " + d.getSides() + " sided dice"); //rolling 6 sided dice

		System.out.println("The dice's value: " + d.getValue() );
	}
	
}
