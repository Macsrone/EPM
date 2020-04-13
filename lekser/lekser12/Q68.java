package lekser12;

import java.util.Arrays;

public class Q68 {

		public static void main(String[] args) {
			
			int addElements [] = {10, 40, 50, 3, 1};
			int elements [] = {11, 0, 500, 44, 1101};


			System.out.println(Arrays.toString(sumOfTwo(addElements,elements)));
	}

		public static int[] sumOfTwo(int[] addElements, int[] elements) {
			int arrAdding [] = new int [5];

			for (int i = 0; i < arrAdding.length; i++) {
				arrAdding[i] = addElements[i] + elements[i];
			}
			

			
			return arrAdding;
			
		}


	}