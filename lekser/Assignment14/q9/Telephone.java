package Assignment14.q9;

public class Telephone {

	String number;
	public static int quantity=250;
	public static double total =15658.92;
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public static void main(String[] args) {
		
		Telephone telephone= new Telephone();
		telephone.setNumber("2");
		
		System.out.println(telephone.getNumber());
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
