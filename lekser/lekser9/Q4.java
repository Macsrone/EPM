package lekser9;

public class Q4 {

		public static void main(String[] args) {
			
			String word = "tavan12";
			System.out.println("Result is : " + StringManipulation(word));
		}

		public static String StringManipulation(String word) {

			if (word.length()>=5 &&  word.length()%2 ==1 ) {
				return " " + word.charAt(word.length()/2-1) + word.charAt(word.length()/2) + word.charAt(word.length()/2+1) ;
			}
		
			else 
				return "Invalid";
		
		}

	}
