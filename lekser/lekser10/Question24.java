package lekser10;

public class Question24 {

	public static void main(String[] args) {

		compareTo("java greater than python");
		compareTo("What's the difference between java, javascript and Python?");
	}
	public static void compareTo(String str) {
			
		int counterJava   = 0;
		int counterPython = 0;
		
		for (int i = 0; i <str.length()-3; i++) {
			if(str.substring(i, i+4).equalsIgnoreCase("java")) {
				counterJava++;
			}
		}System.out.print("java: "+counterJava);
		for (int i = 0; i <str.length()-5; i++) {
			if(str.substring(i, i+6).equalsIgnoreCase("python")) {
				counterPython++;
			}
		}
		System.out.println(" python: "+counterPython);
		if (counterJava==counterPython) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
