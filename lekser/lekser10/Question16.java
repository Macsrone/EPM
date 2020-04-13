package lekser10;

public class Question16 {

	public static void main(String[] args) {
		
		
		javaString("cjavaxx");
		
		javaString("c#java");
		
		javaString("javapython");
		
	}

	public static String javaString(String word) {
		
		if ((word.charAt(0)=='j' | word.charAt(1)=='j'))  {
			
			System.out.println(true);
			
		}else {
			System.out.println(false);
		}
		return word;	
	}

}
