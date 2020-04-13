package lekser12;

import java.util.Arrays;

public class Q56 {

	public static void main(String[] args) {	
		int [] arr = {6, 2, 5, 3};
		int [] output = new int [arr.length];
		for (int i = 0; i < output.length; i++) {
			 if (  i == output.length-1  ) {
				 output [i] = arr [0] ;
				 break;
			}
			 output [i] = arr [i+1] ;
		}
		System.out.println(Arrays.toString(output));
	}

}
