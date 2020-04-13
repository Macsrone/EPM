package lekser12;

import java.util.*;

public class Q61 {

	public static void main(String[] args) {
		
		ArrayList <String> words = new ArrayList<>( Arrays.asList("null","cybertek","null","java"));
		
		System.out.println(words);
		set(words);
		
	}

	public static void set(ArrayList<String> words) {
		// TODO Auto-generated method stub
		words.set(0, "git");
		words.set(2, "gud");
		System.out.println(words);
	}

}
