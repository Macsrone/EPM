package lekser10;

public class Question23 {

	public static void main(String[] args) {
		String bread="xxbreadjamkdhldbrdyybread";
		String word="bread";
		int first=bread.indexOf(word);
		int last=bread.lastIndexOf(word);
		
		if(bread.indexOf(word, first+1)>-1) {
			System.out.println(bread.substring(first+word.length(), last));
		}else {
			System.out.println("Nothing");
		}
	
	}
	
	
}
