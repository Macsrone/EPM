package lekser9;

public class Q12 {

	public static void main(String[] args) {

		String word ="xknowledgeX";

		String end = Character.toString(word.charAt(word.length()-1));
		String start =  Character.toString(word.charAt(0));
	
		if ( start.equalsIgnoreCase("x")) {
			word = word.substring(1)	;
		}
		if (  end.equalsIgnoreCase("x")) {
			word = word.substring(0,(word.length()-1));
		}
		System.out.println(word);
		
		
	}

}
