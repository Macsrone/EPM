package lekser10;

public class Question19 {

	public static void main(String[] args) {

		String input = "hellojava22java22hello";
		
		int index = 0;
		
		int counter=0;
		
		while (!(input.indexOf("java", index) == -1)) {
		
			index = (input.indexOf("java", index)+1);
		
			counter++;
	}
		System.out.println(counter);
	}

}