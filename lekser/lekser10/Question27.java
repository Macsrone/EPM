package lekser10;

public class Question27 {

	public static void main(String[] args) {

	System.out.println(coverString("galatasaray", "a"));
			
	}

	public static String coverString(String word, String coverME) {
		
		String protectWord="";
		String outPut="";
		for (int i = 0; i <word.length(); i++) {
			
		
		if(word.indexOf(coverME)==i) {
			protectWord=word.substring(i, i+coverME.length()).replace(coverME, "["+coverME+"]");
				
		}
		outPut= word.replaceAll(coverME, protectWord);
	}
		
		

		
	return outPut;
}
}
