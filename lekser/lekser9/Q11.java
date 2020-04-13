package lekser9;

public class Q11 {

	public static void main(String[] args) {
	
		String input = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}";
		showDetails(input);

	}
	public static void showDetails(String input) {
		String Sender = input.substring(input.indexOf("<")+1, input.indexOf(">"));
		String Number = input.substring(input.indexOf("[")+1, input.indexOf("]"));
		String Message = input.substring(input.indexOf("{")+1, input.indexOf("}"));
		System.out.println("Sender: " + Sender );
		System.out.println("Phone Number: " + Number );
		System.out.println("Message body: " + Message );
	}
	}
