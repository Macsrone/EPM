package lekser9;

public class Q10 {

	public static void main(String[] args) {
		String input = "craig_federighi@apple.com";

		System.out.println("First name: " + input.substring(0, 1).toUpperCase()+input.substring(1, input.indexOf("_")));
		
		System.out.println("Last name: " + input.substring(input.indexOf("_")+1, input.indexOf("_")+2).toUpperCase() + input.substring(input.indexOf("_")+2, input.indexOf("@") )  );
		
		System.out.println("Domain: " + input.substring(input.indexOf("@")+1, input.indexOf(".")));
		
		System.out.println("Top-Level Domain: " + input.substring(input.indexOf(".")+1));
		}
	}
