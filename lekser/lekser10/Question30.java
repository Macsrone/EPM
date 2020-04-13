package lekser10;

public class Question30 {

	public static void main(String[] args) {

		System.out.println(at3("hello", "ba"));
		System.out.println(at3("longword","foo"));
	}

	
	public static String at3(String word1,String word2) {
		
		String word3= word1.substring(0,3) + word2;
		String word4= word3 + word1.substring(3, word1.length());
		
				return word4;
	}
}
