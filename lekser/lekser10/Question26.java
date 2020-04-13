package lekser10;

public class Question26 {	
	public static void main(String[] args) {
	String input= "javasssrrrr";
	uniqueChars(input);	
}

public static void uniqueChars(String input) {
	
	for (int i = 0; i < input.length(); i++) {

			if (input.substring(0, i).contains(  String.valueOf(input.charAt(i))))  {
			continue;
			}
			System.out.print(input.charAt(i));

		
	}
	
}


}
