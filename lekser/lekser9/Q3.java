package lekser9;

public class Q3 {

	public static void main(String[] args) {

	middleChar("haloje");
		
	}

	public static void middleChar(String word) {
		int moreChar= word.length()/2;
		if (word.length()==1) {
			System.out.println(word+word+word);
		}else if (word.length()==2) {
			System.out.println(word+word);
		}else if (word.length()%2==1) {
			System.out.println(word.substring(moreChar, moreChar+1));
		}else if (word.length()%2==0) {
			System.out.println(word.substring(moreChar-1, moreChar+1));
		} 
		
		
	}
}
