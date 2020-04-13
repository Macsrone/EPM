package lekser11;

public class Q34 {

	public static void main(String[] args) {

		String sentence = "Java is fun!";
		char space=' ';
		int blank1= sentence.indexOf(space);
		int blank2= sentence.lastIndexOf(space);
		
		System.out.println(sentence.substring(blank2+1, sentence.length()));
		System.out.println(sentence.substring(blank1+1, blank2));
		System.out.println(sentence.substring(0, blank1));
		
		}
		
		
	}


