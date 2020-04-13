package lekser11;

import java.util.Arrays;

public class Q46 {

	public static void main(String[] args) {

	
		String wordsString = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
		String[] words = wordsString.split(", ");
		
		int shortlength = words[0].length();
		int counter = 0;
		
		for (int i = 0; i < words.length; i++) {
		
			if ( words[i].length ()< shortlength ) {
				shortlength = words[i].length();
			}
		}
			for (int i = 0; i < words.length; i++) {
			
				if (words[i].length () == shortlength  ) {
				counter++;
			}			
		}
		String[] shortest = new String [counter];
		
		int lastCounter = 0;
		
		for (int i = 0; i < words.length; i++) {
		
			if (words[i].length () == shortlength  ) {
				shortest[lastCounter] =  words[i];
				lastCounter++;
			}			
		}
		 Arrays.sort(shortest);
			System.out.println(Arrays.toString(shortest));
	}
}