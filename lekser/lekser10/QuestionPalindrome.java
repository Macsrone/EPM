package lekser10;

public class QuestionPalindrome {

	public static void main(String[] args) {
		boolean isPal=isPalindrome("Nurses Run");
		  System.out.println(isPal);
	}

	public static boolean isPalindrome(String str) {
		String s1="";
		String s2="";
		str=str.replace(" ", "");
		for(int i=0;i<str.length();i++) {
			s1+=str.charAt(i);
		}
		for(int i=str.length()-1;i>=0;i--) {
			s2+=str.charAt(i);
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			return true;
		}else {
			return false;
		}
		
	}
		
	}

