package lekser9;

public class Q13 {

	public static void main(String[] args) {

		
		String squence ="ABCDABC";
		
		String[] navigation = {"right", "down","left","up","right", "down","left"};
		
		String input = "A";
		String output = "C";
		
		int inputIndex = squence.indexOf(input);
		int outputIndex = squence.indexOf(output,inputIndex);
		
		for (int i = inputIndex; i < outputIndex; i++) {
			
			System.out.print(navigation[i]+" > ");
			
		}
			System.out.println( " "+  output  +  " found" );		
	}

}
