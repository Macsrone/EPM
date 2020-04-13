package lekser12;

import java.util.*;

public class Q64 {

	public static void main(String[] args) {

		ArrayList <String> wordList1 = new ArrayList<>( Arrays.asList("java","c++","python"));
		ArrayList <String> wordList2 = new ArrayList<>( Arrays.asList(".net","Csharp"));

		
		System.out.println(combineAL(wordList1,wordList2));
}

	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {
		ArrayList <String> combine = new ArrayList<>();
		
		for (String string : wordList1) {
			combine.add(string);
			
		}
		for (String string : wordList2) {
			combine.add(string);
			
		}

		return combine;
		
	}
}