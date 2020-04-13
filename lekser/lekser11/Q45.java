package lekser11;

public class Q45 {

	public static void main(String[] args) {

		String [] words={ "hey","er", "byte", "furey", "spoon"};
		String shortestStr= words[0];
		
		for (int i = 0; i < words.length; i++) {
			if (shortestStr.length() > words[i].length()) {	
				shortestStr=words[i];
				
			}
			
		}
		System.out.println(shortestStr);
	}

}
