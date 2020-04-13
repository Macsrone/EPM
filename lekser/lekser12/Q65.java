package lekser12;
import java.util.*;

public class Q65 {
		public static void main(String[] args) {
			ArrayList <String> wordList = new ArrayList<>( Arrays.asList("java","c++","python"));
			String targetWord ="All the items deleting...";
			removeAll(wordList,targetWord);		
	}
		public static void removeAll(ArrayList<String> wordList, String targetWord) {
			targetWord=null;
			wordList.clear();			
		}
	}
		