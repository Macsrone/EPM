package lekser9;

public class Q15 {

	public static void main(String[] args) {
		
		String input = "dog-cat";
		int index = input .indexOf("cat");
		int count1 = 0;
		int count2 = 0;
		while (index != -1) {
		    count1++;
		    input = input.substring(index + 1);
		    index = input.indexOf("cat");
		}
		index = input .indexOf("dog");
		while (index != -1) {
		    count2++;
		    input = input.substring(index + 1);
		    index = input.indexOf("dog");
		}
		if (count1 == count2){
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}
	}