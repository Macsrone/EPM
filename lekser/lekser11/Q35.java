package lekser11;
import java.util.*;
public class Q35 {

	public static void main(String[] args) {

		String sentence = "Java is fun";
		
		char space=' ';
		int blank1= sentence.indexOf(space);
		int blank2= sentence.lastIndexOf(space);
		
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add(sentence.substring(blank2+1, sentence.length()));
		arr.add(sentence.substring(blank1+1, blank2));
		arr.add(sentence.substring(0, blank1));
		
				for (String string : arr) {
					System.out.println(string);
				}
			}
		
	}


