package lekser11;

public class Q37 {

	public static void main(String[] args) {

		String  words[] = {"hello", "why", "by", "apple" , "note"};
		int i = 0;
		System.out.print("[");
		for (i = 0; i < words.length-1; i++) {
			System.out.print( ""+words[i].charAt(0)  +  words[i].charAt(  words[i].length()-1 )+", " );
		}
		System.out.print( ""+words[i].charAt(0)  +  words[i].charAt(  words[i].length()-1 )+"]" );
		}

	}


