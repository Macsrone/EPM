package lekser9;

public class Q6 {

	public static void main(String[] args) {

		String word1 = "wella";
	
		if (word1.length()>5 ) {
		System.out.println("Too long");
		}
		else if (word1.length()<5 ) {
		System.out.println("Too short");
		}
		else {
			for (int i =word1.length()-1; i >=0; i--) {
				System.out.print(word1.charAt(i)); 
				
			}
			
		}
	}



}
