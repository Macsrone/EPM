package day40_accesModifiers_final_hiding2;

public class Marsupial {

	public boolean isBiped() {
		return false;
	}
	
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on the two legs:" + isBiped());
	}
	
}
