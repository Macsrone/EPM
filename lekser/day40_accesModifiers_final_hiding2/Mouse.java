package day40_accesModifiers_final_hiding2;

public class Mouse extends Rodent {
	
	protected int tailLenght = 8;
	
	public void getMouseDetails() {
		System.out.println("tail:" + tailLenght + ", parentTail:" + tailLenght);
	}
	
}
