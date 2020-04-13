package lekser12;

import java.util.Arrays;

public class Q59 {

	public static void main(String[] args) {

		int[] arr1 = {0,2,4,6};
		int[] arr2 = {8,10,12};
		System.out.println(Arrays.toString(mergR(arr1,arr2)));


		
	}
       
	public static int[]  mergR (int[] arr1,int[] arr2) {
		int [] merge = new int [ arr1.length+arr2.length  ];
		
		for (int i = 0; i < arr1.length; i++) {
			merge  [i]= arr1 [i];
		}
		int j = 0;
		for (int i =  arr1.length; i < merge.length; i++) {
		
			merge  [i] = arr2 [j];
			j++;
		}
		return merge;
	}

}
