package lekser9;

public class Q7 {

	public static void main(String[] args) {

		String word1 = "java";
	  
		if (word1.length()%2==1 ) {
		System.out.println("Invalid input");
		}
	
		else {
			for (int i = 0; i <2; i++) {
				System.out.print( word1.substring(0, (word1.length()/2)));	
			}
		}
	}
}
