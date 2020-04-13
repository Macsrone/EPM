package lekser11;

public class Q38 {

	public static void main(String[] args) {

		int nums [] = {2, 1, 4, 6, 3};
		int counter=0;
		for (int i = 0; i <nums.length; i++) {
			if (nums[i]%2==0) {
				counter++;
			}
		}
		System.out.println(counter);	
	}

}
