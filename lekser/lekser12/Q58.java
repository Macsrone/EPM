package lekser12;

import java.util.Arrays;

public class Q58 {

	public static void main(String[] args) {
		int [][] output = {   {1,2,3}, {5,33,9}  };
		 int maximum = output[0][0];
		
		for (int i = 0; i < output.length; i++) {
			for (int j = 0; j <output[0].length; j++) {
				if (maximum < output[i][j]) {
					maximum = output[i][j];
				}
			}
		}
		for (int i = 0; i < output.length; i++) {
			for (int j = 0; j <output[0].length; j++) {
		
				output[i][j]=	maximum  ;
				
			}
		}
		System.out.println(Arrays.deepToString(output));
		
	}

}
