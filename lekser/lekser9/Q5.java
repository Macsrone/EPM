package lekser9;

public class Q5 {

	public static void main(String[] args) {

		String word1 = "trb";
		String word2 = "uai";
		String result = null;
		
		if (word1.length()==3 && word2.length()==3) {
			for (int i = 0; i < word1.length(); i++) {
				result = " " + word1.charAt(i)+ word2.charAt(i);
				result = result.trim();
				System.out.print(result);
			}
			
		}
		else {
			System.out.println("cannot merge");
		}
	}



}
