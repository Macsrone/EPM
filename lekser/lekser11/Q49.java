package lekser11;

import java.util.*;

public class Q49 {

	public static void main(String[] args) {
		
		
		int array []= {1,3,4,5,6};
		
		ArrayList<Integer> first2 = new ArrayList<Integer>();
		
		for (int i = 0; i <2; i++) {
			if (array.length<2) {
				first2.add(array[i]);
				break;
			}else {
			first2.add(array[i]);
			
			}
		}
		
		System.out.println(first2);
		
	}

	}


