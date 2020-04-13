package lekser12;

import java.util.Arrays;

public class Q52 {

	public static void main(String[] args) {

		int [][] array2d= {{2,2,1,3,4,5},{5,2,3,3,4,5},{3,1,2,4,4,5}};
		
		int counter=0;
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length-1; j++) {
				if (array2d[i][j]==array2d[i][j+1]) {
					counter++;
					System.out.println(array2d[i][j]+"--"+array2d[i][j+1]);
				}
			}
		}
		System.out.println("matches:"+counter);	
		}
	}


