package day36_staticClassMembers;

public class CalculatorTest {

	public static void main(String[] args) {

		
		double result = Calculator.minus(55,7);
		System.out.println("result: "+ result);
		Calculator c = new Calculator();
		System.out.println("Result:"+ c.plus(55, 7));
	
		
	}
	
}
