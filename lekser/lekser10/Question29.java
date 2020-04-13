package lekser10;

public class Question29 {

	public static void main(String[] args) {
		
	System.out.println(limit("hello", 4));	
	System.out.println(limit("hello", 3));


		
	}
	
	public static String limit(String word,int numberOfCharacter ) {
		
		String limit= word.substring(0, numberOfCharacter);
		
		return limit;
		
	}
	
}
