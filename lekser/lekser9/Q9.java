package lekser9;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "mike_tyson@gmail.com";
	  
	if (input.contains("_")) {
			String name = input.substring(0, input.indexOf("_"));
			String surname = input.substring(input.indexOf("_")+1, input.indexOf("@"));
			System.out.println(surname + "_" + name + input.substring( input.indexOf("@")) );
		}
		else {
			System.out.println(input);
		}
		}
	}
